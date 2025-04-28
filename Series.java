import java.util.ArrayList;
import java.util.List;
public class Series extends Media {
    private final String title;
    private final List<String> cast;
    private final List<String> episodes;
    public Series(Format format, String isbn, String genre, String title, List<String> cast, List<String> episodes) {
        super(format, isbn, genre);
        this.title=title;
        this.cast = new ArrayList<String>();
        this.cast.addAll(cast);
        this.episodes = new ArrayList<String>();
        this.episodes.addAll(episodes);
    }
    public final List<String> getCast() {
        return cast;
    }
    public final List<String> getEpisodes() {
        return episodes;
    }
    public final String getTitle() {
        return title;
    }
    @Override
    public String getType() {
        return "Series";
    }
    @Override
    public String toString() {
        return "Title: " + title +", " + super.toString();
    }
    @Override
    public int compareTo(Media other) {
        if ((other instanceof Series)) {
            
            return 0;
        }
        else {
            return -1;
        }

}
}