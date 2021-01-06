import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Borrower borrower;

    @Before
    public void setUp(){
        library = new Library(2);
        borrower = new Borrower("Andy");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void bookCanBeAddedToLibrary(){
        library.addBook("High Fidelity", "Nick Hornby", "Fiction");
        assertEquals(1, library.bookCount());
    }

    @Test
    public void bookCannotBeAddedToLibrary(){
        library.addBook("High Fidelity", "Nick Hornby", "Fiction");
        library.addBook("1984", "George Orwell", "Science Fiction");
        library.addBook("Inferno", "Dante Alighieri", "Poetry");
        assertEquals(2, library.bookCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void borrowerCanBorrowBook(){
        library.addBook("High Fidelity", "Nick Hornby", "Fiction");
        library.addBook("1984", "George Orwell", "Science Fiction");
        assertEquals(2, library.bookCount());
        borrower.borrowBook(library);
        assertEquals(1, library.bookCount());
        assertEquals(1, borrower.borrowedBookCount());
    }
}
