package com.example.kaseyclark.inclassassignment05;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity

{

    private int mTextResId;
    private boolean mAnswer;
    private Button mTrueButton;
    private Button mFalseButton;
    private TextView mQuestionTextView;
    private Button mCheatButton;
    private int mQuestion_Index;
    private Button next_button;
    private Question [] questionlist=new Question[6];
    private static final int CHEATCODE=0;
    private boolean isCheater;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode != Activity.RESULT_OK)
            return;


        if (requestCode == CHEATCODE) {
            if (data == null)
                return;
            isCheater=data.getBooleanExtra("cheat", false);

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionlist[0]= new Question (getString (  R.string.question_africa), false);
               questionlist[1] = new Question (getString ( R.string.question_americas), true);
               questionlist[2]= new Question(getString ( R.string.question_asia), true);
               questionlist[3]= new Question(getString (R.string.question_australia), false);
               questionlist[4]= new  Question(getString (R.string.question_midest), false);
                questionlist[5]=new Question(getString (R.string.question_oceans), true);

         mTrueButton= (Button) findViewById(R.id.true_button);
         mFalseButton= (Button) findViewById(R.id.false_button);
         mCheatButton = (Button) findViewById(R.id.cheat_button);
         next_button=(Button) findViewById(R.id.next_button);

          mQuestionTextView = (TextView)findViewById(R.id.Question);
          Question mCurrentQuestion= questionlist [mQuestion_Index];

          String statement=mCurrentQuestion.getStatement();
          mQuestionTextView.setText(statement);

        next_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               mQuestion_Index++;
               if (mQuestion_Index == 5)
                   mQuestion_Index=0;
                Question mCurrentQuestion= questionlist [mQuestion_Index];

                String statement=mCurrentQuestion.getStatement();
                mQuestionTextView.setText(statement);
            }


        });

        mTrueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Question mCurrentQuestion= questionlist [mQuestion_Index];
                if (isCheater==true)
                    Toast.makeText(MainActivity.this, "You Cheated!", Toast.LENGTH_SHORT).show();
            else if (mCurrentQuestion.isStatementTrue())
                Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();

            }


        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Question mCurrentQuestion= questionlist [mQuestion_Index];
                if (isCheater==true)
                    Toast.makeText(MainActivity.this, "You Cheated!", Toast.LENGTH_SHORT).show();
                else if (mCurrentQuestion.isStatementTrue())
                    Toast.makeText(MainActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }


        });

        mCheatButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Question mCurrentQuestion= questionlist [mQuestion_Index];

                Intent intent = new Intent (MainActivity.this, CheatActivity.class);
                intent.putExtra("answer", mCurrentQuestion.isStatementTrue() );
                startActivityForResult(intent, CHEATCODE);
            }


        });

    }

    //public static Intent newIntent(Context packageContext, boolean asnswerIsCorrect);
    //Intent intent =new Intent(packageConext, cheat activity class )





}
