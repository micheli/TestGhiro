package com.example.testghiro;

import android.os.Bundle;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;

	public class MainActivity extends SherlockFragmentActivity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);

			// setContentView(R.layout.activity_my_agenda);
			final ActionBar ab = getSupportActionBar();
			ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			setTitle(getResources().getString(R.string.app_name));
			ab.setHomeButtonEnabled(true);
			ab.setDisplayHomeAsUpEnabled(true);
			
			/** TabHost will have Tabs */
			String tab1_txt = getResources().getString(R.string.app_name);
			String tab2_txt = getResources().getString(R.string.app_name);


			
			Tab tab1 = ab
					.newTab()
					.setText(tab1_txt)
					.setTabListener(
							new TabListener<Listview_1>(this, "tab1",
									Listview_1.class));
			ab.addTab(tab1);

			Tab tab2 = ab
					.newTab()
					.setText(tab2_txt + " 2")
					.setTabListener(
							new TabListener<tab2fragment>(this, "tab2",
									tab2fragment.class));
			ab.addTab(tab2);

		}

		@Override
		public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
			// TODO Auto-generated method stub
			return super.onCreateOptionsMenu(menu);
		}
	
}
