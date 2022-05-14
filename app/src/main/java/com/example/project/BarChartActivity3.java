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

public class BarChartActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart3);
        BarChart barChart = findViewById(R.id.barChart3);
        ArrayList<BarEntry> t = new ArrayList<>();
        t.add(new BarEntry(2015, 19));
        t.add(new BarEntry(2016, 21));
        t.add(new BarEntry(2017, 22));
        t.add(new BarEntry(2018, 23));
        t.add(new BarEntry(2019, 25));
        t.add(new BarEntry(2020, 28));
        t.add(new BarEntry(2021, 26));

        BarDataSet barDataSet = new BarDataSet( t, "Показатель (мин)");
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