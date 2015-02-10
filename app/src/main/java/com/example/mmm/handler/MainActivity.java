package com.example.mmm.handler;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;


public class MainActivity extends ActionBarActivity {

    final String LOG_TAG = "myLogs";
    Handler h;
    Button but_start;
    Button but_test;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onclick(View view) {
        switch (view.getId()){
            case R.id.but_start:
                for (int i=0; i <= 10; i++) {
                    downloadFile();
                    tv.setText("Downloaded files - "+ i);
                    Log.d(LOG_TAG,"Downloaded files - " + i);
            }
                break;
            case R.id.but_test:
                Log.d(LOG_TAG,"Test");
                break;
            default:
                break;
        }
    }

    private void downloadFile() {
        // пауза - 1 секунда .
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
