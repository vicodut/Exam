/**
 * Created by ysiguman on 05/10/17.
 * victord675 [at] gmail.com
 */
public class Exam {
    public static void main (String[] args) {
        Autocar car = new Autocar("bus1",
            2000,
            20000,
            "AAA-333-FFF",
            'A',
            20,
            35);

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

        camion.afficherCamion();
        System.out.println(camion.peutTransporterVolume(7));
    }
}
