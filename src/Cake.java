import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cake {
    private String dedication;
    private LocalDateTime startTime;
    private List<CakeLayer> layers = new ArrayList<>();

    public Cake() {
        this.startTime = LocalDateTime.now();

    }

    public Cake(String dedication) {
        this.startTime = LocalDateTime.now();
        this.dedication = dedication;
    }

    private class CakeLayer {
        private int number;
        private int diameter;
        private String flavor;

        private CakeLayer(int number, int diameter, String flavor) {
            this.number = number;
            this.diameter = diameter;
            this.flavor = flavor;
        }
    }

    public Duration timePassed() {
        return Duration.between(this.startTime, LocalDateTime.now());
    }

    public List<CakeLayer> getLayers() {
        return List.copyOf(layers); // ZAPAMIETAC TO NA ZAWSZE
    }

    public void addLayer(int diameter, String flavor) {
        if (layers.isEmpty() || diameter <= layers.get(layers.size() - 1).diameter) {
           layers.add(new CakeLayer(layers.size() + 1, diameter, flavor));
        } else {
            System.out.println("Cannot add bigger layer on smaller one!");
        }
    }

    public void removeTopLayer() {
        if (!layers.isEmpty()) {
            layers.remove(layers.size() - 1);
        }
    }

    public int getHeight() {
        return 8 * layers.size();
    }

    public String toString() {
        if (dedication == null) {
            return "Cake," + " number of layers: " + layers.size();
        } else {
            return "Cake," + " dedication: " + dedication + ", number of layers: " + layers.size();
        }
    }
}
