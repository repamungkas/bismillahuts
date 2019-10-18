package id.ac.polinema.bismillahuts.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import id.ac.polinema.bismillahuts.Activity.DetailActivity;
import id.ac.polinema.bismillahuts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    LinearLayout detail;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        detail = view.findViewById(R.id.detail);
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
