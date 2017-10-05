/**
 * Created by ysiguman on 05/10/17.
 * victord675 [at] gmail.com
 * <p>
 * Description :
 */
public class Autocar extends Vehicule {
    private int volume;
    private int places;

    public Autocar() {
    }

    public Autocar(String modele, int annee, int prix, String imat, char noPermis, int volume, int places) {
        super(modele, annee, prix, imat, noPermis);
        this.volume = volume;
        this.places = places;
    }

    public boolean peutTransporterPassager (int nbPassager, int volPassager) {
        return (nbPassager <= places && nbPassager * volPassager <= volume);
    }
}
