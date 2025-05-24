class Book {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private int addedAmount;
    private int soldAmount;

    Book() {

    }

    Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        setIsbn(isbn);
        setBookTitle(bookTitle);
        setAuthorName(authorName);
        setPrice(price);
        setAvailableQuantity(availableQuantity);
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    String getIsbn() {
        return isbn;
    }

    String getBookTitle() {
        return bookTitle;
    }

    String getAuthorName() {
        return authorName;
    }

    double getPrice() {
        return price;
    }

    int getAvailableQuantity() {
        return availableQuantity;
    }

    void addQuantity(int amount) {
        addedAmount = 0;
        addedAmount = amount;
        availableQuantity += amount;
    }

    void sellQuantity(int amount) {
        soldAmount = 0;
        soldAmount = amount;
        availableQuantity -= amount;
    }

    int getAddedAmount() {
        return addedAmount;
    }

    int getSoldAmount() {
        return soldAmount;
    }

    void showDetails() {
        System.out.println("Isbn: " + isbn);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + availableQuantity);

    }
}
