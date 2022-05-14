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

public class PieChartActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart8);
        PieChart pieChart = findViewById(R.id.pieChart8);

        ArrayList<PieEntry> ru = new ArrayList<>();
        ru.add(new PieEntry(32, "vk"));
        ru.add(new PieEntry(23, "instagram"));
        ru.add(new PieEntry(3, "facebook"));
        ru.add(new PieEntry(2, "telegram"));
        ru.add(new PieEntry(5, "twiter"));
        ru.add(new PieEntry(23, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(ru, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}