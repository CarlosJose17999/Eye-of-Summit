package com.example.carlo.eyeofsummit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Siguiete(View view){
        Intent siguiente = new Intent(this,Main2Activity.class);
        startActivity(siguiente);

    }
}
