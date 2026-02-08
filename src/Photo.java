public class Photo {
    private String name;
    private int year;
    private String description;

    public Photo(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Photo(String name, int year, String description) {
        this.name = name;
        this.year = year;
        this.description = description;
    }
    public String toString() {
        if (description == null) {
            return  name + ", year: " + year;
        } else {
            return name + ", year: " + year + ", description: " + description;
        }

    }
}
