/**
 * Created by ysiguman on 05/10/17.
 * victord675 [at] gmail.com
 */
public class Exam {
    public static void main (String[] args) {
        Autocar car = new Autocar("FRI",
            2005,
            90000,
            "4567WX01",
            'D',
            3,
            53);

        Voiture voiture = new Voiture("Twingo",
            2017,
            10000,
            "1234 AZ 49",
            'B',
            true);

        Camion camion = new Camion("J9",
            2012,
            20000,
            "987 BCD 75",
            'B',
            7);

        voiture.afficherVoiture();
        camion.afficherCamion();
        System.out.println(camion.peutTransporterVolume(7));
        voiture.coutLocation();
        camion.coutLocation();
        car.peutTransporterPassager(40, 0.1);
    }
}
