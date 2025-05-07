package OOP1_Final;

public class BookShop {
    String name;
    Book[] books = new Book[100];

    BookShop(){}
    BookShop(String name){
        this.name = name;
    }

    boolean insertBook(Book book){
        for (int i = 0; i < books.length ; i++){
            if (books[i] == null){
                this.books[i] = book;
                return true;
            }
        }
        return false;
    }
    boolean removeBook(Book book){
        for (int i = 0; i < books.length ; i++){
            if (books[i] == book){
                this.books[i] = null;
                return true;
            }
        }
        return false;
    }
    Book searchBook(String isbn){
        for (int i = 0; i < books.length ; i++){
            if (books[i] != null && books[i].getIsbn().equals(isbn)){
                return books[i];
            }
        }
        return null;
    }
    void showAllBooks(){
        for (Book book : books){
            if (book != null){
                book.showDetails();
            }
        }
    }

}
