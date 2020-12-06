package edu.android.lab3_nour_pierre_anis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private Produits myPrduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPrduct = new Produits();
        myPrduct.getProducts();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_action_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.lister){
            Intent intent = new Intent(MainActivity.this, ListerActivity.class);
            intent.putExtra("product", myPrduct);
            startActivity(intent);
            return true;
        }
           if (id == R.id.categorie) {
               Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
               intent.putExtra("product", myPrduct);
               startActivity(intent);
               return true;
           }
            if(id == R.id.total) {
                Intent intent = new Intent(MainActivity.this, TotalProductsActivity.class);
                intent.putExtra("product", myPrduct);
                startActivity(intent);
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
    }



   /* public void lister(View view) {

        Intent intent = new Intent(MainActivity.this, ListerActivity.class);
        intent.putExtra("product", myPrduct);

        startActivity(intent);

    }

    public void listerParCategorie(View view) {
        Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
        intent.putExtra("product", myPrduct);

        startActivity(intent);
    }

    public void totalite(View view) {

        Intent intent = new Intent(MainActivity.this, TotalProductsActivity.class);
        intent.putExtra("product", myPrduct);

        startActivity(intent);
    }*/

