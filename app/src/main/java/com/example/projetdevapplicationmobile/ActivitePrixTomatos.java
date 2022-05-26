package com.example.projetdevapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivitePrixTomatos extends AppCompatActivity {
    /* Clasa ActivitePrixTomatos ce corespunde cu layout-ul activity_activite_prix_tomatos.xml */
    /* Practic aceasta este pagina ce ne arata preturile Rosiilor la diferite lanturi de supermarket-uri */
    /* !!! Preturile au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_prix_tomatos);
    }
}