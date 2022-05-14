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

public class BarChartActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart14);
        BarChart barChart = findViewById(R.id.barChart14);
        ArrayList<BarEntry> p = new ArrayList<>();
        p.add(new BarEntry(2015, 38));
        p.add(new BarEntry(2016, 39));
        p.add(new BarEntry(2017, 42));
        p.add(new BarEntry(2018, 47));
        p.add(new BarEntry(2019, 50));
        p.add(new BarEntry(2020, 60));
        p.add(new BarEntry(2021, 63));

        BarDataSet barDataSet = new BarDataSet( p, "Показатель(млн)");
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