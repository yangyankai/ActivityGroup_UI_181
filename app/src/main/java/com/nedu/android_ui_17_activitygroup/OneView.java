package com.nedu.android_ui_17_activitygroup;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class OneView extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.one);
		Log.e("aaa","one Create");
	}

}
