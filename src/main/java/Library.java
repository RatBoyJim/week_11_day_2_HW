import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookList;
    private int capacity;
    public String name;

    public Library(int capacity, String name){
        this.bookList = new ArrayList<>();
        this.capacity = capacity;
        this.name = name;
    }

    public int bookCount() {
        return this.bookList.size();
    }

    public void addBook(String title, String author, String genre){
        Book newBook = new Book(title, author, genre);
        if (!checkIfStockFull()){
            this.bookList.add(newBook);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean checkIfStockFull() {
        return this.capacity == bookCount();
    }

    public Book removeBook(){
        return this.bookList.remove(0);
    }

}


