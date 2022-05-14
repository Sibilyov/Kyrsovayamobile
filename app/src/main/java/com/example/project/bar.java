package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        findViewById(R.id.buttonPieChart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity.class));
            }
        });

        findViewById(R.id.buttonPieChart2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity2.class));
            }
        });


        findViewById(R.id.buttonPieChart3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity3.class));
            }
        });
        findViewById(R.id.buttonPieChart4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity4.class));
            }
        });

        findViewById(R.id.buttonPieChart5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity5.class));
            }
        });


        findViewById(R.id.buttonPieChart6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity6.class));
            }
        });

        findViewById(R.id.buttonPieChart7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity7.class));
            }
        });
    }
}