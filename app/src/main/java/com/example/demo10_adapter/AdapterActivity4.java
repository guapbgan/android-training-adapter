package com.example.demo10_adapter;

import android.app.ListActivity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class AdapterActivity4 extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new PhotoFileAdapter(this));
    }
}
