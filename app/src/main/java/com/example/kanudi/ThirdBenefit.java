package com.example.kanudi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdBenefit extends AppCompatActivity {

    Button btn3_Next, btn3_Previous;
    TextView txt3_Skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_benefit);
        btn3_Next = findViewById(R.id.btn3_Next);
        btn3_Previous = findViewById(R.id.btn3_Previous);

        txt3_Skip = findViewById(R.id.txt3_Skip);

        btn3_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdBenefit.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn3_Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdBenefit.this, SecondBenefits.class);
                startActivity(intent);
                finish();
            }
        });

        txt3_Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdBenefit.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}