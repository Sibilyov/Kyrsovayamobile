package com.example.project;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart barChart = findViewById(R.id.barChart);
        ArrayList<BarEntry> visitors = new ArrayList<>();
        visitors.add(new BarEntry(2015, 30));
        visitors.add(new BarEntry(2016, 32));
        visitors.add(new BarEntry(2017, 33));
        visitors.add(new BarEntry(2018, 34));
        visitors.add(new BarEntry(2019, 37));
        visitors.add(new BarEntry(2020, 45));
        visitors.add(new BarEntry(2021, 40));


        BarDataSet barDataSet = new BarDataSet(visitors,"Показатель (млн)");

       

        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart ");
        barChart.animateY(2000);



    }
}
