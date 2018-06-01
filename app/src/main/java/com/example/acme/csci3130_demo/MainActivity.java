package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText userInput;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial setting
        userInput = findViewById(R.id.editText);
        userInput.setText("");

        Button button = findViewById(R.id.button);

        textView = findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod((new ScrollingMovementMethod())); // set textView scrollable

        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!userInput.getText().toString().equals("")) {
                    String result = userInput.getText().toString();
                    result = result + "\n";
                    textView.append(result);
                    userInput.setText("");
                }
            }
        };

        if(button!= null){
            button.setOnClickListener(myClickListener);
        }
    }
}


