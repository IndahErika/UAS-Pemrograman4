package com.aplikasitv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class DaftarSenin extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fr_senin);// nama .xml yang tadidibuat
		
		TextViewtxtAcara = (TextView)findViewById(R.id.textAcara);
// txtMakanan = nama variable baru
// textMakanan = nama id text yang terdapatpada fr_makanan.xml (caramengetahui id samasepertisebelumnya)

		Button seninButton = (Button)findViewById(R.id.buttonKembali);
 // makan = nama variable baru
// buttonKembali = id button “back” yang adapada fr_makanan.xml
		
		//menerima intent yang dikirim
		Intent i = this.getIntent();
		txtAcara.setText("Daftar Acara "+i.getStringExtra("lihat"));
		
		senin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
}
