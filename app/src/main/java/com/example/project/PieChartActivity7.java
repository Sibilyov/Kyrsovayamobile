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

public class PieChartActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart7);

        PieChart pieChart = findViewById(R.id.pieChart7);

        ArrayList<PieEntry> ry = new ArrayList<>();
        ry.add(new PieEntry(40, "vk"));
        ry.add(new PieEntry(26, "instagram"));
        ry.add(new PieEntry(47, "facebook"));
        ry.add(new PieEntry(30, "telegram"));
        ry.add(new PieEntry(38, "twiter"));
        ry.add(new PieEntry(20, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(ry, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}