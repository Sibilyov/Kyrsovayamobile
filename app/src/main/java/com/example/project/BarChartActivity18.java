package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart18);
        BarChart barChart = findViewById(R.id.barChart18);
        ArrayList<BarEntry> inf = new ArrayList<>();
        inf.add(new BarEntry(2015, 32));
        inf.add(new BarEntry(2016, 33));
        inf.add(new BarEntry(2017, 36));
        inf.add(new BarEntry(2018, 38));
        inf.add(new BarEntry(2019, 39));
        inf.add(new BarEntry(2020, 43));
        inf.add(new BarEntry(2021, 47));

        BarDataSet barDataSet = new BarDataSet(inf, "Показатель(млн)");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Bar Chart");
        barChart.animateY(2000);

    }
}

