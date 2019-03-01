package com.example.tictactoe.Controller;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tictactoe.R;

public class MainActivity extends Activity {
    private Button mULbutton;
    private Button mUCbutton;
    private Button mURbutton;
    private Button mMLbutton;
    private Button mMCbutton;
    private Button mMRbutton;
    private Button mBLbutton;
    private Button mBCbutton;
    private Button mBRbutton;
    private TextView mWinText;
    int mCounter = 0;

    private Button mResetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWinText = (TextView) findViewById(R.id.textView);

        mULbutton = (Button) findViewById(R.id.UpperLeft);
        mUCbutton = (Button) findViewById(R.id.UpperCentre);
        mURbutton = (Button) findViewById(R.id.UpperRight);
        mMLbutton = (Button) findViewById(R.id.MiddleLeft);
        mMCbutton = (Button) findViewById(R.id.MiddleCentre);
        mMRbutton = (Button) findViewById(R.id.MiddleRight);
        mBLbutton = (Button) findViewById(R.id.BottomLeft);
        mBCbutton = (Button) findViewById(R.id.BottomCentre);
        mBRbutton = (Button) findViewById(R.id.BottomRight);
        mResetButton = (Button) findViewById(R.id.resetButton);

        mULbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mULbutton.setText("X");
                    mULbutton.setTextColor(Color.parseColor("#1E90FF"));

                } else {
                    mULbutton.setText("O");
                    mULbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mULbutton.setClickable(false);
                onWin();
            }
        });
        mUCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mUCbutton.setText("X");
                    mUCbutton.setTextColor(Color.parseColor("#1E90FF"));

                } else {
                    mUCbutton.setText("O");
                    mUCbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mUCbutton.setClickable(false);
                onWin();
            }
        });
        mURbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mURbutton.setText("X");
                    mURbutton.setTextColor(Color.parseColor("#1E90FF"));

                } else {
                    mURbutton.setText("O");
                    mURbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mURbutton.setClickable(false);
                onWin();
            }
        });
        mMLbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mMLbutton.setText("X");
                    mMLbutton.setTextColor(Color.parseColor("#1E90FF"));

                } else {
                    mMLbutton.setText("O");
                    mMLbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mMLbutton.setClickable(false);
                onWin();
            }
        });
        mMCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mMCbutton.setText("X");
                    mMCbutton.setTextColor(Color.parseColor("#1E90FF"));


                } else {
                    mMCbutton.setText("O");
                    mMCbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mMCbutton.setClickable(false);
                onWin();
            }
        });
        mMRbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mMRbutton.setText("X");
                    mMRbutton.setTextColor(Color.parseColor("#1E90FF"));

                } else {
                    mMRbutton.setText("O");
                    mMRbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mMRbutton.setClickable(false);
                onWin();
            }
        });
        mBLbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mBLbutton.setText("X");
                    mBLbutton.setTextColor(Color.parseColor("#1E90FF"));

                } else {
                    mBLbutton.setText("O");
                    mBLbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mBLbutton.setClickable(false);
                onWin();
            }
        });
        mBCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mBCbutton.setText("X");
                    mBCbutton.setTextColor(Color.parseColor("#1E90FF"));

                } else {
                    mBCbutton.setText("O");
                    mBCbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mBCbutton.setClickable(false);
                onWin();
            }
        });
        mBRbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCounter % 2 == 0) {
                    mBRbutton.setText("X");
                    mBRbutton.setTextColor(Color.parseColor("#1E90FF"));

                } else {
                    mBRbutton.setText("O");
                    mBRbutton.setTextColor(Color.parseColor("#FF0000"));
                }
                mCounter++;
                mBRbutton.setClickable(false);
                onWin();
            }
        });
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetGame();
            }
        });
    }
        protected void onWin () {
            if (mULbutton.getText().equals("X") && mUCbutton.getText().equals("X") && mURbutton.getText().equals("X")){
                mWinText.setText("Player 1 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mMLbutton.getText().equals("X") && mMCbutton.getText().equals("X") && mMRbutton.getText().equals("X")){
                mWinText.setText("Player 1 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mBLbutton.getText().equals("X") && mBCbutton.getText().equals("X") && mBRbutton.getText().equals("X")){
                mWinText.setText("Player 1 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mULbutton.getText().equals("X") && mMLbutton.getText().equals("X") && mBLbutton.getText().equals("X")){
                mWinText.setText("Player 1 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mUCbutton.getText().equals("X") && mMCbutton.getText().equals("X") && mBCbutton.getText().equals("X")){
                mWinText.setText("Player 1 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mURbutton.getText().equals("X") && mMRbutton.getText().equals("X") && mBRbutton.getText().equals("X")){
                mWinText.setText("Player 1 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mULbutton.getText().equals("X") && mMCbutton.getText().equals("X") && mBRbutton.getText().equals("X")){
                mWinText.setText("Player 1 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mURbutton.getText().equals("X") && mMCbutton.getText().equals("X") && mBLbutton.getText().equals("X")){
                mWinText.setText("Player 1 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            if (mULbutton.getText().equals("O") && mUCbutton.getText().equals("O") && mURbutton.getText().equals("O")){
                mWinText.setText("Player 2 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mMLbutton.getText().equals("O") && mMCbutton.getText().equals("O") && mMRbutton.getText().equals("O")){
                mWinText.setText("Player 2 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mBLbutton.getText().equals("O") && mBCbutton.getText().equals("O") && mBRbutton.getText().equals("O")){
                mWinText.setText("Player 2 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mULbutton.getText().equals("O") && mMLbutton.getText().equals("O") && mBLbutton.getText().equals("O")){
                mWinText.setText("Player 2 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mUCbutton.getText().equals("O") && mMCbutton.getText().equals("O") && mBCbutton.getText().equals("O")){
                mWinText.setText("Player 2 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mURbutton.getText().equals("O") && mMRbutton.getText().equals("O") && mBRbutton.getText().equals("O")){
                mWinText.setText("Player 2 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mULbutton.getText().equals("O") && mMCbutton.getText().equals("O") && mBRbutton.getText().equals("O")){
                mWinText.setText("Player 2 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (mURbutton.getText().equals("O") && mMCbutton.getText().equals("O") && mBLbutton.getText().equals("O")){
                mWinText.setText("Player 2 WINS!!");
                mWinText.setTextColor(Color.parseColor("#008000"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
                endGame();
            }
            else if (!mULbutton.getText().equals("") && !mUCbutton.getText().equals("") && !mURbutton.getText().equals("")
            && !mMCbutton.getText().equals("") && !mMRbutton.getText().equals("") && !mMLbutton.getText().equals("")
            && !mBLbutton.getText().equals("") && !mBCbutton.getText().equals("") && !mBRbutton.getText().equals("")) {
                mWinText.setText("It's a TIE!!");
                mWinText.setTextColor(Color.parseColor("#778899"));
                mWinText.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }

    }
    protected void endGame () {
        mULbutton.setClickable(false);
        mUCbutton.setClickable(false);
        mURbutton.setClickable(false);
        mMLbutton.setClickable(false);
        mMCbutton.setClickable(false);
        mMRbutton.setClickable(false);
        mBLbutton.setClickable(false);
        mBCbutton.setClickable(false);
        mBRbutton.setClickable(false);
    }
    protected void resetGame() {
        mULbutton.setClickable(true);
        mUCbutton.setClickable(true);
        mURbutton.setClickable(true);
        mMLbutton.setClickable(true);
        mMCbutton.setClickable(true);
        mMRbutton.setClickable(true);
        mBLbutton.setClickable(true);
        mBCbutton.setClickable(true);
        mBRbutton.setClickable(true);
        mULbutton.setText("");
        mUCbutton.setText("");
        mURbutton.setText("");
        mMLbutton.setText("");
        mMCbutton.setText("");
        mMRbutton.setText("");
        mBLbutton.setText("");
        mBCbutton.setText("");
        mBRbutton.setText("");
        mCounter=0;
        mWinText.setText("");
        mWinText.setBackgroundColor(Color.parseColor("#C0C0C0"));
    }
}
