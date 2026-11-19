import Sun.Stars;
import Sun.Planet;

public class Q12_Satellite {
    public void showSatellite() {
        System.out.println("A satellite revolves around a planet or another object.");
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        Planet planet = new Planet();
        Q12_Satellite satellite = new Q12_Satellite();

        stars.showStars();
        planet.showPlanet();
        satellite.showSatellite();
    }
}
