import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cake {
    private String flavor;
    private String dedication;
    private LocalDateTime startTime;
    private List<CakeLayer> layers = new ArrayList<>();

    public Cake(String flavor) {
        this.flavor = flavor;
        this.startTime = LocalDateTime.now();

    }

    public Cake(String flavor, String dedication) {
        this.flavor = flavor;
        this.startTime = LocalDateTime.now();
        this.dedication = dedication;
    }

    private class CakeLayer {  //  NIE WIEM W SUMIE CZY TO MOZNA ZROBIC W TAKI SPOSOB
        private int number;
        private int diameter;
        private String flavor; // tylko to jest na szaro ale jak usune to nie dziala CakeLayer

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
        int nextNumber = layers.size() + 1;       // oblicza pietro
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
            return flavor + " cake," + " number of layers: " + layers.size();
        } else {
            return flavor + " cake," + " dedication: " + dedication + ", number of layers: " + layers.size();
        }
    }


}
