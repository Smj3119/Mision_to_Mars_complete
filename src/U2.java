import java.util.Random;

public class U2 extends Rocket{

    private static final int MAX_WEIGHT = 29000;
    private static final double CHANCE_OF_LAUNCH_EXPLOSION = 0.04;
    private static final double CHANCE_OF_LAND_EXPLOSION = 0.08;

    private static final int COST = 120;

    public U2() {
        super(MAX_WEIGHT);
    }

    @Override
    public boolean launch() {
        double random = new Random().nextDouble();
        return random >= CHANCE_OF_LAUNCH_EXPLOSION * ((double) getCurrentWeight() / MAX_WEIGHT);
    }


    @Override
    public boolean land() {
        double random = new Random().nextDouble();
        return random >= CHANCE_OF_LAND_EXPLOSION * ((double) getCurrentWeight() / MAX_WEIGHT);
    }
    public int getCOST() {
        return COST;
    }
}
