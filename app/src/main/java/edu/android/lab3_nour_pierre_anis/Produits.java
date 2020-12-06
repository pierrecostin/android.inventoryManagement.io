package edu.android.lab3_nour_pierre_anis;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Produits implements Parcelable {


    private String nomProduit;
    private  String CategProduit;
    private float prixProduit;
    private int stock;

    protected Produits(Parcel in) {
        nomProduit = in.readString();
        CategProduit = in.readString();
        prixProduit = in.readFloat();
        stock = in.readInt();
    }

    public Produits() {
    }

    public static final Creator<Produits> CREATOR = new Creator<Produits>() {
        @Override
        public Produits createFromParcel(Parcel in) {
            return new Produits(in);
        }

        @Override
        public Produits[] newArray(int size) {
            return new Produits[size];
        }
    };

    public String getNomProduit(){return nomProduit;}
    public void  setNomProduit(String nomProduit){this.nomProduit = nomProduit;}

    public String getCategProduit(){return CategProduit;}
    public void  setCategProduit(String CategProduit){this.CategProduit = CategProduit;}

    public float getPrixProduit(){return prixProduit;}
    public void setPrixProduit(float prixProduit){this.prixProduit = prixProduit;}

    public int getstock(){return stock;}
    public void setstock(int stock){this.stock = stock;}

    public Produits(String nomProduit, String CategProduit, int prixProduit, int stock){

        this.nomProduit = nomProduit;
        this.CategProduit = CategProduit;
        this.prixProduit = prixProduit;
        this.stock = stock;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nomProduit);
        parcel.writeString(CategProduit);
        parcel.writeFloat(prixProduit);
        parcel.writeInt(stock);

    }

    public List<Produits> getProducts(){
        ArrayList<Produits> produitsArrayList = new ArrayList<>();
        produitsArrayList.add(new Produits("Pepsi","Boisson",2,5));
        produitsArrayList.add(new Produits("Poulet","Viandes",10,50));
        produitsArrayList.add(new Produits("Ikura Sushi","Poissons",15,100));
        produitsArrayList.add(new Produits("Tomates","Legumes",5,200));
        produitsArrayList.add(new Produits("Oranges","Fruits",9,80));

        return produitsArrayList;
    }
}
