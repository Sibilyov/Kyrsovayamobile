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

public class PieChartActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart17);

        PieChart pieChart = findViewById(R.id.pieChart17);

        ArrayList<PieEntry> rz = new ArrayList<>();
        rz.add(new PieEntry(65, "vk"));
        rz.add(new PieEntry(44, "instagram"));
        rz.add(new PieEntry(7, "facebook"));
        rz.add(new PieEntry(9, "telegram"));
        rz.add(new PieEntry(5, "twiter"));
        rz.add(new PieEntry(42, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rz, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}