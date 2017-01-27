package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.os.Bundle;

import rs.aleph.android.example12.R;

/**
 * Created by androiddevelopment on 27.1.17..
 */

public class ThirdActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_third);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



}