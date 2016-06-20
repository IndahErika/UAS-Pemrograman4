<?php

$email = $_POST['email']; 
$nama = $_POST['nama'];
$password=$_POST['password'];
 
include "koneksi.php";
 
$query = "INSERT INTO user (email,nama,password)VALUES('$email','$nama','$password')";
$hasil = mysql_query($query);
if($hasil)
    {
    $response["success"] = "1";
        $response["message"] = "Data sukses diinput";
        echo json_encode($response);
    }
    else
    {$response["success"] = "0";
     $response["message"] = "Maaf , terjadi kesalahan";
 
        // echoing JSON response
        echo json_encode($response);
    }
?>