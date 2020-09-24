package com.example.demo10_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupListView();
    }

    private static final String TITLE_KEY="titleField";
    private static final String DETAIL_KEY ="detailField";

    private void setupListView() {

        ListView listView = findViewById(R.id.listView1);
        String[] versions = getResources().getStringArray(R.array.versions);
        String[] codes = getResources().getStringArray(R.array.codes);
        ArrayList<HashMap<String, String>> dataSource = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            HashMap<String, String> aRecord = new HashMap<>();
            aRecord.put(TITLE_KEY, versions[i]);
            aRecord.put(DETAIL_KEY, codes[i]);
            dataSource.add(aRecord);

        }
        SimpleAdapter adapter = new SimpleAdapter(this, dataSource, R.layout.listview_item,
                new String[]{TITLE_KEY, DETAIL_KEY},
                new int[]{R.id.titleField, R.id.detailField});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id)->{
            TextView textView = findViewById(R.id.textView);
            textView.setText(String.format("%s is clicked", versions[position]));
        });
    }
}