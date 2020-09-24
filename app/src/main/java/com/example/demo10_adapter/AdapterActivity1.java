package com.example.demo10_adapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapterActivity1 extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] incomePlaceHolder = getResources().getStringArray(R.array.income_placeholder);
        setListAdapter(new ArrayAdapter<>(this,
                R.layout.income_item,
                incomePlaceHolder));
        ListView listView = getListView();
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "#" + position + " is clicked", Toast.LENGTH_LONG).show();
        });

        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)menuInfo;


        menu.setHeaderTitle("menu for #" + adapterContextMenuInfo.position);
        menu.add("menu1");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);
    }
}
