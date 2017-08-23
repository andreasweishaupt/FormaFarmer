package com.example.andreas.formafarmer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    List<Button> buttons = new ArrayList<Button>();
    Button reset;

    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = (Button)findViewById(R.id.button_reset);
        reset.setOnClickListener(this);

        buttons.add((Button)findViewById(R.id.button1));
        buttons.add((Button)findViewById(R.id.button2));
        buttons.add((Button)findViewById(R.id.button3));
        buttons.add((Button)findViewById(R.id.button4));
        buttons.add((Button)findViewById(R.id.button5));
        buttons.add((Button)findViewById(R.id.button6));
        buttons.add((Button)findViewById(R.id.button7));
        buttons.add((Button)findViewById(R.id.button8));

        for (Button button : buttons) {
            button.setOnClickListener(this);
        }


        counter = 1;

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_reset) {
            counter = 1;
            for (Button button : buttons) {
                button.setText("");
            }
        } else if(counter <= 5 && ((Button)view).getText().length() == 0) {
            ((Button)view).setText(String.valueOf(counter));
            counter++;
        }
    }
}
