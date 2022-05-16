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

public class PieChartActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart4);
        PieChart pieChart = findViewById(R.id.pieChart4);

        ArrayList<PieEntry> re = new ArrayList<>();
        re.add(new PieEntry(34, "vk"));
        re.add(new PieEntry(23, "instagram"));
        re.add(new PieEntry(46, "facebook"));
        re.add(new PieEntry(23, "telegram"));
        re.add(new PieEntry(37, "twiter"));
        re.add(new PieEntry(15, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(re, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}