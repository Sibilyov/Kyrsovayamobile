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

public class BarChartActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart11);
        BarChart barChart = findViewById(R.id.barChart11);
        ArrayList<BarEntry> r = new ArrayList<>();
        r.add(new BarEntry(2015, 10));
        r.add(new BarEntry(2016, 8));
        r.add(new BarEntry(2017, 7));
        r.add(new BarEntry(2018, 6));
        r.add(new BarEntry(2019, 7));
        r.add(new BarEntry(2020, 10));
        r.add(new BarEntry(2021, 6));

        BarDataSet barDataSet = new BarDataSet( r, "Показатель(млн)");
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