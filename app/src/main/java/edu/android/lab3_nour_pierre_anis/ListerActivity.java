package edu.android.lab3_nour_pierre_anis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListerActivity extends AppCompatActivity {
private RecyclerView recycleview;
private RecyclerView.LayoutManager layoutManager;
private produitAdapter produitAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister);


        recycleview = (RecyclerView) findViewById(R.id.recycleView);
        layoutManager = new LinearLayoutManager(this);
        recycleview.setLayoutManager(layoutManager);

        Intent intent = getIntent();
        Produits product  = intent.getParcelableExtra("product");
        produitAdapter = new produitAdapter(product.getProducts());
        recycleview.setAdapter(produitAdapter);


       /* ArrayList<Produits> arrayListReception  = intent.getParcelableExtra("produitsArrayList");
        String Str = "";
        for(int i=0 ; i<arrayListReception.size();i++) {
          Str += Produits.instanceSingleton.getNomProduit(i) + " " + Produits.instanceSingleton.getCategProduit(i) + " " + Produits.instanceSingleton.getPrixProduit(i) + " " + Produits.instanceSingleton.getstock(i);

        }
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Str);*/
    }
}