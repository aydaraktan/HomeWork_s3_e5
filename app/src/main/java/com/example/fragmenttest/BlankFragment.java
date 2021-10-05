package com.example.fragmenttest;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class BlankFragment extends Fragment {
    private Button btn;
    private EditText edt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        listenerViews();
    }

    private void listenerViews() {
        btn.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            BlankFragment2 blankFragment2 = new BlankFragment2();
            if (!edt.getText().toString().isEmpty()) {
                bundle.putString("key", edt.getText().toString());
                blankFragment2.setArguments(bundle);
            }
            getParentFragmentManager().beginTransaction().replace(R.id.conteiner, blankFragment2).commit();

        });
    }

    private void initViews(View view) {
        btn = (view).findViewById(R.id.button);
        edt = (view).findViewById(R.id.edit);
    }
}