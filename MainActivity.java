package com.example.ashnaanil.myapplicationmonday2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


//https://www.youtube.com/watch?v=JA9s_Fntg_4 reference for app

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Questions myQuestions = new Questions();

    private String myAnswer;
    private int myScore = 0;
    private int myQuestionsLength = myQuestions.myQuestions.length;

    Random r;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score: " + myScore);
        updateQuestion(r.nextInt(myQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == myAnswer) {
                    myScore++;
                    score.setText("Score: " + myScore);
                    updateQuestion(r.nextInt(myQuestionsLength));
                } else {
                    gameOver();
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == myAnswer) {
                    myScore++;
                    score.setText("Score: " + myScore);
                    updateQuestion(r.nextInt(myQuestionsLength));
                } else {
                    gameOver();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == myAnswer) {
                    myScore++;
                    score.setText("Score: " + myScore);
                    updateQuestion(r.nextInt(myQuestionsLength));
                } else {
                    gameOver();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == myAnswer) {
                    myScore++;
                    score.setText("Score: " + myScore);
                    updateQuestion(r.nextInt(myQuestionsLength));
                } else {
                    gameOver();
                }

            }
        });
    }

    private void updateQuestion(int number) {
        question.setText(myQuestions.getQuestions(number));
        answer1.setText(myQuestions.getChoice1(number));
        answer2.setText(myQuestions.getChoice2(number));
        answer3.setText(myQuestions.getChoice3(number));
        answer4.setText(myQuestions.getChoice4(number));

        myAnswer = myQuestions.getCorrectAnswer(number);
    }

    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game over! Your score is " + myScore + " points.")
                .setCancelable(false)
                .setPositiveButton("New Game",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                    })
                .setNegativeButton("EXIT",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

        Button positiveButton = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE);
        Button negativeButton = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);

        positiveButton.setTextColor(Color.parseColor("#FF0B8B42"));
        negativeButton.setTextColor(Color.parseColor("#FFFF0400"));


    }
}
