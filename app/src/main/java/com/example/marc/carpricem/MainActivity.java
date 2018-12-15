package com.example.marc.carpricem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_main_accueil;
    private ImageView imgv_logo;
    private Button btn_search;
    private Button btn_home;
    private Button btn_sign;
    private Button btn_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tv_main_accueil =  findViewById(R.id.tv_welcome);
        this.imgv_logo =  findViewById(R.id.iv_logo);
        this.btn_search =  findViewById(R.id.btn_search_car);
        this.btn_home =  findViewById(R.id.btn_welcome);
        this.btn_sign = findViewById(R.id.btn_sign_in);
        this.btn_log = findViewById(R.id.btn_log_in);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.btn_search.setOnClickListener(this);
        this.btn_home.setOnClickListener(this);
        this.btn_sign.setOnClickListener(this);
        this.btn_log.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_welcome: LaunchHome();break;
            case R.id.btn_search_car: LaunchSearch();break;
            case R.id.btn_sign_in: LaunchSign();break;
            case R.id.btn_log_in: LaunchLog();break;

        }
    }

    private void LaunchSearch() {
    }

    private void LaunchHome() {
    }
    private void LaunchSign() {
    }
    private void LaunchLog() {
    }
}
