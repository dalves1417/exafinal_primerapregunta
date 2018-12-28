package com.example.primerapregunta;

import com.example.primerapregunta.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText valor1;
	private EditText valor2;
	private EditText valor3;
	private TextView valor4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=(EditText)findViewById(R.id.editText1);
        valor2=(EditText)findViewById(R.id.editText2);
        valor3=(EditText)findViewById(R.id.editText3);
        valor4=(TextView)findViewById(R.id.textView2);
    }
    public void multiplicar(View view){
    	String campo_espera1= valor1.getText().toString();
    	String campo_espera2= valor2.getText().toString();
    	String campo_espera3= valor3.getText().toString();
    	
    	int campo1_convertidor= Integer.parseInt(campo_espera1);
    	int campo2_convertidor= Integer.parseInt(campo_espera2);
    	int campo3_convertidor= Integer.parseInt(campo_espera3);
    	
    	Double multitotal= (double)(campo1_convertidor*campo2_convertidor*campo3_convertidor);
    	
    	String multiconvertidorstring=String.valueOf(multitotal);
    	valor4.setText(multiconvertidorstring);
    }
    public void clear(View view){
    	valor1.setText("  ");
    	valor2.setText("  ");
    	valor3.setText("  ");
    	valor4.setText("  ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
