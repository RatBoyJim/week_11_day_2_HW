import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<>();
    }

    public int bookCount() {
        return this.bookList.size();
    }
}
