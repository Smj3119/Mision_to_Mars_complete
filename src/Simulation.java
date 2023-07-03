import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Simulation {


    List<Item> loadItems(String filename) {
        List<Item> items = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split("=");
                String itemName = parts[0];
                int itemWeight = Integer.parseInt(parts[1]);
                Item item = new Item(itemName, itemWeight);
                items.add(item);
            }

            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return items;
    }
    public List<Rocket> loadU1(List<Item> items) {
        List<Rocket> rockets = new ArrayList<>();

        U1 rocket = new U1();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new U1();
                rocket.carry(item);
            }
        }
        rockets.add(rocket);

        return rockets;
    }

    public List<Rocket> loadU2(List<Item> items) {
        List<Rocket> rockets = new ArrayList<>();

        U1 rocket = new U1();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (rocket.canCarry(item)) {
                rocket.carry(item);
            } else {
                rockets.add(rocket);
                rocket = new U1();
                rocket.carry(item);
            }
        }
        rockets.add(rocket);

        return rockets;
    }

    int runSimulation(List<Rocket> rockets) {
        int totalBudget = 0;

        for (Rocket rocket : rockets) {
            totalBudget += rocket.getCOST();

            while (!rocket.launch() || !rocket.land()) {
                totalBudget += rocket.getCOST();
            }
        }

        return totalBudget;
    }

    }

