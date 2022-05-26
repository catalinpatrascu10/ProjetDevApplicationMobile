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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nomConnexion = (TextView) findViewById(R.id.nomconnexion);
        TextView motPasse = (TextView) findViewById(R.id.motpasse);

        MaterialButton buttonConnextion = (MaterialButton) findViewById(R.id.buttonconnexion);

        //test et test

        buttonConnextion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(nomConnexion.getText().toString().equals("test") && motPasse.getText().toString().equals("test")){
                    // mot passe correcte
                    Toast.makeText(MainActivity.this, "Bravo!",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,CategorieProduits.class));

            }else
                    Toast.makeText(MainActivity.this, "Sans success!",Toast.LENGTH_SHORT).show();

            }
        });

    }

}