import java.util.ArrayList;
import java.util.List;

// Reusing Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBogies:");
        System.out.println(bogies);

        // Stream aggregation (Total capacity)
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // aggregate

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Verify original list unchanged
        System.out.println("\nOriginal Bogies After Aggregation (unchanged):");
        System.out.println(bogies);
    }
}