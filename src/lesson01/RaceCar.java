package lesson01;

/**
 * Created by Akarak on 16.02.2016.
 */
public class RaceCar extends AbstractCar {
    RaceCar() {
        speed = 200;
    }

    @Override
    public double getEngineVolume() {
        return 3.5;
    }
}
