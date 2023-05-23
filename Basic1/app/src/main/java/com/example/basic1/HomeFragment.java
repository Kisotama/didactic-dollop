package com.example.basic1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class HomeFragment extends Fragment {

    EditText cel_input, far_input;
    Button btn_Cel, btn_Far, Btn_clear;

    @Override
    public void onViewCreated(View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        cel_input = getView().findViewById(R.id.celcius);
        far_input = getView().findViewById(R.id.farenhite);
        btn_Cel = getView().findViewById(R.id.cel_convert);
        btn_Far = getView().findViewById(R.id.far_convert);
        Btn_clear = getView().findViewById(R.id.clear);


        btn_Cel.setOnClickListener(v ->{
            int C = Integer.parseInt(cel_input.toString());
            double F = C*1.8 + 32;
            cel_input.setText(F + "");
        });

        btn_Far.setOnClickListener(v ->{
            int F = Integer.parseInt(far_input.toString());
            double C = (F-32)/1.8;
            far_input.setText(C + "");
        });

        Btn_clear.setOnClickListener(v ->{
            cel_input.setText("");
            far_input.setText("");
        });




    }
}