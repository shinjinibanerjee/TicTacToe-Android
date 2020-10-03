package com.example.win10.tctactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TwoPlayers extends AppCompatActivity {
    Button b[][]=new Button[4][4];
    int c[][]=new int[4][4];
    EditText p1,p2;
    TextView tv;
    String s1,s2,mark="X";
    int i,j,currentPlayer=1,c1=0;
    boolean gameOver = false,check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_players);
        b[1][1]=findViewById(R.id.one);
        b[1][2]=findViewById(R.id.two);
        b[1][3]=findViewById(R.id.three);
        b[2][1]=findViewById(R.id.four);
        b[2][2]=findViewById(R.id.five);
        b[2][3]=findViewById(R.id.six);
        b[3][1]=findViewById(R.id.seven);
        b[3][2]=findViewById(R.id.eight);
        b[3][3]=findViewById(R.id.nine);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        tv=findViewById(R.id.dialogue);
        s1=p1.getText().toString();
        s2=p2.getText().toString();
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
                c[i][j]=2;
        }

        b[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[1][1].isEnabled()){
                    b[1][1].setText(mark);
                    c[1][1]=c1;
                    toggle();
                    b[1][1].setEnabled(false);
                    check=checkBoard();
                }
            }
        });

        b[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[1][2].isEnabled()){
                    b[1][2].setText(mark);
                    c[1][2]=c1;
                    toggle();
                    b[1][2].setEnabled(false);
                    check=checkBoard();
                }
            }
        });

        b[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[1][3].isEnabled()){
                    b[1][3].setText(mark);
                    c[1][3]=c1;
                    toggle();
                    b[1][3].setEnabled(false);
                    check=checkBoard();
                }
            }
        });

        b[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[2][1].isEnabled()){
                    b[2][1].setText(mark);
                    c[2][1]=c1;
                    toggle();
                    b[2][1].setEnabled(false);
                    check=checkBoard();
                }
            }
        });

        b[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[2][2].isEnabled()){
                    b[2][2].setText(mark);
                    c[2][2]=c1;
                    toggle();
                    b[2][2].setEnabled(false);
                    check=checkBoard();
                }
            }
        });

        b[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[2][3].isEnabled()){
                    b[2][3].setText(mark);
                    c[2][3]=c1;
                    toggle();
                    b[2][3].setEnabled(false);
                    check=checkBoard();
                }
            }
        });

        b[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[3][1].isEnabled()){
                    b[3][1].setText(mark);
                    c[3][1]=c1;
                    toggle();
                    b[3][1].setEnabled(false);
                    check=checkBoard();
                }
            }
        });

        b[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[3][2].isEnabled()){
                    b[3][2].setText(mark);
                    c[3][2]=c1;
                    toggle();
                    b[3][2].setEnabled(false);
                    check=checkBoard();
                }
            }
        });

        b[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
                if(b[3][3].isEnabled()){
                    b[3][3].setText(mark);
                    c[3][3]=c1;
                    toggle();
                    b[3][3].setEnabled(false);
                    check=checkBoard();
                }
            }
        });
        }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem item = menu.add("New Game");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setBoard();
        return true;
    }

    public void setBoard(){
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                c[i][j]=2;
                b[i][j].setEnabled(true);
                b[i][j].setText("");
            }
        }
        p1.setText("Player 1");
        p2.setText("Player 2");
        mark="X";
        currentPlayer=1;
        c1=0;
        gameOver=false;
    }
    public void toggle()
    {
        if (mark=="X")
            mark="O";
        else mark="X";

        if(currentPlayer==1)
            currentPlayer=2;
        else currentPlayer=1;

        if(c1==1)
            c1=0;
        else
            c1=1;
    }


    // check the board to see if someone has won
    public boolean checkBoard() {
        gameOver=false;
        if ((c[1][1] == 0 && c[2][2] == 0 && c[3][3] == 0)
                || (c[1][3] == 0 && c[2][2] == 0 && c[3][1] == 0)
                || (c[1][2] == 0 && c[2][2] == 0 && c[3][2] == 0)
                || (c[1][3] == 0 && c[2][3] == 0 && c[3][3] == 0)
                || (c[1][1] == 0 && c[1][2] == 0 && c[1][3] == 0)
                || (c[2][1] == 0 && c[2][2] == 0 && c[2][3] == 0)
                || (c[3][1] == 0 && c[3][2] == 0 && c[3][3] == 0)
                || (c[1][1] == 0 && c[2][1] == 0 && c[3][1] == 0)) {
            tv.setText("Game over. "+p1.getText().toString()+" has won!");
            gameOver = true;
        } else if ((c[1][1] == 1 && c[2][2] == 1 && c[3][3] == 1)
                || (c[1][3] == 1 && c[2][2] == 1 && c[3][1] == 1)
                || (c[1][2] == 1 && c[2][2] == 1 && c[3][2] == 1)
                || (c[1][3] == 1 && c[2][3] == 1 && c[3][3] == 1)
                || (c[1][1] == 1 && c[1][2] == 1 && c[1][3] == 1)
                || (c[2][1] == 1 && c[2][2] == 1 && c[2][3] == 1)
                || (c[3][1] == 1 && c[3][2] == 1 && c[3][3] == 1)
                || (c[1][1] == 1 && c[2][1] == 1 && c[3][1] == 1)) {
            tv.setText("Game over. "+p2.getText().toString()+" has won!");
            gameOver = true;
        } else {
            boolean empty = false;
            for(i=1; i<=3; i++) {
                for(j=1; j<=3; j++) {
                    if(c[i][j]==2) {
                        empty = true;
                        break;
                    }
                }
            }
            if(!empty) {
                gameOver = true;
                tv.setText("Game over. It's a draw!");
            }
        }
        if(gameOver==true)
            disable();
        return gameOver;
    }

    public void disable()
    {
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
                b[i][j].setEnabled(false);
        }
    }
}
