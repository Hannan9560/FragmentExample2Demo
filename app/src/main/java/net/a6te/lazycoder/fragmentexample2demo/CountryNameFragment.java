package net.a6te.lazycoder.fragmentexample2demo;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.HideReturnsTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountryNameFragment extends Fragment {
    private ListView countryList;
    private ArrayList<String> countries;
    private OnCountryItemClickListener onCountryItemClickListener;



    public CountryNameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_country_name, container, false);
        countryList = (ListView) view.findViewById(R.id.countryList);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        countries = new ArrayList<>();
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Pakistan");
        countries.add("Australiya");
        countries.add("Newzeland");
        countries.add("Ireland");
        countries.add("England");
        countries.add("Westindis");
        countries.add("Southafrica");
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1,
                countries);
        countryList.setAdapter(adapter);
        countryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = countries.get(i).toString();
                onCountryItemClickListener.onCountryItemClick(name);
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onCountryItemClickListener = (OnCountryItemClickListener) context;
    }
}
