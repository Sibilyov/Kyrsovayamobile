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

public class PieChartActivity21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart21);

        PieChart pieChart = findViewById(R.id.pieChart21);

        ArrayList<PieEntry> rn = new ArrayList<>();
        rn.add(new PieEntry(72, "vk"));
        rn.add(new PieEntry(56, "instagram"));
        rn.add(new PieEntry(6, "facebook"));
        rn.add(new PieEntry(29, "telegram"));
        rn.add(new PieEntry(3, "twiter"));
        rn.add(new PieEntry(63, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rn, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();


    }
}