package com.example.loginup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etusr;
    EditText etpass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusr=findViewById(R.id.et1);
        etpass=findViewById(R.id.et2);
        btnlogin=findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etusr.getText().toString().isEmpty()&&(etpass.getText().toString().isEmpty())){
                    Toast.makeText(MainActivity.this, "Mohon Jangan Dikosongi", Toast.LENGTH_SHORT).show();
                }
                     else if (etusr.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this,"Username Harap di Isi", Toast.LENGTH_SHORT).show();
                    }

                    else if (etpass.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this,"Password Harap di Isi", Toast.LENGTH_SHORT).show();
                    }

                    else if (etusr.getText().toString().equals("ari") &&
                            (etpass.getText().toString().equals("ari"))){
                        Toast.makeText(MainActivity.this, "Login sukses", Toast.LENGTH_SHORT).show();


                    } else {
                        Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                    }
                }
        });
    }
}
