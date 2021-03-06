package com.calc.maqueda.fitnesscalculators.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.calc.maqueda.fitnesscalculators.MainActivity;
import com.calc.maqueda.fitnesscalculators.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PesoIdealFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PesoIdealFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";


    public static PesoIdealFragment newInstance(int sectionNumber) {
        PesoIdealFragment fragment = new PesoIdealFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PesoIdealFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_peso_ideal, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

}
