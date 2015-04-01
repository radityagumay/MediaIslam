package raditya.labs.mediaislam.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import raditya.labs.mediaislam.R;
import raditya.labs.mediaislam.adapter.MainActivityAdapter;

/**
 * Created by raditya on 4/1/2015.
 */
public class MainActivity extends FragmentActivity {

    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager)findViewById(R.id.viewpager);
        mPagerAdapter = new MainActivityAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }
}
