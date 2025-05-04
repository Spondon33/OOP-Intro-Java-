public class TextBook {
    String isbn;
    String bookTitle;
    String authorName;
    double price;
    int availableQuantity;
    int standard;
    static double discountRate;

    TextBook(){

    }
    TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard){
        setIsbn(isbn);
        setBookTitle(bookTitle);
        setAuthorName(authorName);
        setPrice(price);
        setAvailableQuantity(availableQuantity);
        setStandard(standard);
    }

    static void setDiscountRate(double rate){
        discountRate = rate;
    }
    static double getDiscountRate(){
        return discountRate;
    }

    void setIsbn(String isbn){
        this.isbn = isbn;
    }
    void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setAvailableQuantity(int availableQuantity){
        this.availableQuantity = availableQuantity;
    }
    void setStandard(int standard){
        this.standard = standard;
    }

    String getIsbn(){
        return isbn;
    }
    String getBookTitle(){
        return bookTitle;
    }
    String getAuthorName(){
        return authorName;
    }
    double getPrice(){
        return price;
    }
    int getAvailableQuantity(){
        return availableQuantity;
    }
    int getStandard(){
        return standard;
    }

    void addQuantity(int amount){
        availableQuantity += amount;
    }
    void sellQuantity(int amount){
        availableQuantity -= amount;
    }

    void showDetails(){
        System.out.println("Isbn: " + isbn);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Available Quantity: " + availableQuantity);
        System.out.println("Standard: " + standard);
        System.out.println("Discount Rate: " + discountRate);
    }
}
