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

public class PieChartActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart6);
        PieChart pieChart = findViewById(R.id.pieChart6);

        ArrayList<PieEntry> rt = new ArrayList<>();
        rt.add(new PieEntry(45, "vk"));
        rt.add(new PieEntry(28, "instagram"));
        rt.add(new PieEntry(55, "facebook"));
        rt.add(new PieEntry(32, "telegram"));
        rt.add(new PieEntry(40, "twiter"));
        rt.add(new PieEntry(30, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rt, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}