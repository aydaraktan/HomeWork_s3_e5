package com.example.fragmenttest;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BlankFragment4 extends Fragment {

    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        listenerViews();
    }
    private void listenerViews() {
        btn.setOnClickListener(view -> {
            BlankFragment5 blankFragment5 = new BlankFragment5();
            Bundle bundle = this.getArguments();
            Bundle bundle1 = new Bundle();
            if(bundle!= null) {
                bundle1.putString("key",bundle.getString("key"));
                blankFragment5.setArguments(bundle1);
            }
            getParentFragmentManager().beginTransaction().replace(R.id.conteiner, blankFragment5).commit();
        });
    }
    private void initViews(View view) {
        btn=view.findViewById(R.id.button4);
    }
}