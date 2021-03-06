package com.nedu.android_ui_17_activitygroup;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class MainView extends ActivityGroup {
	@SuppressWarnings("unused")
	private LinearLayout bodyView,headview;
	private LinearLayout one, two, three, four;
	private int flag = 0; // 通过标记跳转不同的页面，显示不同的菜单项
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_main);
        initMainView();
		// 显示标记页面
		showView(flag);
		one.setOnClickListener(new OnClickListener() {		
			public void onClick(View v) {
				// TODO Auto-generated method stub
				flag = 0;
				showView(flag);
				}
		});
		two.setOnClickListener(new OnClickListener() {					
			public void onClick(View v) {
				// TODO Auto-generated method stub
				flag = 1;
				showView(flag);
			}
		});
		three.setOnClickListener(new OnClickListener() {				
			public void onClick(View v) {
				// TODO Auto-generated method stub
				flag = 2;
				showView(flag);
			}
		});
		four.setOnClickListener(new OnClickListener() {			
				public void onClick(View v) {
				// TODO Auto-generated method stub
					flag = 3;
					showView(flag);
			}
		});

    }
   
    /*
	 * 初始化主界面
	 */
    public void initMainView() {
		headview=(LinearLayout) findViewById(R.id.head);
		bodyView=(LinearLayout) findViewById(R.id.body);
		one=(LinearLayout) findViewById(R.id.one);
		two=(LinearLayout) findViewById(R.id.two);
		three=(LinearLayout) findViewById(R.id.three);
		four=(LinearLayout) findViewById(R.id.four);
	}
    
   // 在主界面中显示其他界面
	public void showView(int flag) {
		switch (flag) {
		case 0:
			bodyView.removeAllViews();
			View v = getLocalActivityManager().startActivity("one",
					new Intent(MainView.this, OneView.class)).getDecorView();

			one.setBackgroundResource(R.drawable.frame_button_background);
			two.setBackgroundResource(R.drawable.frame_button_nopressbg);
			three.setBackgroundResource(R.drawable.frame_button_nopressbg);
			four.setBackgroundResource(R.drawable.frame_button_nopressbg);
		
			bodyView.addView(v);
			break;
		case 1:
			bodyView.removeAllViews();
			bodyView.addView(getLocalActivityManager().startActivity("two",
					new Intent(MainView.this, TwoView.class))
					.getDecorView());
			one.setBackgroundResource(R.drawable.frame_button_nopressbg);
			two.setBackgroundResource(R.drawable.frame_button_background);
			three.setBackgroundResource(R.drawable.frame_button_nopressbg);
			four.setBackgroundResource(R.drawable.frame_button_nopressbg);
			break;
		case 2:			
			bodyView.removeAllViews();
			bodyView.addView(getLocalActivityManager().startActivity(
					"three", new Intent(MainView.this, ThreeView.class))
					.getDecorView());
			one.setBackgroundResource(R.drawable.frame_button_nopressbg);
			two.setBackgroundResource(R.drawable.frame_button_nopressbg);
			three.setBackgroundResource(R.drawable.frame_button_background);
			four.setBackgroundResource(R.drawable.frame_button_nopressbg);
			break;
		case 3:			
			bodyView.removeAllViews();
			bodyView.addView(getLocalActivityManager().startActivity(
					"four", new Intent(MainView.this, FourView.class))
					.getDecorView());
			one.setBackgroundResource(R.drawable.frame_button_nopressbg);
			two.setBackgroundResource(R.drawable.frame_button_nopressbg);
			three.setBackgroundResource(R.drawable.frame_button_nopressbg);
			four.setBackgroundResource(R.drawable.frame_button_background);
			break;
		default:
			break;
		}
	}
}