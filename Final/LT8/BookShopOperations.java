interface BookShopOperations{
    boolean insertBook(Book book);
    boolean removeBook(Book book);
    Book searchBook(String isbn);
    void showAllBooks();
}