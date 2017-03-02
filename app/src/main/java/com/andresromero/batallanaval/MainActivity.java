package com.andresromero.batallanaval;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String campo[][];
    String res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    campo = new String[10][10];
    res = "";
    }

    public void llenado(View vista){
        TextView resp = (TextView)findViewById(R.id.resp);
        resp.setText("");
        res ="";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                campo[i][j] = "~";

                if (j == 9)
                    res = res +( " " + campo[i][j] + "\n" );
                else
                    res = res + " " + campo[i][j];


            }

        }resp.setText(res);



}}
