package com.example.kaseyclark.inclassassignment05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private int mTextResId;
    private boolean mAnswer;
    private Button mTrueButton;
    private Button mFalseButton;
    private TextView mQuestionTextView;
    private Button showAnswerButton;
    private Question [] questionlist=new Question[]{
            new Question (getString (  R.string.question_africa), false),
            new Question (getString ( R.string.question_americas), true),
            new Question(getString ( R.string.question_asia), true),
            new Question (getString (R.string.question_australia), false),
            new  Question (getString (R.string.question_midest), false),
            new Question (getString (R.string.question_oceans), true)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //public static Intent newIntent(Context packageContext, boolean asnswerIsCorrect);
    //Intent intent =new Intent(packageConext, cheat activity class )





}
