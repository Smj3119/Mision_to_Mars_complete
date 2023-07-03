import java.util.Random;

class U1 extends Rocket {
    private static final int MAX_WEIGHT = 18000;
    private static final double CHANCE_OF_LAUNCH_EXPLOSION = 0.05;
    private static final double CHANCE_OF_LAND_EXPLOSION = 0.01;

    private static final int COST = 100;

    public U1() {
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
