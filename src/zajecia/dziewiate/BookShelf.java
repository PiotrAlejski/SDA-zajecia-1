package zajecia.dziewiate;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class BookShelf {

    private ArrayList<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public Book get(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooksOf(String writer) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            Writer writerOFBook = book.getWriter();
            boolean searchRequirement =
                    writerOFBook.getFirstName().startsWith(writer) ||
                            writerOFBook.getLastName().startsWith(writer) ||
                            (writerOFBook.getLastName() + " " + writerOFBook.getFirstName()).startsWith(writer) ||
                            writerOFBook.toString().startsWith(writer);
            if (searchRequirement) {
                booksTmp.add(book);
            }

        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksFrom(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate() == releaseDate) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksSince(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate() >= releaseDate) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksLongerThan(int numberOFPages) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : books) {
            if (book.getNumberOFpages() >= numberOFPages) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }
}
