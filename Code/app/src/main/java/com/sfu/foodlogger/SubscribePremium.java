package com.sfu.foodlogger;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubscribePremium extends AppCompatActivity {
    String name, email, cardholdername, expdata;
    int cardnumber, cvv;
    Button submitButton;
    EditText nameInput;
    EditText emailInput;
    EditText cardholdernameInput;
    EditText cardnumberInput;
    EditText expirationdateInput;
    EditText cvvInput;

    String subscribe = "You are now a premium user!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subscribe_premium);

        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        cardholdernameInput = (EditText) findViewById(R.id.cardholdernameInput);
        cardnumberInput = (EditText) findViewById(R.id.cardnumberInput);
        expirationdateInput = (EditText) findViewById(R.id.expirationdateInput);
        cvvInput = (EditText) findViewById(R.id.cvvInput);


        Button subscribePremiumBackBtn = (Button) findViewById(R.id.sub_back_btn);
        submitButton = (Button) findViewById(R.id.submitButton);

        subscribePremiumBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        subBtnPress(submitButton, LoggedInMenu.makeIntent(SubscribePremium.this));
    }


    // subscribe button press that modifies static boolean isPremiumUser and displays msg
    private void subBtnPress(Button button, final Intent intent) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoggedInMenu.setIsPremiumUser(true);
                Toast toast = Toast.makeText(SubscribePremium.this, "You are now a premium user!", Toast.LENGTH_LONG);
                toast.show();
                finish();
                startActivity(intent);
            }
        });
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, SubscribePremium.class);
    }
}
