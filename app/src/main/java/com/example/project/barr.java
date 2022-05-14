package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class barr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barr);

        findViewById(R.id.buttonPieChart8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity8.class));
            }
        });

        findViewById(R.id.buttonPieChart9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity9.class));
            }
        });


        findViewById(R.id.buttonPieChart10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity10.class));
            }
        });
        findViewById(R.id.buttonPieChart11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity11.class));
            }
        });

        findViewById(R.id.buttonPieChart12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity12.class));
            }
        });


        findViewById(R.id.buttonPieChart13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity13.class));
            }
        });

        findViewById(R.id.buttonPieChart14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity14.class));
            }
        });
    }
}