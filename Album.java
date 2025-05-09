
import java.util.ArrayList;
import java.util.List;
public class Album extends Music {
    private final List<String> trackList;
    public Album(Format format, String isbn, String genre, String artist, String title, int year, List<String> trackList) {
        super(format, isbn, genre, artist, title, year);
        this.trackList = new ArrayList<String>();
        this.trackList.addAll(trackList);
    }
    @Override
    public String getType() {
        return "Album";
    }
    public final  List<String> getTrackList() {
        return trackList;
    }
    

    @Override
    public String toString() {
        return super.toString() + " ,Tracks: " + trackList;
    }
}