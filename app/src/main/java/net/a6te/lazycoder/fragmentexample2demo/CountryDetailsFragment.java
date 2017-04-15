package net.a6te.lazycoder.fragmentexample2demo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountryDetailsFragment extends Fragment {
    private TextView countryNameTV;


    public CountryDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_country_details, container, false);
        countryNameTV = (TextView) view.findViewById(R.id.countryName);
        countryNameTV.setText(getArguments().getString("country"));
        return  view;
    }

}
