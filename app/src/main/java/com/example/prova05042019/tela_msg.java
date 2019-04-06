package com.example.prova05042019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tela_msg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_msg);

        Button btn_fecha = (Button) findViewById(R.id.btn_fecha);
        TextView txt_msg = (TextView) findViewById(R.id.txt_msg);



        btn_fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
