package com.example.projetdevapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class ActiviteFruits extends AppCompatActivity {
    /* Clasa ActiviteFruits ce corespunde cu layout-ul activity_activite_fruits.xml */
    /* Practic aceasta este pagina care ne va arata produsele din lista de fructe */
    /* !!! Produsele au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_fruits);

        MaterialButton comparePommes = (MaterialButton) findViewById(R.id.comparepommes);
        comparePommes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActiviteFruits.this,ActivitePrixPommes.class));
            }
        });
    }
}