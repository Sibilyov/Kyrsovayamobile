package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart18);
        PieChart pieChart = findViewById(R.id.pieChart18);

        ArrayList<PieEntry> rx = new ArrayList<>();
        rx.add(new PieEntry(68, "vk"));
        rx.add(new PieEntry(48, "instagram"));
        rx.add(new PieEntry(6, "facebook"));
        rx.add(new PieEntry(10, "telegram"));
        rx.add(new PieEntry(5, "twiter"));
        rx.add(new PieEntry(47, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rx, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}