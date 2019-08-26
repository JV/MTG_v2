package com.example.mtg_v2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPlayer1;
    EditText etPlayer2;
    EditText etPlayer3;
    EditText etPlayer4;
    Button buttonSetPlayer1;
    Button buttonSetPlayer2;
    Button buttonSetPlayer3;
    Button buttonSetPlayer4;
    Button buttonLifeUpP1;
    Button buttonLifeUpP2;
    Button buttonLifeUpP3;
    Button buttonLifeUpP4;
    Button buttonLifeDownP1;
    Button buttonLifeDownP2;
    Button buttonLifeDownP3;
    Button buttonLifeDownP4;
    Button buttonCMDP1_2Up;
    Button buttonCMDP1_2Down;
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

    Button buttonpCP1Up;
    Button buttonpCP1Down;
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
    TextView tvLCP1;
    TextView tvLCP2;
    TextView tvLCP3;
    TextView tvLCP4;
    TextView tvCCP1_2;
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
    TextView tvPCP1;
    TextView tvPCP2;
    TextView tvPCP3;
    TextView tvPCP4;
    String player1;
    String player2;
    String player3;
    String player4;
    TextView tvPlayer1_2;
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
    int player1Life = 20;
    int player2Life = 20;
    int player3Life = 20;
    int player4Life = 20;
    int player1_2Dmg = 0;
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
    int poisonDmg1 = 0;
    int poisonDmg2 = 0;
    int poisonDmg3 = 0;
    int poisonDmg4 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        initWidgets();

        setupButtons();


    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putString("Player1Name", etPlayer1.getText().toString());
        savedInstanceState.putString("Player1Life", tvLCP1.getText().toString());
        savedInstanceState.putString("Player1_2CMD", tvCCP1_2.getText().toString());
        savedInstanceState.putString("Player1_3CMD", tvCCP1_3.getText().toString());
        savedInstanceState.putString("Player1_4CMD", tvCCP1_4.getText().toString());
        savedInstanceState.putString("Player1Poison", tvPCP1.getText().toString());

        savedInstanceState.putString("Player2Name", etPlayer2.getText().toString());
        savedInstanceState.putString("Player2Life", tvLCP2.getText().toString());
        savedInstanceState.putString("Player2_1CMD", tvCCP2_1.getText().toString());
        savedInstanceState.putString("Player2_3CMD", tvCCP2_3.getText().toString());
        savedInstanceState.putString("Player2_4CMD", tvCCP2_4.getText().toString());
        savedInstanceState.putString("Player2Poison", tvPCP2.getText().toString());

        savedInstanceState.putString("Player3Name", etPlayer3.getText().toString());
        savedInstanceState.putString("Player3Life", tvLCP3.getText().toString());
        savedInstanceState.putString("Player3_1CMD", tvCCP3_1.getText().toString());
        savedInstanceState.putString("Player3_2CMD", tvCCP3_2.getText().toString());
        savedInstanceState.putString("Player3_4CMD", tvCCP3_4.getText().toString());
        savedInstanceState.putString("Player3Poison", tvPCP3.getText().toString());

        savedInstanceState.putString("Player4Name", etPlayer4.getText().toString());
        savedInstanceState.putString("Player4Life", tvLCP4.getText().toString());
        savedInstanceState.putString("Player4_1CMD", tvCCP4_1.getText().toString());
        savedInstanceState.putString("Player4_2CMD", tvCCP4_2.getText().toString());
        savedInstanceState.putString("Player4_3CMD", tvCCP4_3.getText().toString());
        savedInstanceState.putString("Player4Poison", tvPCP4.getText().toString());


        super.onSaveInstanceState(savedInstanceState);


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {

        etPlayer1.setText(savedInstanceState.getString("Player1Name", ""));
        tvLCP1.setText(savedInstanceState.getString("Player1Life", ""));
        tvCCP1_2.setText(savedInstanceState.getString("Player1_2CMD", ""));;
        tvCCP1_3.setText(savedInstanceState.getString("Player1_3CMD", ""));;
        tvCCP1_4.setText(savedInstanceState.getString("Player1_4CMD", ""));;
        tvPCP1.setText(savedInstanceState.getString("Player1Poison", ""));;

        etPlayer2.setText(savedInstanceState.getString("Player2Name", ""));
        tvLCP2.setText(savedInstanceState.getString("Player2Life", ""));
        tvCCP2_1.setText(savedInstanceState.getString("Player2_1CMD", ""));;
        tvCCP2_3.setText(savedInstanceState.getString("Player2_3CMD", ""));;
        tvCCP2_4.setText(savedInstanceState.getString("Player2_4CMD", ""));;
        tvPCP2.setText(savedInstanceState.getString("Player2Poison", ""));;

        etPlayer3.setText(savedInstanceState.getString("Player3Name", ""));
        tvLCP3.setText(savedInstanceState.getString("Player3Life", ""));
        tvCCP3_1.setText(savedInstanceState.getString("Player3_1CMD", ""));;
        tvCCP3_2.setText(savedInstanceState.getString("Player3_2CMD", ""));;
        tvCCP3_4.setText(savedInstanceState.getString("Player3_4CMD", ""));;
        tvPCP3.setText(savedInstanceState.getString("Player3Poison", ""));;

        etPlayer4.setText(savedInstanceState.getString("Player4Name", ""));
        tvLCP4.setText(savedInstanceState.getString("Player4Life", ""));
        tvCCP4_1.setText(savedInstanceState.getString("Player4_1CMD", ""));;
        tvCCP4_2.setText(savedInstanceState.getString("Player4_2CMD", ""));;
        tvCCP4_3.setText(savedInstanceState.getString("Player4_3CMD", ""));;
        tvPCP4.setText(savedInstanceState.getString("Player4Poison", ""));;

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
        setPlayer2();
        setPlayer3();
        setPlayer4();
        buttonP1LUp();
        buttonP2LUp();
        buttonP3LUp();
        buttonP4LUp();
        buttonP1LDown();
        buttonP2LDown();
        buttonP3LDown();
        buttonP4LDown();
        buttonCMDP1_2Up();
        buttonCMDP2_1Up();
        buttonCMDP3_1Up();
        buttonCMDP4_1Up();
        buttonCMDP1_2Down();
        buttonCMDP2_1Down();
        buttonCMDP3_1Down();
        buttonCMDP4_1Down();
        buttonCMDP1_3Up();
        buttonCMDP1_4Up();
        buttonCMDP1_3Down();
        buttonCMDP1_4Down();
        buttonCMDP2_3Up();
        buttonCMDP2_3Down();
        buttonCMDP2_4Up();
        buttonCMDP2_4Down();
        buttonCMDP3_2Up();
        buttonCMDP4_2Up();
        buttonCMDP3_4Up();
        buttonCMDP4_3Up();
        buttonCMDP3_2Down();
        buttonCMDP3_4Down();
        buttonCMDP4_2Down();
        buttonCMDP4_3Down();
        buttonpCP1Up();
        buttonpCP2Up();
        buttonpCP3Up();
        buttonpCP4Up();
        buttonpCP1Down();
        buttonpCP2Down();
        buttonpCP3Down();
        buttonpCP4Down();
    }

    private void initWidgets() {
        etPlayer1 = findViewById(R.id.etPlayer1);
        etPlayer2 = findViewById(R.id.etPlayer2);
        etPlayer3 = findViewById(R.id.etPlayer3);
        etPlayer4 = findViewById(R.id.etPlayer4);
        buttonSetPlayer1 = findViewById(R.id.buttonSetPlayer1);
        buttonSetPlayer2 = findViewById(R.id.buttonSetPlayer2);
        buttonSetPlayer3 = findViewById(R.id.buttonSetPlayer3);
        buttonSetPlayer4 = findViewById(R.id.buttonSetPlayer4);
        buttonLifeUpP1 = findViewById(R.id.buttonLifeUpP1);
        buttonLifeUpP2 = findViewById(R.id.buttonLifeUpP2);
        buttonLifeUpP3 = findViewById(R.id.buttonLifeUpP3);
        buttonLifeUpP4 = findViewById(R.id.buttonLifeUpP4);
        buttonLifeDownP1 = findViewById(R.id.buttonLifeDownP1);
        buttonLifeDownP2 = findViewById(R.id.buttonLifeDownP2);
        buttonLifeDownP3 = findViewById(R.id.buttonLifeDownP3);
        buttonLifeDownP4 = findViewById(R.id.buttonLifeDownP4);
        buttonCMDP1_2Up = findViewById(R.id.buttonCMDP1_2Up);
        buttonCMDP1_2Down = findViewById(R.id.buttonCMDP1_2Down);
        buttonCMDP2_1Up = findViewById(R.id.buttonCMDP2_1Up);
        buttonCMDP2_1Down = findViewById(R.id.buttonCMDP2_1Down);
        buttonCMDP1_3Up = findViewById(R.id.buttonCMDP1_3Up);
        buttonCMDP1_3Down = findViewById(R.id.buttonCMDP1_3Down);
        buttonCMDP2_3Up = findViewById(R.id.buttonCMDP2_3Up);
        buttonCMDP2_3Down = findViewById(R.id.buttonCMDP2_3Down);
        buttonCMDP1_4Up = findViewById(R.id.buttonCMDP1_4Up);
        buttonCMDP1_4Down = findViewById(R.id.buttonCMDP1_4Down);
        buttonCMDP2_4Up = findViewById(R.id.buttonCMDP2_4Up);
        buttonCMDP2_4Down = findViewById(R.id.buttonCMDP2_4Down);
        buttonpCP1Up = findViewById(R.id.buttonpCP1Up);
        buttonpCP1Down = findViewById(R.id.buttonpCP1Down);
        buttonpCP2Up = findViewById(R.id.buttonpCP2Up);
        buttonpCP2Down = findViewById(R.id.buttonpCP2Down);
        buttonCMDP3_1Up = findViewById(R.id.buttonCMDP3_1Up);
        buttonCMDP3_1Down = findViewById(R.id.buttonCMDP3_1Down);
        buttonCMDP4_1Up = findViewById(R.id.buttonCMDP4_1Up);
        buttonCMDP4_1Down = findViewById(R.id.buttonCMDP4_1Down);
        buttonCMDP3_2Up = findViewById(R.id.buttonCMDP3_2Up);
        buttonCMDP3_2Down = findViewById(R.id.buttonCMDP3_2Down);
        buttonCMDP4_2Up = findViewById(R.id.buttonCMDP4_2Up);
        buttonCMDP4_2Down = findViewById(R.id.buttonCMDP4_2Down);
        buttonCMDP3_4Up = findViewById(R.id.buttonCMDP3_4Up);
        buttonCMDP3_4Down = findViewById(R.id.buttonCMDP3_4Down);
        buttonCMDP4_3Up = findViewById(R.id.buttonCMDP4_3Up);
        buttonCMDP4_3Down = findViewById(R.id.buttonCMDP4_3Down);
        buttonpCP3Up = findViewById(R.id.buttonpCP3Up);
        buttonpCP3Down = findViewById(R.id.buttonpCP3Down);
        buttonpCP4Up = findViewById(R.id.buttonpCP4Up);
        buttonpCP4Down = findViewById(R.id.buttonpCP4Down);
        tvLCP1 = findViewById(R.id.tvLCP1);
        tvLCP2 = findViewById(R.id.tvLCP2);
        tvLCP3 = findViewById(R.id.tvLCP3);
        tvLCP4 = findViewById(R.id.tvLCP4);
        tvCCP1_2 = findViewById(R.id.tvCCP1_2);
        tvCCP2_1 = findViewById(R.id.tvCCP2_1);
        tvCCP3_1 = findViewById(R.id.tvCCP3_1);
        tvCCP4_1 = findViewById(R.id.tvCCP4_1);
        tvCCP1_3 = findViewById(R.id.tvCCP1_3);
        tvCCP2_3 = findViewById(R.id.tvCCP2_3);
        tvCCP3_2 = findViewById(R.id.tvCCP3_2);
        tvCCP4_2 = findViewById(R.id.tvCCP4_2);
        tvCCP1_4 = findViewById(R.id.tvCCP1_4);
        tvCCP2_4 = findViewById(R.id.tvCCP2_4);
        tvCCP3_4 = findViewById(R.id.tvCCP3_4);
        tvCCP4_3 = findViewById(R.id.tvCCP4_3);
        tvPCP1 = findViewById(R.id.tvPCP1);
        tvPCP2 = findViewById(R.id.tvPCP2);
        tvPCP3 = findViewById(R.id.tvPCP3);
        tvPCP4 = findViewById(R.id.tvPCP4);
        tvPlayer1_2 = findViewById(R.id.tvPlayer1_2);
        tvPlayer1_3 = findViewById(R.id.tvPlayer1_3);
        tvPlayer1_4 = findViewById(R.id.tvPlayer1_4);
        tvPlayer2_1 = findViewById(R.id.tvPlayer2_1);
        tvPlayer2_3 = findViewById(R.id.tvPlayer2_3);
        tvPlayer2_4 = findViewById(R.id.tvPlayer2_4);
        tvPlayer3_1 = findViewById(R.id.tvPlayer3_1);
        tvPlayer3_2 = findViewById(R.id.tvPlayer3_2);
        tvPlayer3_4 = findViewById(R.id.tvPlayer3_4);
        tvPlayer4_1 = findViewById(R.id.tvPlayer4_1);
        tvPlayer4_2 = findViewById(R.id.tvPlayer4_2);
        tvPlayer4_3 = findViewById(R.id.tvPlayer4_3);


    }

    private void setPlayer1() {
        buttonSetPlayer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etPlayer1.setText(etPlayer1.getText().toString());
                tvPlayer2_1.setText(etPlayer1.getText().toString());
                tvPlayer3_1.setText(etPlayer1.getText().toString());
                tvPlayer4_1.setText(etPlayer1.getText().toString());
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
                tvPlayer3_2.setText(etPlayer2.getText().toString());
                tvPlayer4_2.setText(etPlayer2.getText().toString());
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
                tvPlayer4_3.setText(etPlayer3.getText().toString());
                etPlayer4.clearFocus();
            }
        });
    }

    private void setPlayer4() {
        buttonSetPlayer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etPlayer4.setText(etPlayer4.getText().toString());
                tvPlayer1_4.setText(etPlayer4.getText().toString());
                tvPlayer3_4.setText(etPlayer4.getText().toString());
                tvPlayer2_4.setText(etPlayer4.getText().toString());
                etPlayer4.clearFocus();

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

    private void buttonP4LUp() {

        buttonLifeUpP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player4Life++;
                tvLCP4.setText(player4Life + "");
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

    private void buttonP4LDown() {

        buttonLifeDownP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player4Life--;
                tvLCP4.setText(player4Life + "");
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

    private void buttonCMDP1_4Up() {

        buttonCMDP1_4Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_4Dmg++;
                tvCCP1_4.setText(player1_4Dmg + "");
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

    private void buttonCMDP1_4Down() {

        buttonCMDP1_4Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player1_4Dmg--;
                tvCCP1_4.setText(player1_4Dmg + "");
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

    private void buttonCMDP2_4Up() {

        buttonCMDP2_4Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2_4Dmg++;
                tvCCP2_4.setText(player2_4Dmg + "");
            }
        });

    }

    private void buttonCMDP2_4Down() {

        buttonCMDP2_4Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player2_4Dmg--;
                tvCCP2_4.setText(player2_4Dmg + "");
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

    private void buttonCMDP4_2Up() {

        buttonCMDP4_2Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player4_2Dmg++;
                tvCCP4_2.setText(player4_2Dmg + "");
            }
        });

    }

    private void buttonCMDP3_4Up() {

        buttonCMDP3_4Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player3_4Dmg++;
                tvCCP3_4.setText(player3_4Dmg + "");
            }
        });

    }


    private void buttonCMDP4_3Up() {

        buttonCMDP4_3Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player4_3Dmg++;
                tvCCP4_3.setText(player4_3Dmg + "");
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


    private void buttonCMDP3_4Down() {

        buttonCMDP3_4Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player3_4Dmg--;
                tvCCP3_4.setText(player3_4Dmg + "");
            }
        });

    }

    private void buttonCMDP4_2Down() {

        buttonCMDP4_2Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player4_2Dmg--;
                tvCCP4_2.setText(player4_2Dmg + "");
            }
        });

    }

    private void buttonCMDP4_3Down() {

        buttonCMDP4_3Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player4_3Dmg--;
                tvCCP4_3.setText(player4_3Dmg + "");
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

    private void buttonpCP4Up() {

        buttonpCP4Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonDmg4++;
                tvPCP4.setText(poisonDmg4 + "");
            }
        });

    }

    private void buttonpCP4Down() {

        buttonpCP4Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poisonDmg4--;
                tvPCP4.setText(poisonDmg4 + "");
            }
        });

    }


}
