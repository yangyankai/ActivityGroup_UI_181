package com.nedu.android_ui_17_activitygroup;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TwoView extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.two);
		Log.e("aaa", "two Create");
	}

}
