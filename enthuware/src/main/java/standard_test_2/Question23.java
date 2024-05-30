package standard_test_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question23 {

    public static void main(String[] args) {
        var books = new ArrayList<>(List.of(
                new Book("The Outsider", "fiction"),
                new Book("Becoming", "non-fiction"),
                new Book("Uri", "non-fiction")));

        books.sort(Comparator.comparing(Book::getGenre)
                .thenComparing(Book::getTitle)
                .reversed());

        System.out.println(books);
    }

}

class Book {

    private final String title;
    private final String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

}
