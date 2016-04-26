package com.example.mohammed.makanlah;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class confirm_page extends AppCompatActivity {

    EditText username;
    EditText userid;
    TextView name_display;

    public void confirm_order(View view)
    {
        /*username = (EditText) findViewById(R.id.username);
        userid = (EditText) findViewById(R.id.userid);
        name_display = (TextView) findViewById(R.id.name_display);

        //USER INFO STORING START
        SharedPreferences save_info = getSharedPreferences("user_info", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = save_info.edit(); //wtf is this?
        editor.putString("username", username.getText().toString()); //Takes text , covert to string and sets it to the value "username"
        editor.putString("userid", userid.getText().toString());
        editor.apply(); // submits info
        //USER INFO STORING END

       // SharedPreferences save_info = getSharedPreferences("user_info", Context.MODE_PRIVATE);

        String name = save_info.getString("username", "");
        //String id = save_info.getString("userid", "");
        name_display.setText(name);
        //INTENT START*/
        Intent confirm_obj = new Intent(this, confirm_conf.class);
        startActivity(confirm_obj);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
