import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MediaLibrary {
    private final List<Label<String, Media>> library;
    public MediaLibrary() {
        this.library = new ArrayList<>();
    }
    public void add(String name, Media media) throws MediaAlreadyInLibrary {
        Label<String, Media> newLabel = new Label<>(name, media);
        for (Label<String, Media> item :library) {
            if (item.equals(newLabel)) {
                throw new  MediaAlreadyInLibrary(name, media);
            }
        }
        library.add(newLabel);
 
    
    }
    public List<Label<String, Media>> filter(MediaFilter mediaFilter) {
        List<Label<String, Media>> filteredList = new ArrayList<>();
    
    for (Label<String, Media> item : library) {
        if (mediaFilter.matches(item)) {
            filteredList.add(item);
        }
        
    }
    return filteredList;
}
    

    
    public void sort() {
        Collections.sort(library);
    }


}