import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private List<Photo> album = new ArrayList<>();

    public Album(String name) {
    this.name = name;
    }

    public void addPhoto(Photo photo) {
        album.add(photo);
    }

    public void deletePhoto(Photo photo) {
        album.remove(photo);
    }

    public int countPhotos() {
        return album.size();

    }

    public String toString() {
        return "This is a " + name;
    }
    public List<Photo> getAlbum() {
        return album; // moznaby ewentualnie  return new ArrayList<>(album); tak aby bylo bezpieczniej ale na potrzeby zadania zostawiam tak
    }

    }


