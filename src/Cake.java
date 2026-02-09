import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cake {
    private String flavor;
    private String dedication;
    private LocalTime startTime; // maciek mi pokazal te medote jakis czas temu wiec uzywam
    private List<Cake_Layer> layers = new ArrayList<>();
    private Cake_Layer cakeFloor;
    int diameter;


    public Cake(String flavor, LocalTime startTime) {
        this.flavor = flavor;
        this.startTime = startTime;

    }

    public Cake(String flavor, LocalTime startTime, String dedication) {
        this.flavor = flavor;
        this.startTime = startTime;
        this.dedication = dedication;
    }

    public LocalTime setTime() {
        return startTime;
    }

    public Duration timePassed() {
        return Duration.between(startTime, LocalTime.now()); // tutaj czat podpowiedzial, ze tak mozna i w sumie spoko
    }

    public List<Cake_Layer> getLayers() {
        return layers;
    }

    public void addLayer(int diameter, String flavor) {
        int nextNumber = layers.size() + 1;           // oblicza numer piętra
        Cake_Layer layer = new Cake_Layer(nextNumber); // tworzy nowe piętro WEWNĄTRZ tortu
        layers.add(layer);                             // dodaje do listy
    }

    public void removeTopLayer() {
        int topLayer = layers.size() - 1;
        Cake_Layer layer = layers.get(topLayer);
        layers.remove(topLayer);
    }

    public int getHighness() {
        int oneLayer = 8;
        return oneLayer * layers.size();
    }


    public String getFlavor() {
        return flavor;
    }

    public String getDedication() {
        return dedication;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
    public String toString() {
        if (dedication == null) {
            return flavor + " cake," + " number of layers: " + layers.size();
        } else {
            return flavor + " cake," + " dedication: " + dedication + ", number of layers: " + layers.size();
        }
    }
}
