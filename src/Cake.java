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
        if (!layers.isEmpty()) {
            CakeLayer topLayer = layers.get(layers.size() - 1);

            if (diameter > topLayer.diameter) {
                System.out.println("Cannot add bigger layer on smaller one!");
                return;
            }
        }

        int nextNumber = layers.size() + 1;
        CakeLayer layer = new CakeLayer(nextNumber, diameter, flavor);
        layers.add(layer);
    }

    public void removeTopLayer() {
        if (!layers.isEmpty()) {
            layers.remove(layers.size() - 1);
        }
    }

    public int getHeight() {
        int oneLayer = 8;
        return oneLayer * layers.size();
    }

    public String toString() {
        if (dedication == null) {
            return "Cake," + " number of layers: " + layers.size();
        } else {
            return "Cake," + " dedication: " + dedication + ", number of layers: " + layers.size();
        }
    }
}
