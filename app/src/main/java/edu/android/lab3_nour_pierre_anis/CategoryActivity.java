package edu.android.lab3_nour_pierre_anis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    private String[] categories;
    private TextView productTextView;
    private Produits product;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Spinner spinner = findViewById(R.id.spinner);
        productTextView = findViewById(R.id.textViewCateg);

        Intent intent = getIntent();
        product  = intent.getParcelableExtra("product");
        createCategories(product.getProducts());
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,
                android.R.id.text1,categories);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(listener);
    }

    private AdapterView.OnItemSelectedListener listener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            productTextView.setText(product.getProducts().get(position).getNomProduit());
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    private void createCategories(List<Produits> produits){

        categories = new String[produits.size()];

        for (int i = 0; i< produits.size();i++){
            categories[i] = produits.get(i).getCategProduit();
        }
    }
}
