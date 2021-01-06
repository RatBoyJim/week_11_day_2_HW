import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp(){
        book = new Book("1984", "George Orwell", "Science Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("1984", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("George Orwell", book.getAuthor());
    }

}
