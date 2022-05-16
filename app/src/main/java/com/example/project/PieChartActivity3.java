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

public class PieChartActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart3);
        PieChart pieChart = findViewById(R.id.pieChart3);

        ArrayList<PieEntry> rw = new ArrayList<>();
        rw.add(new PieEntry(33, "vk"));
        rw.add(new PieEntry(22, "instagram"));
        rw.add(new PieEntry(45, "facebook"));
        rw.add(new PieEntry(21, "telegram"));
        rw.add(new PieEntry(33, "twiter"));
        rw.add(new PieEntry(14, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rw, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();
    }
}