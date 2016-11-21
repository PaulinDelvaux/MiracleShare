package com.example.paulin.miracleshare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class TabFragment5 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View r = inflater.inflate(R.layout.tab_fragment_5, container, false);
        final EditText editText12 = (EditText) r.findViewById(R.id.editText12);
        editText12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text12 = ((EditText)r.findViewById(R.id.editText12)).getText().toString();

                if (text12.equals("Skriv tekst her")){
                    editText12.setText("");
                }
            }
        });

        //Billede spinner for Facebook
        final List<String> Billede1=new ArrayList<String>();
        Billede1.add("Vælg samme billede som");
        Billede1.add("Hjemmeside");
        Billede1.add("Twitter");
        Billede1.add("LinkedIn");

        Spinner s7 = (Spinner) r.findViewById(R.id.spinner7);
        ArrayAdapter<String> dataAdapter7 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item, Billede1);
        dataAdapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s7.setAdapter(dataAdapter7);

        //Video spinner for Facebook
        final List<String> Video1=new ArrayList<String>();
        Video1.add("Vælg samme video som");
        Video1.add("Hjemmeside");
        Video1.add("Twitter");
        Video1.add("LinkedIn");

        Spinner s8 = (Spinner) r.findViewById(R.id.spinner8);
        ArrayAdapter<String> dataAdapter8 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item, Video1);
        dataAdapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s8.setAdapter(dataAdapter8);
        
        return r;

        /*View v = inflater.inflate(R.layout.tab_fragment_2, container, false);

        String [] values7 = {"Vælg samme billede som","Hjemmeside","Twitter","Twitter"};
        String [] values8 = {"Vælg samme Video som","Hjemmeside","Twitter","Twitter"};
        Spinner spinner7 = (Spinner) v.findViewById(R.id.spinner7);
        Spinner spinner8 = (Spinner) v.findViewById(R.id.spinner8);

        ArrayAdapter<String> LTRadapter7 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values7);
        LTRadapter7.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner7.setAdapter(LTRadapter7);

        ArrayAdapter<String> LTRadapter8 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values8);
        LTRadapter8.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner8.setAdapter(LTRadapter8);

        return v;*/
    }
}