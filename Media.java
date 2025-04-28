public abstract class Media implements Comparable<Media> {
    private final String isbn;
    private final String genre;
    private Format format;
    public Media(Format format, String ISBN, String genre) {
        this.format= format;
        this.isbn = ISBN;
        this.genre = genre;

    }
    public final String getISBN() {
        return isbn;
    }
    public final String getGenre() {
        return genre;
    }
    public final Format getFormat() {
        return format;
    }
    public abstract String getType();
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public abstract int compareTo(Media other);
    @Override
    public String toString() {
        return "Type: " + getType() + ", ISBN: " + isbn + ", Genre: " + genre + ", Format: " + format;
    }    
}