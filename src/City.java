import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<City> destinations;
    private List<Integer> costs;

    City(String name) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
    }

    String setName(String name) {
        this.name = name;
        return this.name;
    }
    String getName() {
        return this.name;
    }

    public void addRoute(City destination, int cost) {
        destinations.add(destination);
        costs.add(cost);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Из города " + name + " можно попасть в:" + "\n");
        for (int i = 0; i < destinations.size(); i++) {
            sb.append("  -> ").append(destinations.get(i).getName()).append(": ").append(costs.get(i)).append("\n");
        }
        return sb.toString();
    }
}
