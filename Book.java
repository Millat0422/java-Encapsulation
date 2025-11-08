
package book;
public class Book {

    private String title;
    private String author;
    private double price;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            double discountAmount = price * (percentage / 100);
            price -= discountAmount;
            System.out.println("Discount of " + percentage + "% applied successfully!");
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }

    
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price after discount: $" + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        Book b = new Book();

        b.setTitle("Java Programming");
        b.setAuthor("Kawchar Inena");
        b.setPrice(500.00);

        System.out.println("Before discount:");
        b.displayInfo();

        System.out.println("\nApplying 10% discount...");
        b.applyDiscount(10);

        System.out.println("\nAfter discount:");
        b.displayInfo();
    }
}
