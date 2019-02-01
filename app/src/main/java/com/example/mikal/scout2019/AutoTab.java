package com.example.mikal.scout2019;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class AutoTab extends Fragment {
    private static final String TAG = "AutoTab";

    //where hell begins

    private Button auto_low_hatchpanel_score_plus;
    private Button auto_low_hatchpanel_score_minus;
    private Button auto_medium_hatchpanel_score_plus;
    private Button auto_medium_hatchpanel_score_minus;
    private Button auto_high_hatchpanel_score_plus;
    private Button auto_high_hatchpanel_score_minus;
    private Button auto_low_cargo_score_plus;
    private Button auto_low_cargo_score_minus;
    private Button auto_medium_cargo_score_plus;
    private Button auto_medium_cargo_score_minus;
    private Button auto_high_cargo_score_plus;
    private Button auto_high_cargo_score_minus;
    private Button auto_missed_cargo_score_plus;
    private Button auto_missed_cargo_score_minus;
    private Button auto_missed_hatchpanel_score_plus;
    private Button auto_missed_hatchpanel_score_minus;
    private TextView integer_number;
    private TextView integer_number2;
    private TextView integer_number3;
    private TextView integer_number4;
    private TextView integer_number5;
    private TextView integer_number6;
    private TextView integer_number7;
    private TextView integer_number8;
    public static int auto_low_hatchpanel_number = 0; //makes integer
    public static int auto_medium_hatchpanel_number = 0; //makes integer
    public static int auto_high_hatchpanel_number = 0; //makes integer
    public static int auto_low_cargo_number = 0; //makes integer
    public static int auto_medium_cargo_number = 0; //makes integer
    public static int auto_high_cargo_number = 0; //makes integer
    public static int auto_missed_cargo_number = 0; //makes integer
    public static int auto_missed_hatchpanel_number = 0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.auto_tab, container, false); //creates UI
        //finds all the integer fields in the Fragment
        integer_number = (TextView) rootView.findViewById(R.id.integer_number); //finds the integer TextView
        integer_number2 = (TextView) rootView.findViewById(R.id.integer_number2); //finds the integer TextView
        integer_number3 = (TextView) rootView.findViewById(R.id.integer_number3); //finds the integer TextView
        integer_number4 = (TextView) rootView.findViewById(R.id.integer_number4); //finds the integer TextView
        integer_number5 = (TextView) rootView.findViewById(R.id.integer_number5); //finds the integer TextView
        integer_number6 = (TextView) rootView.findViewById(R.id.integer_number6); //finds the integer TextView
        integer_number7 = (TextView) rootView.findViewById(R.id.integer_number7); //finds the integer TextView
        integer_number8 = (TextView) rootView.findViewById(R.id.integer_number8); //finds the integer TextView

        //finds all the buttons in the Fragment
        auto_low_hatchpanel_score_plus = (Button) rootView.findViewById(R.id.auto_low_hatchpanel_score_plus);
        auto_low_hatchpanel_score_minus = (Button) rootView.findViewById(R.id.auto_low_hatchpanel_score_minus);
        auto_medium_hatchpanel_score_plus = (Button) rootView.findViewById(R.id.auto_medium_hatchpanel_score_plus);
        auto_medium_hatchpanel_score_minus = (Button) rootView.findViewById(R.id.auto_medium_hatchpanel_score_minus);
        auto_high_hatchpanel_score_plus = (Button) rootView.findViewById(R.id.auto_high_hatchpanel_score_plus);
        auto_high_hatchpanel_score_minus = (Button) rootView.findViewById(R.id.auto_high_hatchpanel_score_minus);
        auto_low_cargo_score_plus = (Button) rootView.findViewById(R.id.auto_low_cargo_score_plus);
        auto_low_cargo_score_minus = (Button) rootView.findViewById(R.id.auto_low_cargo_score_minus);
        auto_medium_cargo_score_plus = (Button) rootView.findViewById(R.id.auto_medium_cargo_score_plus);
        auto_medium_cargo_score_minus = (Button) rootView.findViewById(R.id.auto_medium_cargo_score_minus);
        auto_high_cargo_score_plus = (Button) rootView.findViewById(R.id.auto_high_cargo_score_plus);
        auto_high_cargo_score_minus = (Button) rootView.findViewById(R.id.auto_high_cargo_score_minus);
        auto_missed_cargo_score_plus = (Button) rootView.findViewById(R.id.auto_missed_cargo_score_plus);
        auto_missed_cargo_score_minus = (Button) rootView.findViewById(R.id.auto_missed_cargo_score_minus);
        auto_missed_hatchpanel_score_plus = (Button) rootView.findViewById(R.id.auto_missed_hatchpanel_score_plus);
        auto_missed_hatchpanel_score_minus = (Button) rootView.findViewById(R.id.auto_missed_hatchpanel_score_minus);

        //Button hell

