package com.sfu.foodlogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoggedInMenu extends AppCompatActivity {
    private static boolean isPremiumUser = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logged_in_menu);

        Button analyzeMealBtn = (Button) findViewById(R.id.analyze_meal_btn);
        Button viewPrevReportsBtn = (Button) findViewById(R.id.view_prev_reports_btn);
        Button viewPrevMealsBtn = (Button) findViewById(R.id.view_prev_meals_btn);
        Button subscribeBtn = (Button) findViewById(R.id.sub2premium);
        Button helpBtn = (Button) findViewById(R.id.help_btn);
        Button signOutBtn = (Button) findViewById(R.id.sign_out_btn);

        if (isPremiumUser) {
            subscribeBtn.setVisibility(View.GONE);
        }

        btnPress(analyzeMealBtn, AnalyzeMeal.makeIntent(LoggedInMenu.this));
        btnPress(viewPrevReportsBtn, ViewPrevReports.makeIntent(LoggedInMenu.this));
        btnPress(viewPrevMealsBtn, ViewPrevMeals.makeIntent(LoggedInMenu.this));
        btnPress(subscribeBtn, SubscribePremium.makeIntent(LoggedInMenu.this));
        btnPress(helpBtn, Help.makeIntent(LoggedInMenu.this));
        btnPress(signOutBtn, SignOut.makeIntent(LoggedInMenu.this));
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
        return new Intent(context, LoggedInMenu.class);
    }

    public static void setIsPremiumUser(boolean isPremiumUser) {
        LoggedInMenu.isPremiumUser = isPremiumUser;
    }
}