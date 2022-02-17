package book;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CheckoutRecordEntry {

    private Book book;
    private LocalDate checkoutDate;
    private LocalDate dueDate;

    public CheckoutRecordEntry(Book book, LocalDate checkoutDate, LocalDate dueDate) {
        this.book = book;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        String pattern = "MM/dd/yyyy";
        return "[" + book +
                ", checkoutDate=" + checkoutDate.format(DateTimeFormatter.ofPattern(pattern)) +
                ", dueDate=" + dueDate.format(DateTimeFormatter.ofPattern(pattern)) +
                ']';
    }
}
