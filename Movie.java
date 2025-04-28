import java.util.ArrayList;
import java.util.List;
public class Movie extends Media {
    private final String title;
    private final String director;
    private final int year;
    private final List<String> cast;
    public Movie(Format format, String isbn, String genre, String title, String director, int year, List<String> cast) {
        super(format, isbn, genre);
        this.year = year;
        this.title = title;
        this.director = director;
        this.cast = new ArrayList<String>();
        this.cast.addAll(cast);
    }
    public final String getTitle() {
        return title;
    }
    public final String getDirector() {
        return director;
    }
    public final int getYear() {
        return year;
    }
    public final List<String> getCast() {
        return cast;
    }
    @Override
    public String getType() {
        return "Movie";
    }
    @Override 
    public String toString() {
        return "Title: " + title + ", Year: " + year + ", " + super.toString();
    }
    @Override
    public int compareTo(Media other) {
        if ((other instanceof Movie)) {
            
            return 0;
        }
        else {
            return -1;
        }

}
}