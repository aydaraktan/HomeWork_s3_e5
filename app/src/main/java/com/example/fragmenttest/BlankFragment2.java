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

public class BlankFragment2 extends Fragment {
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        listenerViews();



    }

    private void listenerViews() {
        btn.setOnClickListener(view -> {
            BlankFragment3 blankFragment3 = new BlankFragment3();
            Bundle bundle = this.getArguments();
            Bundle bundle1 = new Bundle();
            if(bundle!= null) {
                bundle1.putString("key", bundle.getString("key"));
                blankFragment3.setArguments(bundle1);
            }
            getParentFragmentManager().beginTransaction().replace(R.id.conteiner, blankFragment3).commit();
        });
    }

    private void initViews(View view) {

        btn=view.findViewById(R.id.button2);
    }

}