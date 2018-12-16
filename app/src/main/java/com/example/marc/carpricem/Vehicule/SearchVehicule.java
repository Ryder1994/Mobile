package com.example.marc.carpricem.Vehicule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.marc.carpricem.MainActivity;
import com.example.marc.carpricem.R;
import com.example.marc.carpricem.User.Login;

public class SearchVehicule extends AppCompatActivity implements View.OnClickListener{

    private Button btn_search_recherche;
    private Button btn_search_retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_vehicule);
        this.btn_search_recherche = findViewById(R.id.btn_search);
        this.btn_search_retour = findViewById(R.id.btn_retour);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_search: SearchCar();break;
            case R.id.btn_retour: BackHome();break;
        }
    }

    private void BackHome() {

    }

    private void SearchCar() {
        //Intent i = new Intent(SearchVehicule.this, );
        //startActivity(i);
    }
}
