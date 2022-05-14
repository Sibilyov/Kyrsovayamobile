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

public class BarChartActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart6);
        BarChart barChart = findViewById(R.id.barChart6);
        ArrayList<BarEntry> b = new ArrayList<>();
        b.add(new BarEntry(2015, 17));
        b.add(new BarEntry(2016, 19));
        b.add(new BarEntry(2017, 21));
        b.add(new BarEntry(2018, 23));
        b.add(new BarEntry(2019, 24));
        b.add(new BarEntry(2020, 32));
        b.add(new BarEntry(2021, 30));

        BarDataSet barDataSet = new BarDataSet( b, "Показатель (мин)");
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