import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp(){
        library = new Library(2);
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void booksCanBeAddedToLibrary(){
        library.addBook("High Fidelity", "Nick Hornby", "Fiction");
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(2, library.getCapacity());
    }

}
