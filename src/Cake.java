import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cake {
    private String flavor;
    private String dedication;
    private LocalTime startTime; // maciek mi pokazal te medote jakis czas temu wiec uzywam
    private List<Cake_Floor> floors = new ArrayList<>();
    private Cake_Floor cakeFloor;

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
    public List<Cake_Floor> getFloors() {
        return floors;
    }

    public void addFloor() {
        int nextNumber = floors.size() + 1;           // oblicza numer piętra
        Cake_Floor floor = new Cake_Floor(nextNumber); // tworzy nowe piętro WEWNĄTRZ tortu
        floors.add(floor);                             // dodaje do listy
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
            return flavor + " cake," + " number od floors: " + floors.size();
        } else {
            return flavor + " cake," + " dedication: " + dedication + ", number od floors: " + floors.size();
        }
    }
}
