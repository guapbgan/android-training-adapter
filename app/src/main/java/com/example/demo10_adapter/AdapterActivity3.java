package com.example.demo10_adapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Gallery;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class AdapterActivity3 extends Activity implements AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Gallery gallery = findViewById(R.id.gallery);
        gallery.setAdapter(new PhotoAdapter(this));
        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.codes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);//沒加這行item會太近，不好用手指選取
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView textView = findViewById(R.id.textView1);
        String[] versions = getResources().getStringArray(R.array.versions);
        textView.setText(versions[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
