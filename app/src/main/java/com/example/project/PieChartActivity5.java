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

public class PieChartActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart5);
        PieChart pieChart = findViewById(R.id.pieChart5);

        ArrayList<PieEntry> rr = new ArrayList<>();
        rr.add(new PieEntry(37, "vk"));
        rr.add(new PieEntry(25, "instagram"));
        rr.add(new PieEntry(50, "facebook"));
        rr.add(new PieEntry(24, "telegram"));
        rr.add(new PieEntry(35, "twiter"));
        rr.add(new PieEntry(18, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rr, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}