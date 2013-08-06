package com.example.testghiro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class MyPositionalFragment extends SherlockFragment {

	public int mypos;
	public View view;
	public TextView text;

	public MyPositionalFragment() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.layout_a_cazzo, container, false);

		return view;

	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		Bundle b = new Bundle();
		b = this.getArguments();
		String toshow = b.getString("position");
		text = (TextView) getView().findViewById(R.id.myTextView);
		text.setText(toshow);
	}

}
