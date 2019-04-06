package com.example.prova05042019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_ok = (Button) findViewById(R.id.btn_ok);
        Button btn_cancela = (Button) findViewById(R.id.btn_cancela);
        final TextView edt_usuario = (TextView) findViewById(R.id.edt_usuario);
        final TextView edt_senha = (TextView) findViewById(R.id.edt_senha);
        final TextView txt_erro = (TextView) findViewById(R.id.txt_erro);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user,senha;

                Intent it;
                it = new Intent(getApplicationContext(),tela_msg.class);

                user = edt_usuario.getText().toString();
                senha = edt_senha.getText().toString();

                if(user.equals("Marcos")) {
                    if (senha.equals("123456")) {
                        startActivity(it);
                        finish();
                    } else {
                        edt_senha.setError("Senha Errada!");
                        Toast t;
                        t = (Toast) Toast.makeText(getApplicationContext(), "Senha incorretos!", Toast.LENGTH_LONG);
                        t.show();
                    }
                }else {
                    edt_usuario.setError("Login Errado!");
                    Toast t;
                    t = (Toast) Toast.makeText(getApplicationContext(), "Login incorretos!", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });

        btn_cancela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
