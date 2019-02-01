package com.example.mikal.scout2019;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MiscTab extends Fragment {
    private static final String TAG = "PrematchTab";

    private Button btnTEST;
    private TextView integer_number;
    public static int minteger = 1; //makes integer


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.misc_tab, container, false); //creates UI
        integer_number = (TextView) rootView.findViewById(R.id.integer_number); //finds the integer TextView
        btnTEST = (Button) rootView.findViewById(R.id.btnTEST); //finds button

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                minteger = minteger + 1;
                integer_number.setText(String.valueOf(minteger)); //SHOULD set integer to x+1 and outputs via string
            }
        });

        return rootView;
    }
}