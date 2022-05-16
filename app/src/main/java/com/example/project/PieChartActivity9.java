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

public class PieChartActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart9);
        PieChart pieChart = findViewById(R.id.pieChart9);

        ArrayList<PieEntry> ra = new ArrayList<>();
        ra.add(new PieEntry(33, "vk"));
        ra.add(new PieEntry(26, "instagram"));
        ra.add(new PieEntry(2, "facebook"));
        ra.add(new PieEntry(3, "telegram"));
        ra.add(new PieEntry(4, "twiter"));
        ra.add(new PieEntry(26, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(ra, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}