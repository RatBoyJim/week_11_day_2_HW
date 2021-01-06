import java.util.ArrayList;
import java.util.HashMap;

public class HashMapGenres {
    public static void main(String[] args) {
        HashMap<String, Integer> genres = new HashMap<>();
        ArrayList<Book> bookList = new ArrayList<>();
        Library library = new Library(3, "The Michael Anderson library for kids who don't know how to read as well as they should, and want to read better, and do other things better as well.");

        library.addBook("High Fidelity", "Nick Hornby", "Fiction");
        library.addBook("1984", "George Orwell", "Science Fiction");
        library.addBook("Inferno", "Dante Alighieri", "Poetry");
        library.addBook("The Count of Monte Cristo", "Alexandre Dumas", "Fiction");

        genres.put("Fiction", 2);
        genres.put("Science Fiction", 1);
        genres.put("Poetry", 1);

        System.out.println(genres.get("Fiction"));
        System.out.println(library.name);
    }
}
