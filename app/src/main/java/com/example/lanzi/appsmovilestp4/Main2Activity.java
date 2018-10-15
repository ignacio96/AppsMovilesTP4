package com.example.lanzi.appsmovilestp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String items[] = new String[] {"Arroz blanco","Pan de trigo","Aceite de oliva","Manteca","Leche","Yogurt","Costillar","Lomo de ternera","Manzana"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position <= 1){
                    Toast.makeText(Main2Activity.this, "Categoria: Cereales y legumbres", Toast.LENGTH_SHORT).show();
                }
                if (position == 2){
                    Toast.makeText(Main2Activity.this, "Categoria: Aceites", Toast.LENGTH_SHORT).show();
                }
                if (position <= 5 && position >= 3) {
                    Toast.makeText(Main2Activity.this, "Categoria: Lacteos", Toast.LENGTH_SHORT).show();
                }
                if (position <= 7 && position >= 6) {
                    Toast.makeText(Main2Activity.this, "Categoria: Carnes", Toast.LENGTH_SHORT).show();
                }
                if (position == 8) {
                    Toast.makeText(Main2Activity.this, "Categoria: Frutas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
