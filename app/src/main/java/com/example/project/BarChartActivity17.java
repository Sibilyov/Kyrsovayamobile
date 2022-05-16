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

public class BarChartActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart17);
        BarChart barChart = findViewById(R.id.barChart17);
        ArrayList<BarEntry> l = new ArrayList<>();
        l.add(new BarEntry(2015, 12));
        l.add(new BarEntry(2016, 7));
        l.add(new BarEntry(2017, 5));
        l.add(new BarEntry(2018, 5));
        l.add(new BarEntry(2019, 4));
        l.add(new BarEntry(2020, 8));
        l.add(new BarEntry(2021, 3));

        BarDataSet barDataSet = new BarDataSet( l, "Показатель(млн)");
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