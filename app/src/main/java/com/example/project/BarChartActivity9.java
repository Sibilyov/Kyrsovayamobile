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

public class BarChartActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart9);
        BarChart barChart = findViewById(R.id.barChart9);
        ArrayList<BarEntry> w = new ArrayList<>();
        w.add(new BarEntry(2015, 42));
        w.add(new BarEntry(2016, 43));
        w.add(new BarEntry(2017, 45));
        w.add(new BarEntry(2018, 46));
        w.add(new BarEntry(2019, 50));
        w.add(new BarEntry(2020, 55));
        w.add(new BarEntry(2021, 47));

        BarDataSet barDataSet = new BarDataSet( w, "Показатель (мин)");
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