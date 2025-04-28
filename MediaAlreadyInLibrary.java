public class MediaAlreadyInLibrary extends Exception {
    private final String name;
    private final Media media;
    public MediaAlreadyInLibrary(String name, Media media) {
        super("Media already in library.");
        this.name= name;
        this.media=media;
    }
    public String getName() {
        return name;
    }
    public Media getMedia() {
        return media;
    }
}