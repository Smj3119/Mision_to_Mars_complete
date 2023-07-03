import java.util.ArrayList;
import java.util.List;

public class Rocket implements SpaceShip {
    private int currentWeight;
    private int maxWeight;
    private int COST;
    private List<Item> items;

    public Rocket(int maxWeight) {
        this.maxWeight = maxWeight;
        currentWeight = 0;
        items = new ArrayList<>();
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return (currentWeight + item.getWeight()) <= maxWeight;
    }

    @Override
    public void carry(Item item) {
        currentWeight += item.getWeight();
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }
    public int getCOST() {
        return COST;
    }
}
