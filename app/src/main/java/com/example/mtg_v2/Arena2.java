package com.example.mtg_v2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Arena2 extends AppCompatActivity {

    EditText etPlayer1;
    Button buttonSetPlayer1;
    Button buttonLifeUpP1;
    Button buttonLifeDownP1;
    Button buttonCMDP1_2Up;
    Button buttonCMDP1_2Down;
    Button buttonpCP1Up;
    Button buttonpCP1Down;
    TextView tvLCP1;
    TextView tvCCP1_2;
    TextView tvPCP1;
    TextView tvPlayer1_2;
    int player1Life = 20;
    int player1_2Dmg = 0;
    int poisonDmg1 = 0;

    EditText etPlayer2;
    Button buttonSetPlayer2;
    Button buttonLifeUpP2;
    Button buttonLifeDownP2;
    Button buttonCMDP2_1Up;
    Button buttonCMDP2_1Down;
    Button buttonpCP2Up;
    Button buttonpCP2Down;
    TextView tvLCP2;
    TextView tvCCP2_1;
    TextView tvPCP2;
    TextView tvPlayer2_1;
    int player2Life = 20;
    int player2_1Dmg = 0;
    int poisonDmg2 = 0;
    Button resetStats;
    double player1Roll;
    double player2Roll;
    double player3Roll;
    double player4Roll;
    boolean haveWinner;
    String player1Name;
    String player2Name;
    LinearLayout focusMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arena2);

        initWidgets();
        setupListeners();
    }

    private void rollDice() {
        haveWinner = false;
        while (haveWinner != true) {
            player1Roll = Math.random();
            player2Roll = Math.random();
            player3Roll = Math.random();
            player4Roll = Math.random();
            if (player1Roll > player2Roll && player1Roll > player3Roll && player1Roll > player4Roll
                    && player1Roll != player2Roll && player1Roll != player3Roll && player1Roll != player4Roll) {

                player1Name = etPlayer1.getText().toString();
                Toast.makeText(this, player1Name + " plays first", Toast.LENGTH_SHORT).show();
                haveWinner = true;
            } else if (player2Roll > player1Roll && player2Roll > player3Roll && player2Roll > player4Roll
                    && player2Roll != player1Roll && player2Roll != player3Roll && player2Roll != player4Roll)  {

                player2Name = etPlayer2.getText().toString();
                Toast.makeText(this, player2Name + " plays first", Toast.LENGTH_SHORT).show();
                haveWinner = true;
            } /*else if (player3Roll > player1Roll && player3Roll > player2Roll && player3Roll > player4Roll
                    && player3Roll != player1Roll && player3Roll != player2Roll && player3Roll != player4Roll) {
                haveWinner = true;
                Toast.makeText(this, etPlayer3.getText().toString() + " plays first", Toast.LENGTH_SHORT).show();
            } else  (player4Roll > player1Roll && player4Roll > player2Roll && player4Roll > player3Roll
                    && player4Roll != player1Roll && player4Roll != player2Roll && player4Roll != player3Roll) {
                haveWinner = true;
                Toast.makeText(this, etPlayer4.getText().toString() + " plays first", Toast.LENGTH_SHORT).show();
            } */
        }
    }

    private void initWidgets() {
        etPlayer1 = findViewById(R.id.etPlayer1);
        buttonSetPlayer1 = findViewById(R.id.buttonSetPlayer1);
        buttonLifeUpP1 = findViewById(R.id.buttonLifeUpP1);
        buttonLifeDownP1 = findViewById(R.id.buttonLifeDownP1);
        buttonCMDP1_2Up = findViewById(R.id.buttonCMDP1_2Up);
        buttonCMDP1_2Down = findViewById(R.id.buttonCMDP1_2Down);
        buttonpCP1Up = findViewById(R.id.buttonpCP1Up);
        buttonpCP1Down = findViewById(R.id.buttonpCP1Down);
        tvLCP1 = findViewById(R.id.tvLCP1);
        tvCCP1_2 = findViewById(R.id.tvCCP1_2);
        tvPCP1 = findViewById(R.id.tvPCP1);
        tvPlayer1_2 = findViewById(R.id.tvPlayer1_2);
        etPlayer2 = findViewById(R.id.etPlayer2);
        buttonSetPlayer2 = findViewById(R.id.buttonSetPlayer2);
        buttonLifeUpP2 = findViewById(R.id.buttonLifeUpP2);
        buttonLifeDownP2 = findViewById(R.id.buttonLifeDownP2);
        buttonCMDP2_1Up = findViewById(R.id.buttonCMDP2_1Up);
        buttonCMDP2_1Down = findViewById(R.id.buttonCMDP2_1Down);
        buttonpCP2Up = findViewById(R.id.buttonpCP2Up);
        buttonpCP2Down = findViewById(R.id.buttonpCP2Down);
        tvLCP2 = findViewById(R.id.tvLCP2);
        tvCCP2_1 = findViewById(R.id.tvCCP2_1);
        tvPCP2 = findViewById(R.id.tvPCP2);
        tvPlayer2_1 = findViewById(R.id.tvPlayer2_1);
        resetStats = findViewById(R.id.resetStats);
        focusMain = findViewById(R.id.focusMain);
    }

    private void setupListeners() {
        setPlayer1();
        buttonP1LUp();
        buttonP1LDown();
        buttonCMDP1_2Up();
        buttonCMDP1_2Down();
        buttonpCP1Up();
        buttonpCP1Down();
        setPlayer2();
        buttonP2LUp();
        buttonP2LDown();
        buttonCMDP2_1Up();
        buttonCMDP2_1Down();
        buttonpCP2Up();
        buttonpCP2Down();
        buttonReset();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putString("Player1Name", etPlayer1.getText().toString());
        savedInstanceState.putString("Player1Life", tvLCP1.getText().toString());
        savedInstanceState.putString("Player1_2CMD", tvCCP1_2.getText().toString());
        savedInstanceState.putString("Player1Poison", tvPCP1.getText().toString());
        savedInstanceState.putString("Player2Name", etPlayer2.getText().toString());
        savedInstanceState.putString("Player2Life", tvLCP2.getText().toString());
        savedInstanceState.putString("Player2_1CMD", tvCCP2_1.getText().toString());
        savedInstanceState.putString("Player2Poison", tvPCP2.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        etPlayer1.setText(savedInstanceState.getString("Player1Name", ""));
        tvLCP1.setText(savedInstanceState.getString("Player1Life", ""));
        tvCCP1_2.setText(savedInstanceState.getString("Player1_2CMD", ""));
        tvPCP1.setText(savedInstanceState.getString("Player1Poison", ""));
        etPlayer2.setText(savedInstanceState.getString("Player2Name", ""));
        tvLCP2.setText(savedInstanceState.getString("Player2Life", ""));
        tvCCP2_1.setText(savedInstanceState.getString("Player2_1CMD", ""));
        tvPCP2.setText(savedInstanceState.getString("Player2Poison", ""));
        super.onRestoreInstanceState(savedInstanceState);
    }

    private void buttonReset() {
        resetStats.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                player1Life = 20;
                player1_2Dmg = 0;
                poisonDmg1 = 0;
                player2Life = 20;
                player2_1Dmg = 0;
                poisonDmg2 = 0;
                tvLCP1.setText(player1Life + "");
                tvCCP1_2.setText(player1_2Dmg + "");
                tvPCP1.setText(poisonDmg1 + "");
                tvLCP2.setText(player2Life + "");
                tvCCP2_1.setText(player2_1Dmg + "");
                tvPCP2.setText(poisonDmg2 + "");
                rollDice();
                return true;
            }
        });
    }

    private void setPlayer1() {
        buttonSetPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etPlayer1.setText(etPlayer1.getText().toString());
                tvPlayer2_1.setText(etPlayer1.getText().toString());
                etPlayer2.requestFocus();
            }
        });
    }

    private void setPlayer2() {
        buttonSetPlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etPlayer2.setText(etPlayer2.getText().toString());
                tvPlayer1_2.setText(etPlayer2.getText().toString());
                focusMain.requestFocus();
            }
        });
    }

    private void buttonP1LUp() {

        buttonLifeUpP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1Life++;
                tvLCP1.setText(player1Life + "");
            }
        });
    }

    private void buttonP2LUp() {

        buttonLifeUpP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2Life++;
                tvLCP2.setText(player2Life + "");
            }
        });
    }

    private void buttonP1LDown() {

        buttonLifeDownP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1Life--;
                tvLCP1.setText(player1Life + "");
            }
        });
    }

    private void buttonP2LDown() {

        buttonLifeDownP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2Life--;
                tvLCP2.setText(player2Life + "");
            }
        });
    }

    private void buttonCMDP1_2Up() {

        buttonCMDP1_2Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_2Dmg++;
                tvCCP1_2.setText(player1_2Dmg + "");
            }
        });
    }

    private void buttonCMDP2_1Up() {

        buttonCMDP2_1Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2_1Dmg++;
                tvCCP2_1.setText(player2_1Dmg + "");
            }
        });
    }

    private void buttonCMDP2_1Down() {

        buttonCMDP2_1Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2_1Dmg--;
                tvCCP2_1.setText(player2_1Dmg + "");
            }
        });
    }

    private void buttonCMDP1_2Down() {

        buttonCMDP1_2Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_2Dmg--;
                tvCCP1_2.setText(player1_2Dmg + "");
            }
        });
    }

    private void buttonpCP1Up() {

        buttonpCP1Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonDmg1++;
                tvPCP1.setText(poisonDmg1 + "");
            }
        });
    }

    private void buttonpCP1Down() {

        buttonpCP1Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonDmg1--;
                tvPCP1.setText(poisonDmg1 + "");
            }
        });
    }

    private void buttonpCP2Up() {

        buttonpCP2Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonDmg2++;
                tvPCP2.setText(poisonDmg2 + "");
            }
        });
    }

    private void buttonpCP2Down() {

        buttonpCP2Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonDmg2--;
                tvPCP2.setText(poisonDmg2 + "");
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
