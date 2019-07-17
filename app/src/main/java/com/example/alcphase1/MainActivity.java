package com.example.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_One, btn_Two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_One = findViewById(R.id.btn_one);
        btn_Two = findViewById(R.id.btn_two);


        btnOne();
        btnTwo();

    }

    public void btnOne(){
        btn_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity_Web.class);
                startActivity(i);

            }
        });


    }

    public void btnTwo(){
        btn_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, Activity_Profile.class);
                startActivity(j);
            }
        });

    }
}
