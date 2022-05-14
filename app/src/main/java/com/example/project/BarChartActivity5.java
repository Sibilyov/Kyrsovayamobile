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

public class BarChartActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart5);
        BarChart barChart = findViewById(R.id.barChart5);
        ArrayList<BarEntry> a = new ArrayList<>();
        a.add(new BarEntry(2015,35));
        a.add(new BarEntry(2016,39));
        a.add(new BarEntry(2017,44));
        a.add(new BarEntry(2018,48));
        a.add(new BarEntry(2019,52));
        a.add(new BarEntry(2020,60));
        a.add(new BarEntry(2021,56));

        BarDataSet barDataSet = new BarDataSet( a, "Показатель(млн)");
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