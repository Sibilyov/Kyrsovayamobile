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

public class BarChartActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart12);
        BarChart barChart = findViewById(R.id.barChart12);
        ArrayList<BarEntry> i = new ArrayList<>();
        i.add(new BarEntry(2015, 11));
        i.add(new BarEntry(2016, 12));
        i.add(new BarEntry(2017, 14));
        i.add(new BarEntry(2018, 15));
        i.add(new BarEntry(2019, 18));
        i.add(new BarEntry(2020, 30));
        i.add(new BarEntry(2021, 20));

        BarDataSet barDataSet = new BarDataSet( i, "Показатель (мин)");
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