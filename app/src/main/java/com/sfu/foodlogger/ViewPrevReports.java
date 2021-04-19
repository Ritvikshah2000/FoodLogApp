package com.sfu.foodlogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ViewPrevReports extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prev_reports_list);

        Button prevReportBackBtn = (Button) findViewById(R.id.prev_report_back_btn);
        Button specificReportBtn = (Button) findViewById(R.id.specific_report_btn);
        Button specificReportBtn2 = (Button) findViewById(R.id.specific_report_btn2);
        Button specificReportBtn3 = (Button) findViewById(R.id.specific_report_btn3);
        Button specificReportBtn4 = (Button) findViewById(R.id.specific_report_btn4);
        Button specificReportBtn5 = (Button) findViewById(R.id.specific_report_btn5);
        Button specificReportBtn6 = (Button) findViewById(R.id.specific_report_btn6);
        Button specificReportBtn7 = (Button) findViewById(R.id.specific_report_btn7);
        Button specificReportBtn8 = (Button) findViewById(R.id.specific_report_btn8);

        prevReportBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnPress(specificReportBtn, ViewSpecificReport.makeIntent(ViewPrevReports.this));
        btnPress(specificReportBtn2, ViewSpecificReport.makeIntent(ViewPrevReports.this));
        btnPress(specificReportBtn3, ViewSpecificReport.makeIntent(ViewPrevReports.this));
        btnPress(specificReportBtn4, ViewSpecificReport.makeIntent(ViewPrevReports.this));
        btnPress(specificReportBtn5, ViewSpecificReport.makeIntent(ViewPrevReports.this));
        btnPress(specificReportBtn6, ViewSpecificReport.makeIntent(ViewPrevReports.this));
        btnPress(specificReportBtn7, ViewSpecificReport.makeIntent(ViewPrevReports.this));
        btnPress(specificReportBtn8, ViewSpecificReport.makeIntent(ViewPrevReports.this));
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
        return new Intent(context, ViewPrevReports.class);
    }
}
