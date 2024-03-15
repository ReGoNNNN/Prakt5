package com.example.prakt5;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragmentb extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentb, container, false);

        String receivedData = getArguments().getString("example");

        TextView textView = view.findViewById(R.id.data_received_textview);
        textView.setText(receivedData);

        return view;
    }
}