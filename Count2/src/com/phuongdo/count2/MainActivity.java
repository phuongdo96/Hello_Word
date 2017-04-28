package com.phuongdo.count2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView txtCount;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCount = (TextView) findViewById(R.id.textView1);  // Check the ID of the TextView from Properties!
    }

    public void btnCountOnClickHandler(View v) {
        count++;
        txtCount.setText(String.valueOf(count));
	}
}
