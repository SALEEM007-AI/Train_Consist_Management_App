import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class PerformanceComparisonApp {
    public static void main(String[] args) {
        // 1. Prepare a collection of bogies
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Passenger", i % 100));
        }

        System.out.println("--- Performance Comparison (Loops vs Streams) ---");

        // 2. Loop-Based Filtering
        long startLoop = System.nanoTime(); // Record start time
        List<Bogie> filteredLoop = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                filteredLoop.add(b);
            }
        }
        long endLoop = System.nanoTime(); // Record end time
        long durationLoop = endLoop - startLoop; // Calculate elapsed time [cite: 1]

        // 3. Stream-Based Filtering [cite: 1]
        long startStream = System.nanoTime();
        List<Bogie> filteredStream = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long durationStream = endStream - startStream;

        // 4. Display Execution Time and Consistency [cite: 1]
        System.out.println("Loop Filtered Count: " + filteredLoop.size());
        System.out.println("Loop Execution Time: " + durationLoop + " nanoseconds");

        System.out.println("Stream Filtered Count: " + filteredStream.size());
        System.out.println("Stream Execution Time: " + durationStream + " nanoseconds");

        if (filteredLoop.size() == filteredStream.size()) {
            System.out.println("Result Consistency: PASSED (Both results match)");
        }
    }
}