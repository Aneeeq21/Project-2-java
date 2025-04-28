public class  SearchFilter implements MediaFilter {
    private final String searchTerm;
    public SearchFilter(String searchTerm) {
        this.searchTerm = searchTerm;
    } 
    //matches missing
    @Override
    public boolean matches(Label<String, Media> label) {
        if(label.getKey() == this.searchTerm) {
            return true;
        }
        else if (label.getValue().toString().indexOf(this.searchTerm)>-1) {
            return true;
        }
      return false;

    }

}