import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Book {
    private String name;
    private List<String> authors;
    private int year;
    private double price;

    public Book(String name, List<String> authors, int year, double price) {
        this.name = name;
        this.authors = authors;
        this.year = year;
        this.price = price;
    }

    public List<String> getAuthors() {
        return authors;
    }

    // Other getters and setters omitted for brevity
}

public class MostProlificAuthor {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Book1", Arrays.asList("Author1", "Author2"), 1990, 29.99),
                new Book("Book2", Arrays.asList("Author1", "Author3"), 1995, 39.99),
                new Book("Book3", Arrays.asList("Author2", "Author3"), 2000, 19.99),
                new Book("Book4", Arrays.asList("Author1"), 2010, 49.99)
        );

        // Find the author who has written the most number of books
        String mostProlificAuthor = books.stream()
                .flatMap(book -> book.getAuthors().stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No authors found");

        System.out.println("Most prolific author: " + mostProlificAuthor);
    }
}
