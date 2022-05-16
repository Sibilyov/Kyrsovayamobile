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

public class PieChartActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart16);
        PieChart pieChart = findViewById(R.id.pieChart16);

        ArrayList<PieEntry> rl = new ArrayList<>();
        rl.add(new PieEntry(62, "vk"));
        rl.add(new PieEntry(39, "instagram"));
        rl.add(new PieEntry(8, "facebook"));
        rl.add(new PieEntry(8, "telegram"));
        rl.add(new PieEntry(7, "twiter"));
        rl.add(new PieEntry(39, "whatsapp"));

        PieDataSet pieDataSet = new PieDataSet(rl, "PieChart");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animate();

    }
}