package com.example.juancollivadino.ingresodatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/*
    TextView contacto = (TextView)findViewById(R.id.usernameWrapper);
    TextView telefono = (TextView)findViewById(R.id.ma_Telefono);
    TextView cumple = (TextView)findViewById(R.id.ma_cumple);
    TextView email = (TextView)findViewById(R.id.ma_email);
    TextView descripcion = (TextView)findViewById(R.id.ma_descripcion);
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*
*/

        Button  btConfirma  = (Button)findViewById(R.id.btn);

        btConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intento  = new Intent (MainActivity.this, DataConfirm.class);

              Bundle bolsa_e =  new Bundle();

                TextView contacto = (TextView)findViewById(R.id.ma_contacto);
                TextView telefono = (TextView)findViewById(R.id.ma_Telefono);
                TextView cumple = (TextView)findViewById(R.id.ma_cumple);
                TextView email = (TextView)findViewById(R.id.ma_email);
                TextView descripcion = (TextView)findViewById(R.id.ma_descripcion);



                bolsa_e.putString("string_key_1",contacto.getText().toString());
                bolsa_e.putString("string_key_2",telefono.getText().toString());
                bolsa_e.putString("string_key_3",cumple.getText().toString());
                bolsa_e.putString("string_key_4",email.getText().toString());
                bolsa_e.putString("string_key_5",descripcion.getText().toString());


                intento.putExtras(bolsa_e);

/*
*/
                startActivity(intento);
                finish();
            }
        });
    }
}

// TODO
//   intento.putExtra(getResources().getString(R.string.mb_telefono), telefono.getText());
//  intento.putExtra(getResources().getString(R.string.mb_cumple), cumple.getText());
//   intento.putExtra(getResources().getString(R.string.mb_email), email.getText());
//   intento.putExtra(getResources().getString(R.string.mb_descripcion), descripcion.getText());