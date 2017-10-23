package com.example.jorge.pruebaquadram.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jorge.pruebaquadram.Fragments.TopFreeFragment;
import com.example.jorge.pruebaquadram.Fragments.TopPaidFragment;
import com.example.jorge.pruebaquadram.R;
/**
 * Created by jorge on 22/10/17.
 */

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[];
    final int PAGE_COUNT = 2;
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabTitles = context.getResources().getStringArray(R.array.string_array_title_tabs);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return TopFreeFragment.newInstance();
            case 1:
                return TopPaidFragment.newInstance();
            default:
                return TopFreeFragment.newInstance();
        }
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
