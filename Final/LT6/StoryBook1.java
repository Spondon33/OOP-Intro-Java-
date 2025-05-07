package OOP1_Final;

public class StoryBook1 extends Book1{
    String category;

    StoryBook1(){

	}
	StoryBook1(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){
		super.isbn = isbn;
        super.bookTitle = bookTitle;
        super.authorName = authorName;
        super.price = price;
        super.availableQuantity = availableQuantity;
        setCategory(category);
	}

    void setCategory(String category){
        this.category = category;
    }
    String getCategory(){
        return category;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Category: " + getCategory());
        System.out.println();
    }
}
