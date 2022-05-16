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

public class BarChartActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart4);
        BarChart barChart = findViewById(R.id.barChart4);
        ArrayList<BarEntry> x = new ArrayList<>();
        x.add(new BarEntry(2015, 23));
        x.add(new BarEntry(2016, 26));
        x.add(new BarEntry(2017, 28));
        x.add(new BarEntry(2018, 30));
        x.add(new BarEntry(2019, 31));
        x.add(new BarEntry(2020, 42));
        x.add(new BarEntry(2021, 38));

        BarDataSet barDataSet = new BarDataSet( x, "Показатель(млн)");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart");
        barChart.animateY(2000);

    }
}