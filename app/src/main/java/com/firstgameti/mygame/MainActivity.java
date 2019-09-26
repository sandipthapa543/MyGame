package com.firstgameti.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart = findViewById(R.id.start);
        btnstart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == (R.id.start)) {

            Intent intent = new Intent(MainActivity.this, PlayBoardActivity.class);
            startActivity(intent);

        }
    }
}