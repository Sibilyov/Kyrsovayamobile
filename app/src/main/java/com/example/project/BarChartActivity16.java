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

public class BarChartActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart16);
        BarChart barChart = findViewById(R.id.barChart16);
        ArrayList<BarEntry> n = new ArrayList<>();
        n.add(new BarEntry(2015, 5));
        n.add(new BarEntry(2016, 4));
        n.add(new BarEntry(2017, 2));
        n.add(new BarEntry(2018, 1));
        n.add(new BarEntry(2019, 2));
        n.add(new BarEntry(2020, 3));
        n.add(new BarEntry(2021, 1));

        BarDataSet barDataSet = new BarDataSet( n, "Показатель(млн)");
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