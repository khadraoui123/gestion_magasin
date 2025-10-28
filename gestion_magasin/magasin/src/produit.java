import java.util.Scanner;

class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;

    public Produit() {}

    public Produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public Produit(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = 0.0;
    }

    public void afficher() {
        System.out.println("ID: " + identifiant);
        System.out.println("Libellé: " + libelle);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
        System.out.println("-------------------");
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }

    public String toString() {
        return "Produit{" +
                "id=" + identifiant +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }
}