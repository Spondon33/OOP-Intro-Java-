public class Start {
    public static void main(String[] args){
        BookShop shop = new BookShop("AIUB Book Store");

        Book b1 = new TextBook("TB001", "Mathematics", "John Doe", 45.99, 50, 10);
        Book b2 = new TextBook("TB002", "Physics", "Jane Smith", 55.50, 30, 11);
        Book b3 = new TextBook("TB003", "Chemistry", "Robert Johnson", 42.75, 40, 9);
        Book b4 = new TextBook("TB004", "Biology", "Emily Davis", 48.25, 35, 12);
        Book b5 = new TextBook("TB005", "Computer Science", "Michael Brown", 60.00, 25, 11);

        Book b6 = new StoryBook("SB001", "The Secret Garden", "Frances Hodgson Burnett", 350.00, 12, "Classic");
        Book b7 = new StoryBook("SB002", "Harry Potter and the Goblet of Fire", "J.K. Rowling", 720.00, 8, "Fantasy");
        Book b8 = new StoryBook("SB003", "Charlotte's Web", "E.B. White", 280.00, 15, "Children");
        Book b9 = new StoryBook("SB004", "The Outsiders", "S.E. Hinton", 400.00, 10, "Young Adult");
        Book b10 = new StoryBook("SB005", "Bridge to Terabithia", "Katherine Paterson", 360.00, 9, "Drama");

        shop.insertBook(b1);
        shop.insertBook(b2);
        shop.insertBook(b3);
        shop.insertBook(b4);
        shop.insertBook(b5);
        shop.insertBook(b6);
        shop.insertBook(b7);
        shop.insertBook(b8);
        shop.insertBook(b9);
        shop.insertBook(b10);

        shop.removeBook(b2);
        shop.removeBook(b4);
        shop.removeBook(b6);
        shop.removeBook(b8);
        shop.showAllBooks();
    }
}
