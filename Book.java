

public class Book extends Media {
    private final String title;
    private final String author;
    private final String publisher;
    public Book(Format format, String isbn, String genre, String author, String title, String publisher) {
        super(format, isbn, genre);
        this.title = title;
        this.author = author;
        this.publisher = publisher;

    }
    public final String  getTitle() {
        return title;
    }
    public final String  getAuthor() {
        return author;
    }
    public final String  getPublisher() {
        return publisher;
    }
    @Override
    public String getType() {
        return "Book";
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " +author +", " +super.toString();
    }
    public int compareTo(Media other) {
        if(other instanceof Book) {
            return 0;
        }
        else {
            return -1;
        }
        
    }
}