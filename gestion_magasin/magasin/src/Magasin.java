class Magasin {
    private int identifiant;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nbProduitsActuels = 0;

    private static final int MAX_CAPACITE = 50;
    private static int totalProduits = 0;

    public Magasin(int identifiant, String adresse, int capacite) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = Math.min(capacite, MAX_CAPACITE);
        this.produits = new Produit[this.capacite];
    }

    public void ajouterProduit(Produit p) {
        if (nbProduitsActuels < capacite) {
            produits[nbProduitsActuels++] = p;
            totalProduits++;
        } else {
            System.out.println("Magasin plein ! Impossible d'ajouter plus de produits.");
        }
    }

    public void afficher() {
        System.out.println("========= Magasin " + identifiant + " =========");
        System.out.println("Adresse : " + adresse);
        System.out.println("Capacité : " + capacite);
        System.out.println("Produits :");
        for (int i = 0; i < nbProduitsActuels; i++) {
            System.out.println("- " + produits[i].getLibelle() + " | Prix : " + produits[i].getPrix() + " DT");
        }
        System.out.println("-------------------------------------");
    }

    public static int getTotalProduits() {
        return totalProduits;
    }
}