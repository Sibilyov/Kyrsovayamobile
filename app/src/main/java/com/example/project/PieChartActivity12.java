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

public class PieChartActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart12);
        PieChart pieChart = findViewById(R.id.pieChart12);

        ArrayList<PieEntry> rf = new ArrayList<>();
        rf.add(new PieEntry(39, "vk"));
        rf.add(new PieEntry(31, "instagram"));
        rf.add(new PieEntry(2, "facebook"));
        rf.add(new PieEntry(6, "telegram"));
        rf.add(new PieEntry(2, "twiter"));
        rf.add(new PieEntry(32, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rf, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}