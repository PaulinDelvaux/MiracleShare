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

public class TabFragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View r = inflater.inflate(R.layout.tab_fragment_3, container, false);
        final EditText editText10 = (EditText) r.findViewById(R.id.editText10);
        editText10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text10 = ((EditText) r.findViewById(R.id.editText10)).getText().toString();

                if (text10.equals("Skriv tekst her")) {
                    editText10.setText("");
                }
            }
        });

        //Billede spinner for Facebook
        final List<String> Billede1=new ArrayList<String>();
        Billede1.add("Vælg samme billede som");
        Billede1.add("Hjemmeside");
        Billede1.add("Twitter");
        Billede1.add("LinkedIn");

        Spinner s3 = (Spinner) r.findViewById(R.id.spinner3);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item, Billede1);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(dataAdapter3);

        //Video spinner for Facebook
        final List<String> Video1=new ArrayList<String>();
        Video1.add("Vælg samme video som");
        Video1.add("Hjemmeside");
        Video1.add("Twitter");
        Video1.add("LinkedIn");

        Spinner s4 = (Spinner) r.findViewById(R.id.spinner4);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_item, Video1);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s4.setAdapter(dataAdapter4);

        return r;
        /*View v = inflater.inflate(R.layout.tab_fragment_3, container, false);

        String [] values3 = {"Vælg samme billede som","Hjemmeside","Twitter","LinkedIn"};
        String [] values4 = {"Vælg samme Video som","Hjemmeside","Twitter","LinkedIn"};
        Spinner spinner3 = (Spinner) v.findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) v.findViewById(R.id.spinner4);

        ArrayAdapter<String> LTRadapter3 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values3);
        LTRadapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(LTRadapter3);

        ArrayAdapter<String> LTRadapter4 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values4);
        LTRadapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(LTRadapter4);

        return v;*/
    }
}