# ProjetDevApplicationMobile
projet

Scopul Temei:

Practic Aplicatia propune o Lista Inteligenta prin intermediul careia:

-> putem sa ne logam in aplicatie doar prin ID Connexion: test si Parola: test. 
-> putem vedea mai multe categorii de produse . Ex. : Bauturi, Fructe, Legume
-> putem vedea produsele din fiecare categorie. Ex. : Fructe: Mere; Pere; Ananas.
-> putem vedea prin intermediului botonului Compare, preturile la 3 lanturi de magazine diferite pentru a alege cea mai buna varianta atunci cand dorim sa cumparam produsul : Kaufland; Lidl; Carrefour

Explicatii Cod: 

-> Fiecare clasa Java este legata de layout-ul activity.xml (DESIGN)
Ex. MainActivity.java - activity_main.xml

*) MainActivity

Clasa Main ce corespunde cu layout-ul activity_main.xml 
Practic aceasta este pagina principala la deschiderea aplicatiei - Pagina de LOG-IN" 
Aici practic am creat 2 textView ce se regasesc dupa id-urile din xml pentru id conectare si parola, cu care vom face verificarea logarii 
butonul de conectare si se regaseste dupa id-ul buttonconnexion
La apasarea butonului de conexiune: 
    test et test : credentialele de conectare ale user-ului 
    daca numele de conexiune este test si parola este tot test : 
    mot passe correcte
    se va afisa mesajul Bravo - adica valid, este corect
    Atunci vom face trecerea din clasa MainActivity (pagina curenta, de log-in) prin intermediul INTENT, catre pagina CategorieProduits 
    daca nu este corect se afisaza mesajul fara succes si ramanem aici, nu facem intent */

*) CategorieProduits

Clasa CategorieProduits ce corespunde cu layout-ul activity_categorie_produits.xml 
Practic aceasta este prima pagina pe care user-ul o vede atunci cand acceseaza aplicatia
Am utilizat o lista de categorii de produse
        List<String> categorieProd = new ArrayList<>();
        categorieProd.add("Fruits"); /* Pozitia 0 */
        categorieProd.add("Legumes"); /* Pozitia 1 */
        categorieProd.add("Pattiserie"); /* Pozitia 2 */
        categorieProd.add("Boissons"); /* Pozitia 3 */
La apasare click :
    Daca apas pe pozitia 0 a listei: A ales Fructe
    Fac Intent catre pagina clasei cu Fructe

    Daca apas pe pozitia 1 a listei: A ales Legume
    Fac Intent catre pagina clasei cu Legume
    
    Daca apas pe pozitia 2 a listei: A ales Pattiserie
    Fac Intent catre pagina clasei cu Patiserie

    Daca apas pe pozitia 3 a listei: A ales Bauturi
    Fac Intent catre pagina clasei cu Bauturi

*) ActivitePrixTomatos

Clasa ActivitePrixTomatos ce corespunde cu layout-ul activity_activite_prix_tomatos.xml 
Practic aceasta este pagina ce ne arata preturile Rosiilor la diferite lanturi de supermarket-uri 
!!! Preturile au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date 

*) ActivitePrixPommes

Clasa ActivitePrixPommes ce corespunde cu layout-ul activity_activite_prix_pommes.xml 
Practic aceasta este pagina ce ne arata preturile Rosiilor la diferite lanturi de supermarket-uri 
!!! Preturile au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date 

*) ActivitePattiserie

Clasa ActivitePattiserie ce corespunde cu layout-ul activity_activite_pattiserie.xml 
Practic aceasta este pagina care ne va arata produsele din lista de patiserie 
!!! Produsele au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date 

*) ActiviteLegumes

Clasa ActiviteLegumes ce corespunde cu layout-ul activity_activite_legumes.xml 
Practic aceasta este pagina care ne va arata produsele din lista de legume 
!!! Produsele au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date

*) ActiviteFruits
Clasa ActiviteFruits ce corespunde cu layout-ul activity_activite_fruits.xml 
Practic aceasta este pagina care ne va arata produsele din lista de fructe 
!!! Produsele au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date 

*) ActiviteBoissons

Clasa ActiviteBoissons ce corespunde cu layout-ul activity_activite_boissons.xml
Practic aceasta este pagina care ne va arata produsele din lista de bauturi
!!! Produsele au fost puse doar cu ImageView si TextView, nu vin dintr-o baza de date