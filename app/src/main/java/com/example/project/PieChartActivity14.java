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

public class PieChartActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart14);
        PieChart pieChart = findViewById(R.id.pieChart14);

        ArrayList<PieEntry> rh = new ArrayList<>();
        rh.add(new PieEntry(47, "vk"));
        rh.add(new PieEntry(38, "instagram"));
        rh.add(new PieEntry(1, "facebook"));
        rh.add(new PieEntry(11, "telegram"));
        rh.add(new PieEntry(1, "twiter"));
        rh.add(new PieEntry(33, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rh, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}