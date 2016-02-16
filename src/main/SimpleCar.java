package main;

/**
 * Created by Akarak on 16.02.2016.
 */
public class SimpleCar extends AbstractCar{

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Something custom");
    }

    @Override
    public double getEngineVolume() {
        return 1.7;
    }
}
