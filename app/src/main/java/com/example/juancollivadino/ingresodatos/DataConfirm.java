package com.example.juancollivadino.ingresodatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_confirm);


        TextView  tv_nombre_data  = (TextView) findViewById(R.id.cd_nombre_data);
        TextView  dc_telefono  = (TextView) findViewById(R.id.cd_telefono_data);
        TextView  dc_cumple   = (TextView) findViewById(R.id.cd_nacimiento_data);
        TextView  dc_email   = (TextView) findViewById(R.id.cd_email_data);
        TextView  dc_descripcion  = (TextView) findViewById(R.id.cd_Descripcion_data);

     Bundle  bolsa_R = getIntent().getExtras();

        tv_nombre_data.setText(bolsa_R.getString("string_key_1"));
        dc_telefono.setText(bolsa_R.getString("string_key_2"));
        dc_cumple.setText(bolsa_R.getString("string_key_3"));
        dc_email.setText(bolsa_R.getString("string_key_4"));
        dc_descripcion.setText(bolsa_R.getString("string_key_5"));
  /*
*/
        //  control de retorno
        Button btRetorno  = (Button)findViewById(R.id.cd_editar);


        btRetorno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento  = new Intent (DataConfirm.this, MainActivity.class);


                 // intento.putExtra(getResources().getString(R.string.mb_contacto), contacto.getText());
                //   intento.putExtra(getResources().getString(R.string.mb_telefono), telefono.getText());
                //  intento.putExtra(getResources().getString(R.string.mb_cumple), cumple.getText());
                //   intento.putExtra(getResources().getString(R.string.mb_email), email.getText());
                //   intento.putExtra(getResources().getString(R.string.mb_descripcion), descripcion.getText());



                startActivity(intento);
                finish();
            }


        });

       /*/ Bundle mailbBox = getIntent().getExtras();

      String contacto = mailbBox.getString(getResources().getString(R.string.mb_contacto));
       String telefono = mailbBox.getString(getResources().getString(R.string.mb_telefono));
     String cumple = mailbBox.getString(getResources().getString(R.string.mb_cumple));
       String email = mailbBox.getString(getResources().getString(R.string.mb_email));
      String descripcion = mailbBox.getString(getResources().getString(R.string.mb_descripcion));

        TextView  dc_contacto  = (TextView) findViewById(R.id.cd_nombre_data);
         dc_contacto.setText(contacto);
       TextView  dc_telefono  = (TextView) findViewById(R.id.cd_telefono_data);
       dc_contacto.setText(telefono);
        TextView  dc_cumple   = (TextView) findViewById(R.id.cd_nacimiento_data);
        dc_cumple.setText(telefono);
        TextView  dc_email   = (TextView) findViewById(R.id.cd_email_data);
        dc_email.setText(telefono);
        TextView  dc_descripcion  = (TextView) findViewById(R.id.cd_Descripcion_data);
        dc_descripcion.setText(telefono);
*/
    }
}


// dir
// TODO  boton y terminar con Bundle