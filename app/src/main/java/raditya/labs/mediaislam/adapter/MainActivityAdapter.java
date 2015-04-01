package raditya.labs.mediaislam.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import raditya.labs.mediaislam.fragment.FragmentArticle;
import raditya.labs.mediaislam.fragment.FragmentPhoto;

/**
 * Created by raditya on 4/1/2015.
 */
public class MainActivityAdapter extends FragmentStatePagerAdapter {

    public static final String TAG = "RADITYA GUMAY";

    public MainActivityAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        switch (index){
            case 0:
                Log.d(TAG, "index : " + index);
                return new FragmentArticle();
            case 1:
                Log.d(TAG, "index : " + index);
                return new FragmentPhoto();
            case 2:
                Log.d(TAG, "index : " + index);
                return new FragmentArticle();
            case 3:
                Log.d(TAG, "index : " + index);
                return new FragmentPhoto();
            case 4:
                Log.d(TAG, "index : " + index);
                return new FragmentArticle();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
