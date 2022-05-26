package com.example.projetdevapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class ActiviteLegumes extends AppCompatActivity {
    /* Clasa ActiviteLegumes ce corespunde cu layout-ul activity_activite_legumes.xml */
    /* Practic aceasta este pagina care ne va arata produsele din lista de legume */
    /* !!! Produsele au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite_legumes);

        MaterialButton compareTomatos = (MaterialButton) findViewById(R.id.compareTomatos);
        compareTomatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActiviteLegumes.this,ActivitePrixTomatos.class));
            }
        });
    }
}