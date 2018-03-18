package com.example.kaseyclark.inclassassignment05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity

{

    private int mTextResId;
    private boolean mAnswer;
    private Button mTrueButton;
    private Button mFalseButton;
    private TextView mQuestionTextView;
    private Button mCheatButton;
    private int mQustion_Index;
    private Question [] questionlist=new Question[6];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // new Question (getString (  R.string.question_africa), false),
               questionlist[0] = new Question (getString ( R.string.question_americas), true);
              //  new Question(getString ( R.string.question_asia), true),
              //  new Question (getString (R.string.question_australia), false),
             //   new  Question (getString (R.string.question_midest), false),
             //   new Question (getString (R.string.question_oceans), true)

         mTrueButton= (Button) findViewById(R.id.true_button);
         mFalseButton= (Button) findViewById(R.id.false_button);
         mCheatButton = (Button) findViewById(R.id.cheat_button);

          mQuestionTextView = (TextView)findViewById(R.id.Question);
          Question mCurrentQuestion= questionlist [mQustion_Index];

          String statement=mCurrentQuestion.getStatement();
          mQuestionTextView.setText(statement);




    }

    //public static Intent newIntent(Context packageContext, boolean asnswerIsCorrect);
    //Intent intent =new Intent(packageConext, cheat activity class )





}
