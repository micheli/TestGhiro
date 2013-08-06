package com.example.testghiro;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;

public class tab2fragment extends SherlockFragment {
	public EditText e;
	public Button b;
	public ListView l;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_tab2, container, false);
		return view;
	}

	public void onStart() {
		super.onStart();
		// recupero delle componenti
		e = (EditText) getView().findViewById(R.id.casellaDiTesto);
		b = (Button) getView().findViewById(R.id.bottone_cambia_attivita);
		l = (ListView) getView().findViewById(R.id.tab2listview);
		
		//smanettamenti con la lista e adapter
		final String[] values = { "Windows", "Linux", "MacOS" };
		final ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < values.length; i++) {
			list.add(values[i]);
		}
		ArrayAdapter<String> adpt = new ArrayAdapter<String>(
				getSherlockActivity(), R.layout.row222,R.id.adaptedTextView, list);
		l.setAdapter(adpt);

		//e.setText("Scrivi quello che vuoi");
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String s = (String) e.getText().toString();
				Intent i = new Intent(getSherlockActivity(),ActivityShowTypedText.class);
				i.putExtra("text_input", s);
				startActivity(i);
			}
		});

	}

}
