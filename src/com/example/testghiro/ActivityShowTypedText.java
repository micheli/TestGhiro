package com.example.testghiro;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityShowTypedText extends SherlockFragmentActivity {
	public TextView t;

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		setContentView(R.layout.activityshowtypedtext);
		t = (TextView) findViewById(R.id.textView1);
		Intent intent = getIntent();
		String message = intent.getStringExtra("text_input");
		t.setText(message);
		
	}

}
