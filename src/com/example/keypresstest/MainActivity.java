package com.example.keypresstest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	ScrollView sView;
	TextView eText;
	TextView sViewText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initUI();
		
		Log.i("MainActivity", "onCreate() called!");
		String newstr = sViewText.getText().toString() == null ? "" : sViewText.getText().toString() 
				+ "\n" 
				+ "onCreate() called!";
		sViewText.setText(newstr);
	}

	private void initUI() {
		LinearLayout linLayout = new LinearLayout(this);
		linLayout.setOrientation(LinearLayout.VERTICAL);
		LayoutParams linLayoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		eText = new TextView(this);
		eText.setSingleLine(false);
		eText.setHint("This app listens to button presses and displays their keycodes in a scrollview");
		Button exit = new Button(this);
		exit.setText("Press Here to Exit");
		exit.setOnClickListener((OnClickListener) new ExitListener());

		LinearLayout linLayoutInner = new LinearLayout(this);
		linLayoutInner.setOrientation(LinearLayout.VERTICAL);
		linLayoutInner.addView(exit);
		linLayoutInner.addView(eText);

		sViewText = new TextView(this);
		linLayoutInner.addView(sViewText);


		sView = new ScrollView(this);
		sView.addView(linLayoutInner);

		linLayout.addView(sView);


		setContentView(linLayout, linLayoutParams);
	}

	

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		Log.i("MainActivity", "keyUpCode = " + keyCode);
		String newstr = sViewText.getText().toString() == null ? "" : sViewText.getText().toString() 
				+ "\n" 
				+ "keyUpCode = " + keyCode;
		sViewText.setText(newstr);
		return false;
	}
	@Override    
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		Log.i("MainActivity", "keyDownCode = " + keyCode);
		String newstr = sViewText.getText().toString() == null ? "" : sViewText.getText().toString() 
				+ "\n" 
				+ "keyDownCode = " + keyCode;
		sViewText.setText(newstr);
		return false; 

	}
	
	@Override
	public void onPause(){
		Log.i("MainActivity", "onPause() called!");
		String newstr = sViewText.getText().toString() == null ? "" : sViewText.getText().toString() 
				+ "\n" 
				+ "onPause() called!";
		sViewText.setText(newstr);
		super.onPause();
	}
	
	@Override
	public void onResume(){
		Log.i("MainActivity", "onResume() called!");
		String newstr = sViewText.getText().toString() == null ? "" : sViewText.getText().toString() 
				+ "\n" 
				+ "onResume() called!";
		sViewText.setText(newstr);
		super.onResume();
	}
	@Override
	public void onStart(){
		Log.i("MainActivity", "onStart() called!");
		String newstr = sViewText.getText().toString() == null ? "" : sViewText.getText().toString() 
				+ "\n" 
				+ "onStart() called!";
		sViewText.setText(newstr);
		super.onStart();
	}
	@Override
	public void onStop(){
		Log.i("MainActivity", "onStop() called!");
		String newstr = sViewText.getText().toString() == null ? "" : sViewText.getText().toString() 
				+ "\n" 
				+ "onStop() called!";
		sViewText.setText(newstr);
		super.onStop();
	}
	
	@Override
	public void finish(){
		Log.i("MainActivity", "finish() called!");
		String newstr = sViewText.getText().toString() == null ? "" : sViewText.getText().toString() 
				+ "\n" 
				+ "finish() called!";
		sViewText.setText(newstr);
		super.finish();
	}

	private class ExitListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			finish();	
		}
	}	
}
