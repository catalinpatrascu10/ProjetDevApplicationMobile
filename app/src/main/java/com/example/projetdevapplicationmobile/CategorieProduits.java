package com.example.projetdevapplicationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CategorieProduits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie_produits);

        ListView categProduits = findViewById(R.id.categproduits);

        List<String> categorieProd = new ArrayList<>();
        categorieProd.add("Fruits");
        categorieProd.add("Legumes");
        categorieProd.add("Pattiserie");
        categorieProd.add("Boissons");

        ArrayAdapter adapteur = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,categorieProd);
        categProduits.setAdapter(adapteur);

        categProduits.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    //A ales Fructe
                    startActivity(new Intent(CategorieProduits.this,ActiviteFruits.class));
                }
                else if(i==1){
                    //A ales Legume
                    startActivity(new Intent(CategorieProduits.this,ActiviteLegumes.class));

                }else if(i==2){
                    //A ales Pattiserie
                    startActivity(new Intent(CategorieProduits.this,ActivitePattiserie.class));

                }else if(i==3){
                    //A ales Bauturi
                    startActivity(new Intent(CategorieProduits.this,ActiviteBoissons.class));

                }
            }
        });

    }

}