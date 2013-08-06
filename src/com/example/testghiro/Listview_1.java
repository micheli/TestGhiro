package com.example.testghiro;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragment;

public class Listview_1 extends SherlockFragment {

	public ListView l;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_list_view_1, container,
				false);
		return view;
	}

	public void onStart() {
		super.onStart();
		String[] values = { "primo", "secondo", "terzo" };
		 final ArrayList<String> list = new ArrayList<String>();
		    for (int i = 0; i < values.length; i++) {
		      list.add(values[i]);
		    }
		ArrayAdapter<String> adpt = new ArrayAdapter<String>(getSherlockActivity(), R.layout.row, list);
		
		l = (ListView) getSherlockActivity().findViewById(R.id.listView1);
		l.setAdapter(adpt);
		l.setOnItemClickListener(new ListView.OnItemClickListener(){
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
						long arg3) {
					
					Toast.makeText(getSherlockActivity(), "hai cliccato un'elemento della lista, scopri come funziona la FragmentTransaction!",
							Toast.LENGTH_SHORT).show();
					// Pass Data to other Fragment -> fai un fragment contenente un testo con il nome dell'elemento cliccato

				}
		});
	}

}
