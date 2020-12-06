package edu.android.lab3_nour_pierre_anis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class produitAdapter extends RecyclerView.Adapter<produitAdapter.produitViewHolder>{
    List<Produits> listeProduits;
    public static class produitViewHolder extends RecyclerView.ViewHolder{

        TextView NomP;
        TextView CategP;
        TextView PrixP;
        TextView StockP;

        public produitViewHolder(@NonNull View itemView) {
            super(itemView);
            NomP = itemView.findViewById(R.id.nomP);
            CategP = itemView.findViewById(R.id.categP);
            PrixP = itemView.findViewById(R.id.prixP);
            StockP = itemView.findViewById(R.id.stockP);
        }
    }

    public produitAdapter(List<Produits> listeProduits) {
        this.listeProduits = listeProduits;
    }

    @NonNull
    @Override
    public produitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_produits, parent,false);
        return new produitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull produitViewHolder holder, int position) {
     Produits produits = listeProduits.get(position);
     holder.NomP.setText(produits.getNomProduit());
     holder.CategP.setText(produits.getCategProduit());
     holder.PrixP.setText(String.valueOf(produits.getPrixProduit()));
     holder.StockP.setText(String.valueOf(produits.getstock()));
    }

    @Override
    public int getItemCount() {
        return listeProduits.size();
    }


}
