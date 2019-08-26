package com.example.mtg_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameModeSelection extends AppCompatActivity {

    Button btn2Players;
    Button btn3Players;
    Button btn4Players;
    Button btn2Players180;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode_selection);
        initWidgets();
        setupListeners();
    }

    private void initWidgets() {

        btn2Players = findViewById(R.id.gameMode2);
        btn3Players = findViewById(R.id.gameMode3);
        btn4Players = findViewById(R.id.gameMode4);
        btn2Players180 = findViewById(R.id.gameMode22);
    }

    private void setupListeners() {
        btn2Players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentArena2 = new Intent(GameModeSelection.this, Arena2.class);
                startActivity(intentArena2);
            }
        });
        btn3Players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentArena3 = new Intent(GameModeSelection.this, Arena3.class);
                startActivity(intentArena3);
            }
        });
        btn4Players.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentArena4 = new Intent(GameModeSelection.this, Arena4.class);
                startActivity(intentArena4);
            }
        });
        btn2Players180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentArena22 = new Intent(GameModeSelection.this, Arena22.class);
                startActivity(intentArena22);
            }
        });
    }

}
