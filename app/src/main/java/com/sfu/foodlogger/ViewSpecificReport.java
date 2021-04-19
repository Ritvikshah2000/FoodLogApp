package com.sfu.foodlogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class ViewSpecificReport extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specific_report);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.micro_macro_nutrients, new MacronutrientFragment());
        ft.commit();

        Button viewSpecificReportBackBtn = (Button) findViewById(R.id.report_back_btn);
        Button macronutrientBtn = (Button) findViewById(R.id.macronutrient_btn);
        Button micronutrientBtn = (Button) findViewById(R.id.micronutrient_btn);

        viewSpecificReportBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        micronutrientBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.micro_macro_nutrients, new MicronutrientFragment());
                ft.commit();
            }
        });

        macronutrientBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.micro_macro_nutrients, new MacronutrientFragment());
                ft.commit();
            }
        });
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
        return new Intent(context, ViewSpecificReport.class);
    }
}
