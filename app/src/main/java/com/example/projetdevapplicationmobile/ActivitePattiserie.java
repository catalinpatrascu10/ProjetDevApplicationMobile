package com.example.projetdevapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivitePattiserie extends AppCompatActivity {
    /* Clasa ActivitePattiserie ce corespunde cu layout-ul activity_activite_pattiserie.xml */
    /* Practic aceasta este pagina care ne va arata produsele din lista de patiserie */
    /* !!! Produsele au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_pattiserie);
    }
}