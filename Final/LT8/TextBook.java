public class TextBook extends Book{
    private int standard;

    public TextBook(){

    }
    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard){
        super.setIsbn(isbn);
        super.setBookTitle(bookTitle);
        super.setAuthorName(authorName);
        super.setPrice(price);
        super.setAvailableQuantity(availableQuantity);
        setStandard(standard);

    }

    public void setStandard(int standard){
        this.standard = standard;
    }
    public int getStandard(){
        return standard;
    }

    @Override
    public void showDetails(){
        System.out.println("Isbn: " + getIsbn());
        System.out.println("Book Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available Quantity: " + getAvailableQuantity());
        System.out.println("Standard: " + getStandard());
        System.out.println();
    }
}
