package com.phuondo.hello_word;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this); 
        textView.setText("Hello, world!");      
        setContentView(textView);               
	}
}
