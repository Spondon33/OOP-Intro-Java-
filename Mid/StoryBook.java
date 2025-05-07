public class StoryBook{
	String isbn;
	String bookTitle;
	String authorName;
	double price;
	int availableQuantity;
	String category;
	static double discountRate;

	StoryBook(){

	}
	StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){
		setIsbn(isbn);
        setBookTitle(bookTitle);
        setAuthorName(authorName);
        setPrice(price);
        setAvailableQuantity(availableQuantity);
        setCategory(category);
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
    void setCategory(String category){
        this.category = category;
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
    String getCategory(){
        return category;
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
        System.out.println("Category: " + category);
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}
