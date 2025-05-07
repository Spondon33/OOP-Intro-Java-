package OOP1_Final;

public class TextBook1 extends Book1{
    int standard;

    TextBook1(){

    }
    TextBook1(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard){
        super.isbn = isbn;
        super.bookTitle = bookTitle;
        super.authorName = authorName;
        super.price = price;
        super.availableQuantity = availableQuantity;

    }

    void setStandard(int standard){
        this.standard = standard;
    }
    int getStandard(){
        return standard;
    }

    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Standard: " + getStandard());
        System.out.println();
    }
}
