/**
 * Created by ysiguman on 05/10/17.
 * victord675 [at] gmail.com
 * <p>
 * Description :
 */
public class Autocar extends Camion {
    private int places;

    public Autocar() {
    }

    public Autocar(String modele, int annee, int prix, String imat, char noPermis, int volume, int places) {
        super(modele, annee, prix, imat, noPermis, volume);
        this.places = places;
    }

    public boolean peutTransporterPassager (int nbPassager, double volPassager) {
        return (nbPassager <= places && nbPassager * volPassager <= volume);
    }


    public void afficherCamion() {
        System.out.println(modele + annee + prix + imat + noPermis + volume + places);
    }
}
