package net.a6te.lazycoder.fragmentexample2demo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnCountryItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        CountryNameFragment countryListFragment = new CountryNameFragment();
        ft.add(R.id.fragmentContainer,countryListFragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

    @Override
    public void onCountryItemClick(String item) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Bundle bundle = new Bundle();
        bundle.putString("country",item);
        CountryDetailsFragment countryDetailsFragment = new CountryDetailsFragment();
        countryDetailsFragment.setArguments(bundle);
        ft.replace(R.id.fragmentContainer,countryDetailsFragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

    }
}
