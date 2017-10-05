/**
 * Created by ysiguman on 05/10/17.
 * victord675 [at] gmail.com
 * <p>
 * Description :
 */
public class Camion extends Vehicule {
    private int volume;

    public Camion() {
    }

    public Camion(String modele, int annee, int prix, String imat, char noPermis, int volume) {
        super(modele, annee, prix, imat, noPermis);
        this.volume = volume;
    }

    public boolean peutTransporterVolume (int volume) {
        return volume <= this.volume;
    }
}
