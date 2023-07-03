import java.util.List;

public class Main {

    public static void main(String[] args) {
    Simulation simulation = new Simulation();

        List<Item> phase1Items = simulation.loadItems("phaese1.txt");
        List<Item> phase2Items = simulation.loadItems("phaese2.txt");

        List<Rocket> u1Phase1Rockets = simulation.loadU1(phase1Items);
        List<Rocket> u1Phase2Rockets = simulation.loadU1(phase2Items);

        int u1Phase1Budget = simulation.runSimulation(u1Phase1Rockets);
        System.out.println("Total Budget for U1 Rockets in Phase-1: $" + u1Phase1Budget + " million");

        int u1Phase2Budget = simulation.runSimulation(u1Phase2Rockets);
        System.out.println("Total Budget for U1 Rockets in Phase-2: $" + u1Phase2Budget + " million");

        List<Rocket> u2Phase1Rockets = simulation.loadU2(phase1Items);
        List<Rocket> u2Phase2Rockets = simulation.loadU2(phase2Items);

        int u2Phase1Budget = simulation.runSimulation(u2Phase1Rockets);
        System.out.println("Total Budget for U2 Rockets in Phase-1: $" + u2Phase1Budget + " million");

        int u2Phase2Budget = simulation.runSimulation(u2Phase2Rockets);
        System.out.println("Total Budget for U2 Rockets in Phase-2: $" + u2Phase2Budget + " million");
    }
}
