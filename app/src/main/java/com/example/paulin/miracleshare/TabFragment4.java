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

public class TabFragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View r = inflater.inflate(R.layout.tab_fragment_4, container, false);
        final EditText editText11 = (EditText) r.findViewById(R.id.editText11);
        editText11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text11 = ((EditText)r.findViewById(R.id.editText11)).getText().toString();

                if (text11.equals("Skriv tekst her")){
                    editText11.setText("");
                }
            }
        });

        //Billede spinner for Facebook
        final List<String> Billede1=new ArrayList<String>();
        Billede1.add("Vælg samme billede som");
        Billede1.add("Hjemmeside");
        Billede1.add("Facebook");
        Billede1.add("LinkedIn");

        Spinner s5 = (Spinner) r.findViewById(R.id.spinner5);
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item, Billede1);
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s5.setAdapter(dataAdapter5);

        //Video spinner for Facebook
        final List<String> Video1=new ArrayList<String>();
        Video1.add("Vælg samme video som");
        Video1.add("Hjemmeside");
        Video1.add("Facebook");
        Video1.add("LinkedIn");

        Spinner s6 = (Spinner) r.findViewById(R.id.spinner6);
        ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item, Video1);
        dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s6.setAdapter(dataAdapter6);
        
        return r;
/*        View v = inflater.inflate(R.layout.tab_fragment_2, container, false);

        String [] values5 = {"Vælg samme billede som","Hjemmeside","Facebook","LinkedIn"};
        String [] values6 = {"Vælg samme Video som","Hjemmeside","Facebook","LinkedIn"};
        Spinner spinner5 = (Spinner) v.findViewById(R.id.spinner5);
        Spinner spinner6 = (Spinner) v.findViewById(R.id.spinner6);

        ArrayAdapter<String> LTRadapter5 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values5);
        LTRadapter5.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner5.setAdapter(LTRadapter5);

        ArrayAdapter<String> LTRadapter6 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values6);
        LTRadapter6.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner6.setAdapter(LTRadapter6);

        return v;*/
    }
}