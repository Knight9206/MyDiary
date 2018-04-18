package com.bliss.csc.mydiary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AppHelpActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);  


		TextView textview = new TextView(this);
		textview.setTextSize(20);
		textview.setText("여행 일지");
		setContentView(textview);
    }
}