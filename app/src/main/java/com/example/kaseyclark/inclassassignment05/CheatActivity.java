package com.example.kaseyclark.inclassassignment05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CheatActivity extends AppCompatActivity {

    private Button cheat_button;
    private TextView answer_text;
    private boolean answer_is_true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        cheat_button=(Button)findViewById(R.id.show_answer_button);
        answer_text=(TextView)findViewById(R.id.show_answer_text);

        answer_is_true=getIntent().getBooleanExtra("answer", false);

        cheat_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (answer_is_true == true)
                    answer_text.setText("True");
                else
                    answer_text.setText("False");
            }

        });
    }
}
