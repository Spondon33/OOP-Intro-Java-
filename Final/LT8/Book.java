abstract class Book implements BookOperations {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private int addedAmount;
    private int soldAmount;

    public Book(){

    }
    public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        setIsbn(isbn);
        setBookTitle(bookTitle);
        setAuthorName(authorName);
        setPrice(price);
        setAvailableQuantity(availableQuantity);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public String getAuthorName() {
        return authorName;
    }
    public double getPrice() {
        return price;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    @Override
    public void addQuantity(int amount) {
        addedAmount = 0;
        addedAmount = amount;
        availableQuantity += amount;
    }
    @Override
    public void sellQuantity(int amount) {
        soldAmount = 0;
        soldAmount = amount;
        availableQuantity -= amount;
    }

    public int getAddedAmount() {
        return addedAmount;
    }
    public int getSoldAmount() {
        return soldAmount;
    }

    public abstract void showDetails();
}
