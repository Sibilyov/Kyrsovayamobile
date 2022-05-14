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

public class PieChartActivity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart15);

        PieChart pieChart = findViewById(R.id.pieChart15);

        ArrayList<PieEntry> rk = new ArrayList<>();
        rk.add(new PieEntry(60, "vk"));
        rk.add(new PieEntry(35, "instagram"));
        rk.add(new PieEntry(10, "facebook"));
        rk.add(new PieEntry(7, "telegram"));
        rk.add(new PieEntry(12, "twiter"));
        rk.add(new PieEntry(38, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rk, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}