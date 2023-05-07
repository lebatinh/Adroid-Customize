package com.example.autocompletetextview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class CountryAdapter extends ArrayAdapter<Country> {

    private final List<Country>mListCountries;
    public CountryAdapter( Context context, int resource, List<Country> objects) {
        super(context, resource, objects);
        mListCountries = new ArrayList<Country>(objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_custom, parent, false);
        }

        TextView tvCountryName =  convertView.findViewById(R.id.tv_country_name);
        Country country = getItem(position);
        tvCountryName.setText(country.getName());

        return convertView;
    }
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                List<Country> mListSuggest = new ArrayList<>();

                if(constraint == null || constraint.length() == 0){
                    mListSuggest.addAll(mListCountries);
                }else {
                    String filter = constraint.toString().toLowerCase().trim();
                    for(Country country : mListCountries) {
                        if(country.getName().toLowerCase().contains(filter)){
                            mListSuggest.add(country);
                        }
                    }
                }

                FilterResults filterResults =  new FilterResults();
                filterResults.values = mListSuggest;
                filterResults.count = mListSuggest.size();

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                clear();
                addAll((List<Country>)results.values);
                notifyDataSetInvalidated();
            }

            @Override
            public CharSequence convertResultToString(Object resultValue) {
                return ((Country) resultValue).getName();
            }
        };
    }
}
