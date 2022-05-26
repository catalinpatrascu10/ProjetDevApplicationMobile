package com.example.projetdevapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    /* Clasa Main ce corespunde cu layout-ul activity_main.xml */
    /* Practic aceasta este pagina principala la deschiderea aplicatiei - Pagina de LOG-IN" */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Aici practic am creat 2 textView pentru id conectare si parola, cu care vom face verificarea logarii mai jos*/
        TextView nomConnexion = (TextView) findViewById(R.id.nomconnexion);
        /* se regaseste dupa id-ul nomconnexion */
        TextView motPasse = (TextView) findViewById(R.id.motpasse);
        /* se regaseste dupa id-ul motpasse */

        /* Acesta este butonul de conectare si se regaseste dupa id-ul buttonconnexion*/
        MaterialButton buttonConnextion = (MaterialButton) findViewById(R.id.buttonconnexion);



        buttonConnextion.setOnClickListener(new View.OnClickListener() {
             /*  La apasarea butonului de conexiune: */
            @Override
            public void onClick(View v){
                /* test et test : credentialele de conectare ale user-ului */
                if(nomConnexion.getText().toString().equals("test") && motPasse.getText().toString().equals("test")){
                    /* daca numele de conexiune este test si parola este tot test : */
                    // mot passe correcte
                    Toast.makeText(MainActivity.this, "Bravo!",Toast.LENGTH_SHORT).show();
                    /* se va afisa mesajul Bravo - adica valid, este corect */


                    startActivity(new Intent(MainActivity.this,CategorieProduits.class));
                    /* Atunci vom face trecerea din clasa MainActivity (pagina curenta, de log-in)
                       prin intermediul INTENT, catre pagina CategorieProduits */
            }else
                    /* daca nu este corect se afisaza mesajul fara succes si ramanem aici, nu facem intent */
                    Toast.makeText(MainActivity.this, "Sans success!",Toast.LENGTH_SHORT).show();

            }
        });

    }

}