package com.sfu.foodlogger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button createAccountBtn = (Button) findViewById(R.id.create_account_btn);
        Button logInBtn = (Button) findViewById(R.id.log_in_btn);

//        subscribe to premium button
//        Button subscribe = (Button) findViewById(R.id.sub2premium);

        btnPress(createAccountBtn, SignUp.makeIntent(MainActivity.this));
        btnPress(logInBtn, SignIn.makeIntent(MainActivity.this));

//        subscribe to premium button press event
//        btnPress(subscribe, SubscribePremium.makeIntent(MainActivity.this));
    }

    private void btnPress(Button button, final Intent intent) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

    public static Intent makeIntent(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }
}