package com.example.testghiro;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;

public class TabListener<T extends Fragment> implements ActionBar.TabListener {
	private Fragment mFragment;
	private final Activity mActivity;
	private final String mTag;
	private final Class<T> mClass;
	private String git; //=)

	public TabListener(Activity activity, String tag, Class<T> clz) {
		mActivity = activity;
		mTag = tag;
		mClass = clz;
	}

	//bestemmia un po'
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// Check if the fragment is already initialized
		if (mFragment == null) {
			// If not, instantiate and add it to the activity
			mFragment = (Fragment) Fragment.instantiate(mActivity,
					mClass.getName());
			ft.add(android.R.id.content, mFragment, mTag);
		} else {
			// If it exists, simply attach it in order to show it
			ft.attach(mFragment);
		}

	}
	//bestemmia un po'
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		if (mFragment != null) {
			// Detach the fragment, because another one is being attached
			ft.detach(mFragment);
		}	//bestemmia un po'
	}

	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// User selected the already selected tab. Usually do nothing.
	}
}
