package com.example.marc.carpricem.User;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.marc.carpricem.MainActivity;
import com.example.marc.carpricem.R;
import com.example.marc.carpricem.Vehicule.SearchVehicule;

public class Login extends AppCompatActivity implements View.OnClickListener{

    private Button btn_act_login;
    private Button btn_act_back;

    private EditText et_user;
    private EditText et_pwrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.btn_act_login = findViewById(R.id.btn_login);
        this.btn_act_back = findViewById(R.id.btn_back);
        this.et_user = findViewById(R.id.et_username);
        this.et_pwrd = findViewById(R.id.et_passaword);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:  CheckLogin();break;
            case R.id.btn_back: BackHome();break;
        }
    }

    private void BackHome() {
        finish();
    }

    private void CheckLogin() {
    }
}
