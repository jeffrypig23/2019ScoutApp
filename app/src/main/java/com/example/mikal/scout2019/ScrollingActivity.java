package com.example.mikal.scout2019;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class ScrollingActivity extends AppCompatActivity {


    public static final String KEY = "key";
    private static final String TAG = "ScrollingActivity";
    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        //set up ViewPager with the sections adapter
        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);
        //defines how many tabs before it destroys other tabs
        //set to a high number to prevent "loss" of data to the user perspective
        mViewPager.setOffscreenPageLimit(10);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }


    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new PrematchTab(), "Prematch");
        adapter.addFragment(new AutoTab(), "Auto");
        adapter.addFragment(new GamePieceTab(), "Game Pieces");
        adapter.addFragment(new TeleRocketTab(), "Tele Rocket");
        adapter.addFragment(new TeleCargoshipTab(), "Tele Cargoship");
        adapter.addFragment(new EndgameTab(), "Endgame");
        adapter.addFragment(new MiscTab(), "Misc");
        adapter.addFragment(new SubmitTab(), "Submit");

        viewPager.setAdapter(adapter);

    }


}
