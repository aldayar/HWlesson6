package com.example.hwlesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn2= findViewById(R.id.helper);
        Button btn= findViewById(R.id.btn);
        TextView textView4= findViewById(R.id.help);
        TextView textView3=findViewById(R.id.enter);
        TextView textView2= findViewById(R.id.forgotPass);
        TextView textView =findViewById(R.id.string2);
        EditText editText1 = findViewById(R.id.edit_text);
        EditText editText2= findViewById(R.id.edit_text2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText1.getText() .toString().equals("admin") && editText2.getText().toString().
                        equals("admin")){
                    btn.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);
                    textView4.setVisibility(View.GONE);
                    editText1.setVisibility(View.GONE);
                    editText2.setVisibility(View.GONE);
                }else {
                    Toast.makeText(MainActivity.this,"Неправилный пароль или логин, нажмите {ПООМОЩЬ} если не помните пароль ",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Логин: [admin] Пароль: [admin]",
                        Toast.LENGTH_LONG).show();
            }
        });









    }
}