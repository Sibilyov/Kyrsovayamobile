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

public class PieChartActivity19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart19);

        PieChart pieChart = findViewById(R.id.pieChart19);

        ArrayList<PieEntry> rc = new ArrayList<>();
        rc.add(new PieEntry(69, "vk"));
        rc.add(new PieEntry(52, "instagram"));
        rc.add(new PieEntry(7, "facebook"));
        rc.add(new PieEntry(18, "telegram"));
        rc.add(new PieEntry(4, "twiter"));
        rc.add(new PieEntry(50, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rc, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();


    }
}