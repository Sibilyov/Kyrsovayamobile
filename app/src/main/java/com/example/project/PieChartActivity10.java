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

public class PieChartActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart10);
        PieChart pieChart = findViewById(R.id.pieChart10);

        ArrayList<PieEntry> rs = new ArrayList<>();
        rs.add(new PieEntry(36, "vk"));
        rs.add(new PieEntry(28, "instagram"));
        rs.add(new PieEntry(2, "facebook"));
        rs.add(new PieEntry(3, "telegram"));
        rs.add(new PieEntry(2, "twiter"));
        rs.add(new PieEntry(27, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rs, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}