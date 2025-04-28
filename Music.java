public abstract class  Music extends Media {
    private final String artist; //getter?
    private final String title; //ggeter?
    private final int year; // getter?
    public Music(Format format, String isbn, String genre, String artist, String title, int year) {
    super(format, isbn, genre);
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    public final String getArtist() {
        return artist;
    }
    public final String getTitle() {
        return title;
    }
    public final int getYear() {
        return year;
    }
    @Override
    public String getType() {
        return "Music";
    }
    @Override
    public String toString() {
        return "Artist: " + artist + ", Year:" + year + ", Title: " + title + ", " +super.toString();    
    }
    @Override 
    public int compareTo(Media other) {
        if ((other instanceof Music)) {
            // Music should come after Book, Movie, Series
            return 0;
        }
        else {
            return -1;
        }


}
}