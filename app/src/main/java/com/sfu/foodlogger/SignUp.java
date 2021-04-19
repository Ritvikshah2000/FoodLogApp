package com.sfu.foodlogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        Button signUpBtn = (Button) findViewById(R.id.sign_up_btn);

        btnPress(signUpBtn, LoggedInMenu.makeIntent(SignUp.this));
    }

    private void btnPress(Button button, final Intent intent) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(intent);
            }
        });
    }

    public static Intent makeIntent(Context context) {
        return new Intent(context, SignUp.class);
    }
}
