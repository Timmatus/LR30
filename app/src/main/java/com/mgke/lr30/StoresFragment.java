package com.mgke.lr30;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.fragment.app.ListFragment;

public class StoresFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] stores = {"Пинск", "Галево"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, stores);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}