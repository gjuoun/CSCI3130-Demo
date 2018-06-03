package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText passwordView;
    private TextView messageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial setting
        passwordView = findViewById(R.id.passwordText);
        passwordView.setText("");

        Button validateButtonView = findViewById(R.id.validateButton);

        messageView = findViewById(R.id.messageView);
        messageView.setText("");
//        messageView.setMovementMethod((new ScrollingMovementMethod())); // set messageView scrollable

        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = passwordView.getText().toString();
                Message msg = new Validator().validate(password);

                messageView.setText(msg.getMessage());
                passwordView.setText("");
            }
        };

        if(validateButtonView!= null){
            validateButtonView.setOnClickListener(myClickListener);
        }
    }
}


