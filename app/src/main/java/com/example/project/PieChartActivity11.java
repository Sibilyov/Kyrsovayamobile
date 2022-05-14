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

public class PieChartActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart11);

        PieChart pieChart = findViewById(R.id.pieChart11);

        ArrayList<PieEntry> rd = new ArrayList<>();
        rd.add(new PieEntry(38, "vk"));
        rd.add(new PieEntry(30, "instagram"));
        rd.add(new PieEntry(1, "facebook"));
        rd.add(new PieEntry(4, "telegram"));
        rd.add(new PieEntry(1, "twiter"));
        rd.add(new PieEntry(30, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rd, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}