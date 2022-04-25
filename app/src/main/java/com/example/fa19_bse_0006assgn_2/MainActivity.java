package com.example.fa19_bse_0006assgn_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private LeftFragment leftfrag;
    private RightFragment rightfragment;
    private FragmentManager fragmanager;
    private FragmentTransaction fragtransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmanager = getSupportFragmentManager();
            fragtransaction = fragmanager.beginTransaction();
            leftfrag = LeftFragment.newInstance();
            rightfragment = RightFragment.newInstance();
            fragtransaction.replace(R.id.leftaction, leftfrag);
            fragtransaction.replace(R.id.rightmessage, rightfragment);
            fragtransaction.commit();
        }
    }
}