//Low rocket hatch panel buttons
        auto_low_hatchpanel_score_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_low_hatchpanel_number = auto_low_hatchpanel_number + 1;
                integer_number.setText(String.valueOf(auto_low_hatchpanel_number));
            }
        });
        auto_low_hatchpanel_score_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_low_hatchpanel_number = auto_low_hatchpanel_number - 1;
                integer_number.setText(String.valueOf(auto_low_hatchpanel_number));
            }
        });

//medium rocket hatch panel buttons
        auto_medium_hatchpanel_score_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_medium_hatchpanel_number = auto_medium_hatchpanel_number + 1;
                integer_number2.setText(String.valueOf(auto_medium_hatchpanel_number));
            }
        });
        auto_medium_hatchpanel_score_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_medium_hatchpanel_number = auto_medium_hatchpanel_number - 1;
                integer_number2.setText(String.valueOf(auto_medium_hatchpanel_number));
            }
        });

//high rocket hatch panel buttons
        auto_high_hatchpanel_score_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_high_hatchpanel_number = auto_high_hatchpanel_number + 1;
                integer_number3.setText(String.valueOf(auto_high_hatchpanel_number));
            }
        });
        auto_high_hatchpanel_score_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_high_hatchpanel_number = auto_high_hatchpanel_number - 1;
                integer_number3.setText(String.valueOf(auto_high_hatchpanel_number));
            }
        });

//Low rocket cargo buttons
        auto_low_cargo_score_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_low_cargo_number = auto_low_cargo_number + 1;
                integer_number4.setText(String.valueOf(auto_low_cargo_number));
            }
        });
        auto_low_cargo_score_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_low_cargo_number = auto_low_cargo_number - 1;
                integer_number4.setText(String.valueOf(auto_low_cargo_number));
            }
        });

//medium rocket cargo buttons
        auto_medium_cargo_score_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_medium_cargo_number = auto_medium_cargo_number + 1;
                integer_number5.setText(String.valueOf(auto_medium_cargo_number));
            }
        });
        auto_medium_cargo_score_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_medium_cargo_number = auto_medium_cargo_number - 1;
                integer_number5.setText(String.valueOf(auto_medium_cargo_number));
            }
        });

//high rocket cargo buttons
        auto_high_cargo_score_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_high_cargo_number = auto_high_cargo_number + 1;
                integer_number6.setText(String.valueOf(auto_high_cargo_number));
            }
        });
        auto_high_cargo_score_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_high_cargo_number = auto_high_cargo_number - 1;
                integer_number6.setText(String.valueOf(auto_high_cargo_number));
            }
        });

//Rocket Hatch Panel miss buttons
        auto_missed_hatchpanel_score_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_missed_hatchpanel_number = auto_missed_hatchpanel_number + 1;
                integer_number7.setText(String.valueOf(auto_missed_hatchpanel_number));
            }
        });
        auto_missed_hatchpanel_score_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_missed_hatchpanel_number = auto_missed_hatchpanel_number - 1;
                integer_number7.setText(String.valueOf(auto_missed_hatchpanel_number));
            }
        });

//Rocket cargo miss buttons
        auto_missed_cargo_score_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_missed_cargo_number = auto_missed_cargo_number + 1;
                integer_number8.setText(String.valueOf(auto_missed_cargo_number));
            }
        });
        auto_missed_cargo_score_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View rootView) {
                auto_missed_cargo_number = auto_missed_cargo_number - 1;
                integer_number8.setText(String.valueOf(auto_missed_cargo_number));
            }
        });

        return rootView;    }

}
