package com.example.marc.carpricem.User;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.marc.carpricem.R;

public class Login extends AppCompatActivity implements View.OnClickListener{

    private Button btn_act_login;

    private EditText et_user;
    private EditText et_pwrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.btn_act_login = findViewById(R.id.btn_login);
        this.et_user = findViewById(R.id.et_username);
        this.et_pwrd = findViewById(R.id.et_passaword);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:  CheckLogin();break;
        }
    }

    private void CheckLogin() {
        this.et_user.setText("");
        this.et_pwrd.setText("");
    }
}
