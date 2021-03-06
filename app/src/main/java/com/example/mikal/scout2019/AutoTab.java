package com.example.mikal.scout2019;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class AutoTab extends Fragment {
    private static final String TAG = "AutoTab";

    private View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Find the root view, and put in into a variable for later use by other functions
        this.root = inflater.inflate(R.layout.auto_tab, container, false); //creates UI

        // Setup all the buttons that increase and decrease the things!
        // There was a bug where the cargo value could be negative... I don't know how this is possible to be honest, so I added a minimum and maximum value
        this.setupButton(R.id.integer_number, R.id.auto_low_hatchpanel_score_plus, 0, 100, 1);
        this.setupButton(R.id.integer_number, R.id.auto_low_hatchpanel_score_minus, 0, 100, -1);
        this.setupButton(R.id.integer_number2, R.id.auto_medium_hatchpanel_score_plus, 0, 100, 1);
        this.setupButton(R.id.integer_number2, R.id.auto_medium_hatchpanel_score_minus, 0, 100, -1);
        this.setupButton(R.id.integer_number3, R.id.auto_high_hatchpanel_score_plus, 0, 100, 1);
        this.setupButton(R.id.integer_number3, R.id.auto_high_hatchpanel_score_minus, 0, 100, -1);
        this.setupButton(R.id.integer_number4, R.id.auto_low_cargo_score_plus, 0, 100, 1);
        this.setupButton(R.id.integer_number4, R.id.auto_low_cargo_score_minus, 0, 100, -1);
        this.setupButton(R.id.integer_number5, R.id.auto_medium_cargo_score_plus, 0, 100, 1);
        this.setupButton(R.id.integer_number5, R.id.auto_medium_cargo_score_minus, 0, 100, -1);
        this.setupButton(R.id.integer_number6, R.id.auto_high_cargo_score_plus, 0, 100, 1);
        this.setupButton(R.id.integer_number6, R.id.auto_high_cargo_score_minus, 0, 100, -1);
        this.setupButton(R.id.integer_number7, R.id.auto_missed_hatchpanel_score_plus, 0, 100, 1);
        this.setupButton(R.id.integer_number7, R.id.auto_missed_hatchpanel_score_minus, 0, 100, -1);
        this.setupButton(R.id.integer_number8, R.id.auto_missed_cargo_score_plus, 0, 100, 1);
        this.setupButton(R.id.integer_number8, R.id.auto_missed_cargo_score_minus, 0, 100, -1);
        return this.root;
    }


    /**
     * This is a helper function that sets up the plus and minus buttons to add or subtract the value of a text view.
     *
     * @param buttonID  The ID of the button you want to set up. Usually found via <code>R.id.button_ID_here</code>
     * @param textID    The ID if the textview that will have its value updated based on the button press. Usually found via <code>R.id.text_ID_here</code>
     * @param minimum   The minimum value. This is essentially a lower bound (most commonly 0).
     * @param maximum   The maximum value. This is essentially an upper bound.
     * @param stepValue The amount the value increases by. To make the value decrease, set the stepValue to be a negative number.
     */
    private void setupButton(int textID, int buttonID, final int minimum, final int maximum, final int stepValue) {
        // Find the button from the view
        Button button = this.root.findViewById(buttonID);

        // Find the buttons textview from the view
        final TextView text = this.root.findViewById(textID);

        // Set the buttons actions to increase the count by the step value
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Find the text views current value. If there is an error, assume 0
                int initialCount;
                try {
                    initialCount = Integer.parseInt(text.getText().toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    initialCount = 0;
                }

                // Calculate the final count value
                int finalCount = initialCount + stepValue;

                // Check if it matches the bounds
                if (finalCount > maximum) {
                    finalCount = maximum;
                }
                if (finalCount < minimum) {
                    finalCount = minimum;
                }

                // Update the text to display the new final count
                text.setText(String.valueOf(finalCount));
            }
        });
    }
}
