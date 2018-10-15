package com.example.lanzi.appsmovilestp4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = (ListView) findViewById(R.id.lvItems);
        adaptador = new Adaptador(this, GetArrayItems());
        lvItems.setAdapter(adaptador);
    }

//    public void boton(View view) {
//        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//        startActivity(intent);
//    }

    private ArrayList<Entidad> GetArrayItems() {
        ArrayList<Entidad> listItems =  new ArrayList<>();
        //cereales y legumbres y harinas
        listItems.add(new Entidad("Arroz blanco", "calorias: 354 kcal c/100 g", "HC:  0.5%", "proteinas: 14%", "grasas: 18.3%"));
        listItems.add(new Entidad("Pan de trigo blanco", "calorias: 255 kcal c/100 g", "HC:  0.5%", "proteinas: 14%", "grasas: 18.3%"));

        //Aceites y grasas
        listItems.add(new Entidad("Aceite de oliva", "calorias: 884 cal c/100 g", "HC:  0%", "proteinas: 0%", "grasas: 100%"));
        listItems.add(new Entidad("Aceite de girasol", "calorias: 884 cal c/100 g", "HC:  0%", "proteinas: 0%", "grasas: 100%"));
        listItems.add(new Entidad("Manteca", "calorias: 902 cal c/100 g", "HC:  0%", "proteinas: 0%", "grasas: 100%"));

        //Laceteos
        listItems.add(new Entidad("Leche", "calorias: 61 cal c/100 g", "HC:  4.8%", "proteinas: 3.1%", "grasas: 3.3%"));
        listItems.add(new Entidad("Leche condensada", "calorias: 63 cal c/100 g", "HC:  4.7%", "proteinas: 3.3%", "grasas: 3.5%"));
        listItems.add(new Entidad("Yogurt", "calorias: 496 cal c/100 g", "HC:  38.4%", "proteinas: 26.3%", "grasas: 26.7%"));

        //carnes
        listItems.add(new Entidad("Costillar de ternera", "calorias: 251 cal c/100 g", "HC:  0%", "proteinas: 32.4%", "grasas: 12.5%"));
        listItems.add(new Entidad("Lomo de ternera", "calorias: 284 cal c/100 g", "HC:  0%", "proteinas: 30.2%", "grasas: 17.2%"));
        listItems.add(new Entidad("Hamburguesa", "calorias: 230 cal c/100 g", "HC:  0.5%", "proteinas: 14%", "grasas: 18.3%"));

        //frutas
        listItems.add(new Entidad("Manzana", "calorias: 52 cal c/100 g", "HC:  0%", "proteinas: 30.2%", "grasas: 17.2%"));

        return listItems;
    }
}


