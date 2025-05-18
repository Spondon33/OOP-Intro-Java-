public class BookShop implements BookShopOperations {
    private String name;
    private Book[] listOfBooks = new Book[100];

    BookShop(){}
    BookShop(String name){
        setName(name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean insertBook(Book book){
        for (int i = 0; i < listOfBooks.length ; i++){
            if (listOfBooks[i] == null){
                this.listOfBooks[i] = book;
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean removeBook(Book book){
        for (int i = 0; i < listOfBooks.length ; i++){
            if (listOfBooks[i] == book){
                this.listOfBooks[i] = null;
                return true;
            }
        }
        return false;
    }
    @Override
    public Book searchBook(String isbn){
        for (int i = 0; i < listOfBooks.length ; i++){
            if (listOfBooks[i] != null && listOfBooks[i].getIsbn().equals(isbn)){
                return listOfBooks[i];
            }
        }
        return null;
    }
    @Override
    public void showAllBooks(){
        for (Book book : listOfBooks){
            if (book != null){
                book.showDetails();
            }
        }
    }

}
