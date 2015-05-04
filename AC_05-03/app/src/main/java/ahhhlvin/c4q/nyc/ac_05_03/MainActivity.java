package ahhhlvin.c4q.nyc.ac_05_03;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends ActionBarActivity {

    private TextView theTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        theTextView = (TextView) findViewById(R.id.the_textview);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        if (savedInstanceState == null) {
            String timeString = format.format(new Date());
            theTextView.setText(timeString);
        } else {
        // when rotating screen
            theTextView.setText(savedInstanceState.get("time").toString());
        }
        Log.d("MainActivity", "onCreate");


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("time", theTextView.getText().toString());
    }

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume");
        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause");
        super.onPause();

    }

    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop");
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy");
        super.onDestroy();

    }



}
