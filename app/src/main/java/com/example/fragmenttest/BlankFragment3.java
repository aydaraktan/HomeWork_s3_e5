package com.example.fragmenttest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlankFragment3 extends Fragment {

    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank3, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        listenerViews();


    }
    private void listenerViews() {
        btn.setOnClickListener(view -> {
            BlankFragment4 blankFragment4 = new BlankFragment4();
            Bundle bundle = this.getArguments();
            Bundle bundle1 = new Bundle();
            if(bundle!= null) {
                bundle1.putString("key",bundle.getString("key"));
                blankFragment4.setArguments(bundle1);
            }
            getParentFragmentManager().beginTransaction().replace(R.id.conteiner,  blankFragment4).commit();
        });
    }
    private void initViews(View view) {
        btn=view.findViewById(R.id.button3);
    }
}