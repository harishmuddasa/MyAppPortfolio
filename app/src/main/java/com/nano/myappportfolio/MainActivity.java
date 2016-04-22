package com.nano.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mPopularMov, mStockHawk, mBuildIt, mMakeYour, mGoUbi, mCapStone, mMaterial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        //reference to buttons in activity_main.xml
        mPopularMov = (Button) findViewById(R.id.btnPopularMov);
        mStockHawk = (Button) findViewById(R.id.btnStockH);
        mBuildIt = (Button) findViewById(R.id.btnBuildIt);
        mMakeYour = (Button) findViewById(R.id.btnMakeYour);
        mMaterial = (Button) findViewById(R.id.btnMaterial);
        mGoUbi = (Button) findViewById(R.id.btnGoUbi);
        mCapStone = (Button) findViewById(R.id.btnCapstone);
        btnOnClickListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG,"onCreateOptionsMenu");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d(TAG,"onOptionsItemSelected");
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void toastDisplay(String appName) {
        Log.d(TAG,"toastDisplay");
        //http://developer.android.com/guide/topics/ui/controls/button.html#HandlingEvents
        Context context = getApplicationContext();
        CharSequence text = "This button will launch " + appName + " app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void btnOnClickEvent(final Button btn) {
        Log.d(TAG,"btnOnClickEvent");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String appName = btn.getText().toString();
                toastDisplay(appName);
            }
        });
    }

    public void btnOnClickListeners() {
        Log.d(TAG,"btnOnClickListeners");
        btnOnClickEvent(mPopularMov);
        btnOnClickEvent(mStockHawk);
        btnOnClickEvent(mBuildIt);
        btnOnClickEvent(mMakeYour);
        btnOnClickEvent(mMaterial);
        btnOnClickEvent(mGoUbi);
        btnOnClickEvent(mCapStone);
    }
}



