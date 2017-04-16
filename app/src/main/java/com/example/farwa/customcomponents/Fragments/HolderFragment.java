package com.example.farwa.customcomponents.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.farwa.customcomponents.Activities.MainActivity;
import com.example.farwa.customcomponents.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HolderFragment extends Fragment implements View.OnClickListener {

    Button customRadioBtn;

    public HolderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_holder, container, false);

        customRadioBtn = (Button) view.findViewById(R.id.customRadioBtn);
        customRadioBtn.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.customRadioBtn:
                ((MainActivity)getActivity()).openFragment(1);
                break;


        }

    }


}