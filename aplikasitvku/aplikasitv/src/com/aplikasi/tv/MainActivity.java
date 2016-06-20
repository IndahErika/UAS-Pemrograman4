package com.aplikasi.aplikasitv; // sesuainama package yang dibuat
import com.aplikasi.aplikasitv.DaftarSenin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);// namahalaman .xml yang akandibuatkanaksinya

		Button Senin= (Button)findViewById(R.id.buttonSenin);
// makan = nama variable baruuntuk button “Makanan” padaacivity_main
// buttonMakan = nama id button “Makanan” padaactivity_main (dapatdiketahuidenganklikkananpadagambar button pilih id blabla)
				
		senin.setOnClickListener(new View.OnClickListener() { // sesuaikandengannama variable yang dibuatsebelumnyadiatas
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, DaftarSenin.class);// nama class yang ditujusaatmenekantombol
				i.putExtra("lihat", "Dari Main Activity");
				startActivity(i);
			}
		});
    }
    @Override
    public booleanonCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

