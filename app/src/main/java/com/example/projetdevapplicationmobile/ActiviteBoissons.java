package com.example.projetdevapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActiviteBoissons extends AppCompatActivity {
    /* Clasa ActiviteBoissons ce corespunde cu layout-ul activity_activite_boissons.xml */
    /* Practic aceasta este pagina care ne va arata produsele din lista de bauturi */
    /* !!! Produsele au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_boissons);
    }
}