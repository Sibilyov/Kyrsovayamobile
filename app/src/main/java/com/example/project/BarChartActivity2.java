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

public class BarChartActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart2);

        BarChart barChart = findViewById(R.id.barChart2);
        ArrayList<BarEntry> information = new ArrayList<>();
        information.add(new BarEntry(2015, 60));
        information.add(new BarEntry(2016, 62));
        information.add(new BarEntry(2017, 65));
        information.add(new BarEntry(2018, 68));
        information.add(new BarEntry(2019, 69));
        information.add(new BarEntry(2020, 70));
        information.add(new BarEntry(2021, 72));

        BarDataSet barDataSet = new BarDataSet( information,"Показатель(млн)");
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