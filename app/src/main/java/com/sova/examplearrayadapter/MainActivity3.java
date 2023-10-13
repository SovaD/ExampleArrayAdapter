package com.sova.examplearrayadapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
         MyMonthAdapter adapter = new MyMonthAdapter(this, makeMonth());
       // setListAdapter(adapter);
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);
    }

    // Названия месяцев
    String[] monthArr = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    // Метод cоздания массива месяцев
    MyMonth[] makeMonth() {
        MyMonth[] arr = new MyMonth[12];

// Среднесуточная температура
        double[] tempArr = {-12.7, -11.3, -4.5, 7.7, 19.3, 23.9,
                23.5, 22.8, 16.0, 5.2, -0.3, -9.3};
// Количество дней
        int[] dayArr = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};

// Сборка месяцев
        for (int i = 0; i < arr.length; i++) {
            MyMonth month = new MyMonth();
            month.month = monthArr[i];
            month.temp = tempArr[i];
            month.days = dayArr[i];
            arr[i] = month;
        }
        return arr;
    }
}