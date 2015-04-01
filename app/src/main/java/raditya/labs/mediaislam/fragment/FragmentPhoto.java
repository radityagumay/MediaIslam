package raditya.labs.mediaislam.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import raditya.labs.mediaislam.R;
import raditya.labs.mediaislam.adapter.MainActivityAdapter;

/**
 * Created by raditya on 4/1/2015.
 */
public class FragmentPhoto extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(MainActivityAdapter.TAG, "FragmentPhoto : onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(MainActivityAdapter.TAG, "FragmentPhoto : onCreateView");

        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(MainActivityAdapter.TAG, "FragmentPhoto : onStart");
    }
}
