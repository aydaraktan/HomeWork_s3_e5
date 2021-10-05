package com.example.fragmenttest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment5 extends Fragment {
    private TextView txt;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank5, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         getBundles(view);
         btn.setOnClickListener(view1 -> {
             Bundle bundle = this.getArguments();
             if(bundle!= null) {
                 String data = bundle.getString("key");
                 txt.setText(data);
             } else {
                 Toast.makeText(requireContext(), "error", Toast.LENGTH_SHORT).show();
             }
         });
    }


    private void getBundles(View view) {

        txt = (view).findViewById(R.id.frt5);
        btn = (view).findViewById(R.id.button5);


    }

}