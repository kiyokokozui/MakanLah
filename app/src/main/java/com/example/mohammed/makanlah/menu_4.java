package com.example.mohammed.makanlah;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class menu_4 extends AppCompatActivity {

    public void confirm(View view)

    {
        Intent confirm_obj = new Intent(this, confirm_page.class);
        startActivity(confirm_obj);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] food4 = {"aaaa", "bbbb", "hdsh", "food4", "food5", "sss6", ""};
        ListAdapter foodadapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, food4);
        ListView menu4 = (ListView) findViewById(R.id.menu4);
        menu4.setAdapter(foodadapter4);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
