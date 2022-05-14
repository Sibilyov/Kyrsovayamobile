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

public class PieChartActivity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart20);

        PieChart pieChart = findViewById(R.id.pieChart20);

        ArrayList<PieEntry> rb = new ArrayList<>();
        rb.add(new PieEntry(70, "vk"));
        rb.add(new PieEntry(60, "instagram"));
        rb.add(new PieEntry(10, "facebook"));
        rb.add(new PieEntry(25, "telegram"));
        rb.add(new PieEntry(8, "twiter"));
        rb.add(new PieEntry(60, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rb, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}