package com.example.paulin.miracleshare;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class TabFragment2 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View r = inflater.inflate(R.layout.tab_fragment_2, container, false);


/*        String [] values1 = {"Vælg samme billede som","Facebook","Twitter","LinkedIn"};
        String [] values2 = {"Vælg samme Video som","Facebook","Twitter","LinkedIn"};
        Spinner spinner1 = (Spinner) v.findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) v.findViewById(R.id.spinner2);

        ArrayAdapter<String> LTRadapter1 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values1);
        LTRadapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1.setAdapter(LTRadapter1);

        ArrayAdapter<String> LTRadapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, values2);
        LTRadapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(LTRadapter2);*/

        final EditText editText9 = (EditText) r.findViewById(R.id.editText9);
        editText9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String text9 = ((EditText)r.findViewById(R.id.editText9)).getText().toString();

                if (text9.equals("Skriv tekst her")){
                    editText9.setText("");
                }
            }
        });

        return r;
    }

}