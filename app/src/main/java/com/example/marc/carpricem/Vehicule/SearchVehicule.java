package com.example.marc.carpricem.Vehicule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.marc.carpricem.MainActivity;
import com.example.marc.carpricem.R;
import com.example.marc.carpricem.User.Login;

public class SearchVehicule extends AppCompatActivity implements View.OnClickListener{

    private Button btn_search_recherche;

    private EditText et_car_brand;
    private EditText et_car_model;
    private EditText et_car_type;
    private EditText et_car_state;
    private EditText et_car_country;
    private EditText et_car_town;
    private EditText et_car_price;
    private EditText et_car_year;

    private TextView tv_car_recherche;

    private Vehicule tmpcar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_vehicule);
        this.btn_search_recherche = findViewById(R.id.btn_v_search);
        this.et_car_brand = findViewById(R.id.et_v_brand);
        this.et_car_model = findViewById(R.id.et_v_model);
        this.et_car_type = findViewById(R.id.et_v_type);
        this.et_car_state = findViewById(R.id.et_v_state);
        this.et_car_country = findViewById(R.id.et_v_country);
        this.et_car_town = findViewById(R.id.et_v_town);
        this.et_car_price = findViewById(R.id.et_v_price);
        this.et_car_year = findViewById(R.id.et_v_year);
        this.tv_car_recherche = findViewById(R.id.tv_v_search);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_v_search: SearchCar();break;
        }
    }


    private void SearchCar() {
        this.tmpcar = new Vehicule(et_car_type.toString(),et_car_brand.toString(),et_car_model.toString(),et_car_state.toString(),et_car_year.toString(), Float.parseFloat(et_car_price.toString()),et_car_country.toString(),et_car_town.toString());
        this.tv_car_recherche.setText(tmpcar.toString());
    }
}
