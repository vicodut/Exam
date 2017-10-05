/**
 * Created by ysiguman on 05/10/17.
 * victord675 [at] gmail.com
 * <p>
 * Description :
 */
public class Voiture extends Vehicule {
    private boolean autoRadio;

    public Voiture(String modele, int annee, int prix, String imat, char noPermis, boolean autoRadio) {
        super(modele, annee, prix, imat, noPermis);
        this.autoRadio = autoRadio;
    }
}
