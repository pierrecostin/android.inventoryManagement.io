package edu.android.lab3_nour_pierre_anis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class TotalProductsActivity extends AppCompatActivity {
    private TextView totalTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_layout);

        totalTextView = findViewById(R.id.total);

        Intent intent = getIntent();
        Produits product  = intent.getParcelableExtra("product");
        calculateTotal(product.getProducts());
    }

    private void calculateTotal(List<Produits> produits){

        int total = 0;
        for (int i = 0; i< produits.size();i++){
            total += produits.get(i).getstock();
        }

        totalTextView.setText("Total is : "+total);
    }
}
