import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBookList;

    public Borrower(String name){
        this.name = name;
        this.borrowedBookList = new ArrayList<>();
    }

    public int borrowedBookCount() {
        return this.borrowedBookList.size();
    }

    public void borrowBook(Library library) {
        this.borrowedBookList.add(library.removeBook());
    }
}
