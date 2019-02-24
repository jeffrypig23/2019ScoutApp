package com.example.mikal.scout2019;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mikal.scout2019.database.DataSource;
import com.example.mikal.scout2019.database.DbHelper;
import com.example.mikal.scout2019.model.DataItem;
import com.example.mikal.scout2019.model.SampleData;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataItem> dataItemList = SampleData.dataItemList;
    DataSource mDataSource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataSource = new DataSource(this);
        mDataSource.open();

        Toast.makeText(this, "Database Acquired", Toast.LENGTH_SHORT).show();

        long numItems = mDataSource.getDataItemsCount();
        if (numItems == 0) {
            for (DataItem item :
                    dataItemList) {
                try {
                    mDataSource.createItem(item);
                } catch (SQLiteException e) {
                    e.printStackTrace();
                }
            }
            Toast.makeText(this, "Data inserted!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Data already inserted!", Toast.LENGTH_SHORT).show();
        }
    }

    // When you press the button this sends you to the activity
    public void scrollgo(View view) {
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onPause() {
        super.onPause();
        mDataSource.close();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mDataSource.open();
    }

}
