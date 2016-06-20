<?php
include "koneksi.php";
 
$nama	 = $_GET["nama"];
$password = $_GET["password"];
 
$query = "select * from user where nama='$nama' and password='$password' ";
 
$hasil = mysql_query($query);
if (mysql_num_rows($hasil) > 0) {
$response = array();
$response["login"] = array();
while ($data = mysql_fetch_array($hasil))
{
$h['id_user']    		= $data['id_user'] ;
$h['email']       		  = $data['email'] ;
$h['nama']  			= $data['nama'] ;
$h['password']      	= $data['password'];
 
 array_push($response["login"], $h);
}
    $response["success"] = "1";
    echo json_encode($response);
}
else {
    $response["success"] = "0";
    $response["message"] = "Tidak ada data";
    echo json_encode($response);
}
?>
