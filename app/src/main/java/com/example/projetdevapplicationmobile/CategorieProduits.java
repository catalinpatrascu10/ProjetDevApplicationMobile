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
    /* Clasa CategorieProduits ce corespunde cu layout-ul activity_categorie_produits.xml */
    /* Practic aceasta este prima pagina pe care user-ul o vede atunci cand acceseaza aplicatia */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie_produits);
        /* Am utilizat o lista de categorii de produse */
        ListView categProduits = findViewById(R.id.categproduits);

        List<String> categorieProd = new ArrayList<>();
        categorieProd.add("Fruits"); /* Pozitia 0 */
        categorieProd.add("Legumes"); /* Pozitia 1 */
        categorieProd.add("Pattiserie"); /* Pozitia 2 */
        categorieProd.add("Boissons"); /* Pozitia 3 */

        ArrayAdapter adapteur = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,categorieProd);
        categProduits.setAdapter(adapteur);

        /* La apasare click : */
        categProduits.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    // Daca apas pe pozitia 0 a listei: A ales Fructe
                    // Fac Intent catre pagina clasei cu Fructe
                    startActivity(new Intent(CategorieProduits.this,ActiviteFruits.class));
                }
                else if(i==1){
                    // Daca apas pe pozitia 1 a listei: A ales Legume
                    // Fac Intent catre pagina clasei cu Legume
                    startActivity(new Intent(CategorieProduits.this,ActiviteLegumes.class));

                }else if(i==2){
                    // Daca apas pe pozitia 2 a listei: A ales Pattiserie
                    // Fac Intent catre pagina clasei cu Patiserie
                    startActivity(new Intent(CategorieProduits.this,ActivitePattiserie.class));

                }else if(i==3){
                    // Daca apas pe pozitia 3 a listei: A ales Bauturi
                    // Fac Intent catre pagina clasei cu Bauturi
                    startActivity(new Intent(CategorieProduits.this,ActiviteBoissons.class));

                }
            }
        });

    }

}