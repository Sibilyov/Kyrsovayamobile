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

public class BarChartActivity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart15);
        BarChart barChart = findViewById(R.id.barChart15);
        ArrayList<BarEntry> v = new ArrayList<>();
        v.add(new BarEntry(2015, 31));
        v.add(new BarEntry(2016, 32));
        v.add(new BarEntry(2017, 33));
        v.add(new BarEntry(2018, 37));
        v.add(new BarEntry(2019, 35));
        v.add(new BarEntry(2020, 40));
        v.add(new BarEntry(2021, 38));

        BarDataSet barDataSet = new BarDataSet( v, "Показатель (мин)");
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