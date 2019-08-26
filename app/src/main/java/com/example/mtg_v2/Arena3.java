package com.example.mtg_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Arena3 extends AppCompatActivity {

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
    EditText etPlayer3;
    EditText etPlayer4;
    Button buttonSetPlayer2;
    Button buttonSetPlayer3;
    Button buttonSetPlayer4;
    Button buttonLifeUpP2;
    Button buttonLifeUpP3;
    Button buttonLifeUpP4;
    Button buttonLifeDownP2;
    Button buttonLifeDownP3;
    Button buttonLifeDownP4;
    Button buttonCMDP2_1Up;
    Button buttonCMDP2_1Down;
    Button buttonCMDP1_3Up;
    Button buttonCMDP1_3Down;
    Button buttonCMDP2_3Up;
    Button buttonCMDP2_3Down;
    Button buttonCMDP2_4Up;
    Button buttonCMDP1_4Up;
    Button buttonCMDP1_4Down;
    Button buttonCMDP2_4Down;
    Button buttonpCP2Up;
    Button buttonpCP2Down;
    Button buttonCMDP3_1Up;
    Button buttonCMDP3_1Down;
    Button buttonCMDP4_1Up;
    Button buttonCMDP4_1Down;
    Button buttonCMDP3_2Up;
    Button buttonCMDP3_2Down;
    Button buttonCMDP4_2Up;
    Button buttonCMDP4_2Down;
    Button buttonCMDP3_4Up;
    Button buttonCMDP3_4Down;
    Button buttonCMDP4_3Up;
    Button buttonCMDP4_3Down;
    Button buttonpCP3Up;
    Button buttonpCP3Down;
    Button buttonpCP4Up;
    Button buttonpCP4Down;
    TextView tvLCP2;
    TextView tvLCP3;
    TextView tvLCP4;
    TextView tvCCP2_1;
    TextView tvCCP3_1;
    TextView tvCCP4_1;
    TextView tvCCP1_3;
    TextView tvCCP2_3;
    TextView tvCCP3_2;
    TextView tvCCP4_2;
    TextView tvCCP1_4;
    TextView tvCCP2_4;
    TextView tvCCP3_4;
    TextView tvCCP4_3;
    TextView tvPCP2;
    TextView tvPCP3;
    TextView tvPCP4;
    String player1;
    String player2;
    String player3;
    String player4;
    TextView tvPlayer1_3;
    TextView tvPlayer1_4;
    TextView tvPlayer2_1;
    TextView tvPlayer2_3;
    TextView tvPlayer2_4;
    TextView tvPlayer3_1;
    TextView tvPlayer3_2;
    TextView tvPlayer3_4;
    TextView tvPlayer4_1;
    TextView tvPlayer4_2;
    TextView tvPlayer4_3;
    int player2Life = 20;
    int player3Life = 20;
    int player4Life = 20;
    int player1_3Dmg = 0;
    int player1_4Dmg = 0;
    int player2_1Dmg = 0;
    int player2_3Dmg = 0;
    int player2_4Dmg = 0;
    int player3_1Dmg = 0;
    int player3_2Dmg = 0;
    int player3_4Dmg = 0;
    int player4_1Dmg = 0;
    int player4_2Dmg = 0;
    int player4_3Dmg = 0;
    int poisonDmg2 = 0;
    int poisonDmg3 = 0;
    int poisonDmg4 = 0;
    boolean haveWinner;
    double player1Roll;
    double player2Roll;
    double player3Roll;
    double player4Roll;
    String player1Name;
    String player2Name;
    String player3Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_arena3);

        initWidgets();
        setupButtons();
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
            } else if (player3Roll > player1Roll && player3Roll > player2Roll && player3Roll > player4Roll
                    && player3Roll != player1Roll && player3Roll != player2Roll && player3Roll != player4Roll) {
                player3Name = etPlayer3.getText().toString();
                haveWinner = true;
                Toast.makeText(this, player3Name + " plays first", Toast.LENGTH_SHORT).show();
            } /*else  (player4Roll > player1Roll && player4Roll > player2Roll && player4Roll > player3Roll
                    && player4Roll != player1Roll && player4Roll != player2Roll && player4Roll != player3Roll) {
                haveWinner = true;
                Toast.makeText(this, etPlayer4.getText().toString() + " plays first", Toast.LENGTH_SHORT).show();
            } */
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putString("Player1Name", etPlayer1.getText().toString());
        savedInstanceState.putString("Player1Life", tvLCP1.getText().toString());
        savedInstanceState.putString("Player1_2CMD", tvCCP1_2.getText().toString());
        savedInstanceState.putString("Player1_3CMD", tvCCP1_3.getText().toString());
        savedInstanceState.putString("Player1Poison", tvPCP1.getText().toString());
        savedInstanceState.putString("Player2Name", etPlayer2.getText().toString());
        savedInstanceState.putString("Player2Life", tvLCP2.getText().toString());
        savedInstanceState.putString("Player2_1CMD", tvCCP2_1.getText().toString());
        savedInstanceState.putString("Player2_3CMD", tvCCP2_3.getText().toString());
        savedInstanceState.putString("Player2Poison", tvPCP2.getText().toString());
        savedInstanceState.putString("Player3Name", etPlayer3.getText().toString());
        savedInstanceState.putString("Player3Life", tvLCP3.getText().toString());
        savedInstanceState.putString("Player3_1CMD", tvCCP3_1.getText().toString());
        savedInstanceState.putString("Player3_2CMD", tvCCP3_2.getText().toString());
        savedInstanceState.putString("Player3Poison", tvPCP3.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        etPlayer1.setText(savedInstanceState.getString("Player1Name", ""));
        tvLCP1.setText(savedInstanceState.getString("Player1Life", ""));
        tvCCP1_2.setText(savedInstanceState.getString("Player1_2CMD", ""));;
        tvCCP1_3.setText(savedInstanceState.getString("Player1_3CMD", ""));;
        tvPCP1.setText(savedInstanceState.getString("Player1Poison", ""));;
        etPlayer2.setText(savedInstanceState.getString("Player2Name", ""));
        tvLCP2.setText(savedInstanceState.getString("Player2Life", ""));
        tvCCP2_1.setText(savedInstanceState.getString("Player2_1CMD", ""));;
        tvCCP2_3.setText(savedInstanceState.getString("Player2_3CMD", ""));;
        tvPCP2.setText(savedInstanceState.getString("Player2Poison", ""));;
        etPlayer3.setText(savedInstanceState.getString("Player3Name", ""));
        tvLCP3.setText(savedInstanceState.getString("Player3Life", ""));
        tvCCP3_1.setText(savedInstanceState.getString("Player3_1CMD", ""));;
        tvCCP3_2.setText(savedInstanceState.getString("Player3_2CMD", ""));;
        tvPCP3.setText(savedInstanceState.getString("Player3Poison", ""));;
        super.onRestoreInstanceState(savedInstanceState);
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

    private void setupButtons() {
        setPlayer1();
        buttonP1LUp();
        buttonP1LDown();
        buttonCMDP1_2Up();
        buttonCMDP1_2Down();
        buttonpCP1Up();
        buttonpCP1Down();
        setPlayer2();
        setPlayer3();
        buttonP2LUp();
        buttonP3LUp();
        buttonP2LDown();
        buttonP3LDown();
        buttonCMDP2_1Up();
        buttonCMDP3_1Up();
        buttonCMDP2_1Down();
        buttonCMDP3_1Down();
        buttonCMDP1_3Up();
        buttonCMDP1_3Down();
        buttonCMDP2_3Up();
        buttonCMDP2_3Down();
        buttonCMDP3_2Up();
        buttonCMDP3_2Down();
        buttonpCP2Up();
        buttonpCP3Up();
        buttonpCP2Down();
        buttonpCP3Down();
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
        etPlayer3 = findViewById(R.id.etPlayer3);
        buttonSetPlayer2 = findViewById(R.id.buttonSetPlayer2);
        buttonSetPlayer3 = findViewById(R.id.buttonSetPlayer3);
        buttonLifeUpP2 = findViewById(R.id.buttonLifeUpP2);
        buttonLifeUpP3 = findViewById(R.id.buttonLifeUpP3);
        buttonLifeDownP2 = findViewById(R.id.buttonLifeDownP2);
        buttonLifeDownP3 = findViewById(R.id.buttonLifeDownP3);
        buttonCMDP2_1Up = findViewById(R.id.buttonCMDP2_1Up);
        buttonCMDP2_1Down = findViewById(R.id.buttonCMDP2_1Down);
        buttonCMDP1_3Up = findViewById(R.id.buttonCMDP1_3Up);
        buttonCMDP1_3Down = findViewById(R.id.buttonCMDP1_3Down);
        buttonCMDP2_3Up = findViewById(R.id.buttonCMDP2_3Up);
        buttonCMDP2_3Down = findViewById(R.id.buttonCMDP2_3Down);
        buttonpCP2Up = findViewById(R.id.buttonpCP2Up);
        buttonpCP2Down = findViewById(R.id.buttonpCP2Down);
        buttonCMDP3_1Up = findViewById(R.id.buttonCMDP3_1Up);
        buttonCMDP3_1Down = findViewById(R.id.buttonCMDP3_1Down);
        buttonCMDP3_2Up = findViewById(R.id.buttonCMDP3_2Up);
        buttonCMDP3_2Down = findViewById(R.id.buttonCMDP3_2Down);
        buttonpCP3Up = findViewById(R.id.buttonpCP3Up);
        buttonpCP3Down = findViewById(R.id.buttonpCP3Down);
        tvLCP2 = findViewById(R.id.tvLCP2);
        tvLCP3 = findViewById(R.id.tvLCP3);
        tvCCP2_1 = findViewById(R.id.tvCCP2_1);
        tvCCP3_1 = findViewById(R.id.tvCCP3_1);
        tvCCP1_3 = findViewById(R.id.tvCCP1_3);
        tvCCP2_3 = findViewById(R.id.tvCCP2_3);
        tvCCP3_2 = findViewById(R.id.tvCCP3_2);
        tvPCP2 = findViewById(R.id.tvPCP2);
        tvPCP3 = findViewById(R.id.tvPCP3);
        tvPlayer1_3 = findViewById(R.id.tvPlayer1_3);
        tvPlayer2_1 = findViewById(R.id.tvPlayer2_1);
        tvPlayer2_3 = findViewById(R.id.tvPlayer2_3);
        tvPlayer3_1 = findViewById(R.id.tvPlayer3_1);
        tvPlayer3_2 = findViewById(R.id.tvPlayer3_2);
    }

    private void setPlayer1() {
        buttonSetPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etPlayer1.setText(etPlayer1.getText().toString());
                tvPlayer2_1.setText(etPlayer1.getText().toString());
                tvPlayer3_1.setText(etPlayer1.getText().toString());
                etPlayer2.requestFocus();
            }
        });
        buttonSetPlayer1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                player1Life = 20;
                player1_2Dmg = 0;
                player1_2Dmg = 0;
                player1_2Dmg = 0;
                poisonDmg1 = 0;
                player2Life = 20;
                player2_1Dmg = 0;
                player2_3Dmg = 0;
                player2_4Dmg = 0;
                poisonDmg2 = 0;
                player3Life = 20;
                player3_1Dmg = 0;
                player3_2Dmg = 0;
                player3_4Dmg = 0;
                poisonDmg3 = 0;
                tvLCP1.setText(player1Life + "");
                tvCCP1_2.setText(player1_2Dmg + "");
                tvCCP1_3.setText(player1_2Dmg + "");
                tvPCP1.setText(poisonDmg1 + "");
                tvLCP2.setText(player2Life + "");
                tvCCP2_1.setText(player2_1Dmg + "");
                tvCCP2_3.setText(player2_3Dmg + "");
                tvPCP2.setText(poisonDmg2 + "");
                tvLCP3.setText(player3Life + "");
                tvCCP3_1.setText(player3_1Dmg + "");
                tvCCP3_2.setText(player3_2Dmg + "");
                tvPCP3.setText(poisonDmg3 + "");
                rollDice();

                return true;
            }
        });
    }

    private void setPlayer2() {
        buttonSetPlayer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etPlayer2.setText(etPlayer2.getText().toString());
                tvPlayer1_2.setText(etPlayer2.getText().toString());
                tvPlayer3_2.setText(etPlayer2.getText().toString());
                etPlayer3.requestFocus();
            }
        });
    }

    private void setPlayer3() {
        buttonSetPlayer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etPlayer3.setText(etPlayer3.getText().toString());
                tvPlayer1_3.setText(etPlayer3.getText().toString());
                tvPlayer2_3.setText(etPlayer3.getText().toString());
                etPlayer3.clearFocus();
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

    private void buttonP3LUp() {

        buttonLifeUpP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player3Life++;
                tvLCP3.setText(player3Life + "");
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

    private void buttonP3LDown() {

        buttonLifeDownP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player3Life--;
                tvLCP3.setText(player3Life + "");
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

    private void buttonCMDP3_1Up() {

        buttonCMDP3_1Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player3_1Dmg++;
                tvCCP3_1.setText(player3_1Dmg + "");
            }
        });
    }

    private void buttonCMDP4_1Up() {

        buttonCMDP4_1Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player4_1Dmg++;
                tvCCP4_1.setText(player4_1Dmg + "");
            }
        });
    }

    private void buttonCMDP4_1Down() {

        buttonCMDP4_1Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player4_1Dmg--;
                tvCCP4_1.setText(player4_1Dmg + "");
            }
        });
    }

    private void buttonCMDP3_1Down() {

        buttonCMDP3_1Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player3_1Dmg--;
                tvCCP3_1.setText(player3_1Dmg + "");
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

    private void buttonCMDP1_3Up() {

        buttonCMDP1_3Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_3Dmg++;
                tvCCP1_3.setText(player1_3Dmg + "");
            }
        });
    }

    private void buttonCMDP1_3Down() {

        buttonCMDP1_3Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_3Dmg--;
                tvCCP1_3.setText(player1_3Dmg + "");
            }
        });
    }

    private void buttonCMDP2_3Up() {

        buttonCMDP2_3Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2_3Dmg++;
                tvCCP2_3.setText(player2_3Dmg + "");
            }
        });
    }

    private void buttonCMDP2_3Down() {

        buttonCMDP2_3Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2_3Dmg--;
                tvCCP2_3.setText(player2_3Dmg + "");
            }
        });
    }

    private void buttonCMDP3_2Up() {

        buttonCMDP3_2Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player3_2Dmg++;
                tvCCP3_2.setText(player3_2Dmg + "");
            }
        });
    }

    private void buttonCMDP3_2Down() {

        buttonCMDP3_2Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player3_2Dmg--;
                tvCCP3_2.setText(player3_2Dmg + "");
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

    private void buttonpCP3Up() {

        buttonpCP3Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonDmg3++;
                tvPCP3.setText(poisonDmg3 + "");
            }
        });
    }

    private void buttonpCP3Down() {

        buttonpCP3Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonDmg3--;
                tvPCP3.setText(poisonDmg3 + "");
            }
        });
    }
}
