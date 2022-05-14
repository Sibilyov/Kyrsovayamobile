package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class barrr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrr);

        findViewById(R.id.buttonPieChart15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity15.class));
            }
        });

        findViewById(R.id.buttonPieChart16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity16.class));
            }
        });


        findViewById(R.id.buttonPieChart17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity17.class));
            }
        });
        findViewById(R.id.buttonPieChart18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity18.class));
            }
        });

        findViewById(R.id.buttonPieChart19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity19.class));
            }
        });


        findViewById(R.id.buttonPieChart20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity20.class));
            }
        });

        findViewById(R.id.buttonPieChart21).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity21.class));
            }
        });
    }
}