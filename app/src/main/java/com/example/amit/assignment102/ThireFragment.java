package com.example.amit.assignment102;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class ThireFragment extends Fragment {
    public ThireFragment() {
        // Required empty public constructor
    }


    public static ThireFragment newInstance(String param1, String param2) {
        ThireFragment fragment = new ThireFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_thire, container, false);
    }

}
