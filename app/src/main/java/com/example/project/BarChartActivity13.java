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

public class BarChartActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart13);
        BarChart barChart = findViewById(R.id.barChart13);
        ArrayList<BarEntry> o = new ArrayList<>();
        o.add(new BarEntry(2015, 23));
        o.add(new BarEntry(2016, 26));
        o.add(new BarEntry(2017, 27));
        o.add(new BarEntry(2018, 30));
        o.add(new BarEntry(2019, 32));
        o.add(new BarEntry(2020, 40));
        o.add(new BarEntry(2021, 33));

        BarDataSet barDataSet = new BarDataSet( o, "Показатель(млн)");
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