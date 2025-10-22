public class produit {
    private int identifient;
    private String libelle;
    private String marque;
    private double prix;

    public  produit(){}

    public   produit (int identifient, String libelle, String marque, double prix) {
        this.identifient = identifient;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    public produit(int identifiant, String libelle, String marque) {
        this.identifient = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = 0.0;
    }

    public void afficher() {
        System.out.println("ID: " + identifient);
        System.out.println("Libellé: " + libelle);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
        System.out.println("-------------------");
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Produit{" +
                "id=" + identifient +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }
}
