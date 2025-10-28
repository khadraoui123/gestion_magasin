

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produit pVide = new Produit();

        Scanner sc = new Scanner(System.in);

        System.out.println("identifiant");
        int id = sc.nextInt();

        System.out.println("libelle");
        String libelle = sc.next();

        System.out.println("marque");
        String marque = sc.next();

        System.out.println("prix");
        double prix = sc.nextDouble();

        Produit pUser = new Produit(id, libelle, marque, prix);

        Produit p1 = new Produit(1021, "Lait", "Delice");
        Produit p2 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p3 = new Produit(3250, "Tomate", "Sicam");

        p1.afficher();
        p2.afficher();
        p3.afficher();

        p1.setPrix(0.700);
        System.out.println("Après modification du prix:");
        p1.afficher();

        p2.setPrix(2.500);

        System.out.println("Produits modifiés:");
        p1.afficher();
        p2.afficher();
        p3.afficher();

        System.out.println("Avec toString():");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(pUser.toString());

        // Test Magasin
        Magasin magasin = new Magasin(1, "123 Rue Principale", 10);
        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        magasin.ajouterProduit(p3);
        magasin.afficher();

        sc.close();
    }
}