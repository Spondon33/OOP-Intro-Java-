public class StoryBook extends Book{
    private String category;

    public StoryBook(){

	}
	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){
		super.setIsbn(isbn);
        super.setBookTitle(bookTitle);
        super.setAuthorName(authorName);
        super.setPrice(price);
        super.setAvailableQuantity(availableQuantity);
        setCategory(category);
	}

    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }

    @Override
    public void showDetails(){
        System.out.println("Isbn: " + getIsbn());
        System.out.println("Book Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available Quantity: " + getAvailableQuantity());
        System.out.println("Category: " + getCategory());
        System.out.println();
    }
}
