package book;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Book> allBooks = Arrays.asList(
            new Book("23","Solaris",7,2.0,true, Book.Genre.ROMANCE),
                new Book("24","MUla",7,200.0,true, Book.Genre.IT),
                new Book("25","Sola",7,2.99,true, Book.Genre.COMEDY),
                new Book("26","ris",7,22.22,true, Book.Genre.SCIFI),
                new Book("27","tesssssss",7,10.9,true, Book.Genre.ROMANCE),
                new Book("28","laaaaa",7,0.99,true, Book.Genre.SCIFI),
                new Book("29","maxxxxxx",7,3.6,true, Book.Genre.ROMANCE)
        );

        List<CheckoutRecordEntry> allEntries = Arrays.asList(
          new CheckoutRecordEntry(allBooks.get(0), LocalDate.of(2021,01,01),
                  LocalDate.of(2021,02,01))      ,
                new CheckoutRecordEntry(allBooks.get(0), LocalDate.of(2022,02,01),
                        LocalDate.of(2022,03,01))      ,
                new CheckoutRecordEntry(allBooks.get(0), LocalDate.of(2021,01,01),
                        LocalDate.of(2021,02,01))      ,
                new CheckoutRecordEntry(allBooks.get(0), LocalDate.of(2021,01,01),
                        LocalDate.of(2021,02,01))      ,
                new CheckoutRecordEntry(allBooks.get(0), LocalDate.of(2022,02,01),
                        LocalDate.of(2022,03,01))
        );


        //2
        System.out.println(allEntries.stream()
                .filter(entry -> entry.getDueDate().equals(LocalDate.of(2022,03,01)))
                .sorted(Comparator.comparing(entry -> entry.getCheckoutDate()))
                .collect(Collectors.toList()));


        //3
        System.out.println(allBooks.stream()
                .filter(book -> book.getGenre().equals(Book.Genre.ROMANCE))
                .map(book -> book.getTitle())
                .sorted(Comparator.comparing(b -> b))
                .collect(Collectors.joining(", ")));


        //4
        System.out.println(allEntries.stream()
                .map(entry -> entry.getBook())
                .map(Book::getPrice)
                .reduce(Double::min)
                .orElse(0.0));

        //5
        BiFunction<List<Book>, Book.Genre,String > FILTER_BY_GENRE
                = (list,genre) -> {
          return list.stream()
                  .filter(book -> book.getGenre().equals(genre))
                  .map(book -> book.getTitle())
                  .sorted()
                  .collect(Collectors.joining(","));
        };

        System.out.println(FILTER_BY_GENRE.apply(allBooks, Book.Genre.ROMANCE));




    }
}
