package com.example.apple.criminal;

import android.support.v4.app.Fragment;

/**
 * Created by Apple on 18/12/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {

        return new CrimeListFragment();
    }
}
