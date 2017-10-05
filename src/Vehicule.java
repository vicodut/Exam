/**
 * Created by ysiguman on 05/10/17.
 * victord675 [at] gmail.com
 * <p>
 * Description :
 */
public abstract class Vehicule {
    private String modele;
    private int annee;
    private double prix;
    private String imat;
    private char noPermis;
    private boolean loue;
    private int dateAjd = 2017;

    public Vehicule() {
    }

    public Vehicule(String modele, int annee, double prix, String imat, char noPermis) {
        this.modele = modele;
        this.annee = annee;
        this.prix = prix;
        this.imat = imat;
        this.noPermis = noPermis;
    }

    public int age() {
        return this.dateAjd - this.annee;
    }

    public void afficherVehicule() {
        System.out.println("Modèle : " + modele + " Annee d'achat : " + annee + " Prix d'achat: " + prix);
        System.out.println("Imat : " + imat + " Permis : " + noPermis);
        System.out.println("Loué ? " + (loue ? "oui" : "non"));
    }

    public double coutLocation() {
        int age = age();

        if (age < 1) {
            return prix / 200;
        }

        return prix / 250;
    }
}
