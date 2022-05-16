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

public class BarChartActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart7);
        BarChart barChart = findViewById(R.id.barChart7);
        ArrayList<BarEntry> u = new ArrayList<>();
        u.add(new BarEntry(2015, 2));
        u.add(new BarEntry(2016, 3));
        u.add(new BarEntry(2017, 3));
        u.add(new BarEntry(2018, 4));
        u.add(new BarEntry(2019, 6));
        u.add(new BarEntry(2020, 13));
        u.add(new BarEntry(2021, 11));

        BarDataSet barDataSet = new BarDataSet( u, "Показатель(млн)");
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