package com.example.kanudi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondBenefits extends AppCompatActivity {

    Button btn2_Next, btn2_Previous;
    TextView txt2_Skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_benefits);

        btn2_Next = findViewById(R.id.btn2_Next);
        btn2_Previous = findViewById(R.id.btn2_Previous);

        txt2_Skip = findViewById(R.id.txt2_Skip);

        btn2_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondBenefits.this, ThirdBenefit.class);
                startActivity(intent);
                finish();
            }
        });

        btn2_Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondBenefits.this, FirstBenefit.class);
                startActivity(intent);
                finish();
            }
        });

        txt2_Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondBenefits.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}