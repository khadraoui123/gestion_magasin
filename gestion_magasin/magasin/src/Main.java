import java .util.Scanner;
public class Main {
    public static void main(String[] args) {

        produit pVide = new produit();

        Scanner sc = new Scanner(System.in);

        System.out.println("identifient");
        int id = sc.nextInt();

        System.out.println("libelle");
        String libelle = sc.next();

        System.out.println("marque");
        String marque = sc.next();

        System.out.println("prix");
        int prix = sc.nextInt();

        produit pUser = new produit(id, libelle, marque, prix);


        produit p1 = new produit(1021, "Lait", "Delice");
        produit p2 = new produit(2510, "Yaourt", "Vitalait");
        produit p3 = new produit(3250, "Tomate", "Sicam");


        p1.afficher();
        p2.afficher();
        p3.afficher();
        pUser.afficher();

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

    }
}


