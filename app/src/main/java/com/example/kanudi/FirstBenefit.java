package com.example.kanudi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstBenefit extends AppCompatActivity {

    Button btn1_next;
    TextView txt_skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_benefit);
        btn1_next = findViewById(R.id.btn_Next);
        txt_skip = findViewById(R.id.txt_Skip);

        btn1_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstBenefit.this, SecondBenefits.class);
                startActivity(intent);
            }
        });

        txt_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstBenefit.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}