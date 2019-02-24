package com.example.mikal.scout2019;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mikal.scout2019.database.DataSource;
import com.example.mikal.scout2019.database.DbHelper;
import com.example.mikal.scout2019.model.DataItem;
import com.example.mikal.scout2019.model.SampleData;

import java.util.List;


public class SubmitTab extends Fragment {
    private static final String TAG = "SubmitTab";
    List<DataItem> dataItemList = SampleData.dataItemList;
    DataSource mDataSource;
    Context context; //Declare the variable context


    private View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        // Find the root view, and put in into a variable for later use by other functions
        this.root = inflater.inflate(R.layout.submit_tab, container, false); //creates UI
        context = root.getContext(); // Assign your rootView to context


        this.AddData(R.id.submit_button);
        return this.root;
    }


    // Send the data to the db
    public void AddData(int buttonID) {
        Button button = this.root.findViewById(buttonID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create a new DbHelper object
                DbHelper pineapple_belongs_on_pizza = new DbHelper(getContext());

                // Call the addData function from said object
                pineapple_belongs_on_pizza.addData("Enter data here...");
            }
        });
    }

}
