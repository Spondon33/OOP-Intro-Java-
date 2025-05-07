package OOP1_Final;

public class Start1 {
    public static void main(String[] args){
        BookShop1 shop1 = new BookShop1("AIUB Book Store");

        TextBook1 t1 = new TextBook1("TB001", "Mathematics", "John Doe", 45.99, 50, 10);
        TextBook1 t2 = new TextBook1("TB002", "Physics", "Jane Smith", 55.50, 30, 11);
        TextBook1 t3 = new TextBook1("TB003", "Chemistry", "Robert Johnson", 42.75, 40, 9);
        TextBook1 t4 = new TextBook1("TB004", "Biology", "Emily Davis", 48.25, 35, 12);
        TextBook1 t5 = new TextBook1("TB005", "Computer Science", "Michael Brown", 60.00, 25, 11);

        StoryBook1 s1 = new StoryBook1("SB001", "The Secret Garden", "Frances Hodgson Burnett", 350.00, 12, "Classic");
        StoryBook1 s2 = new StoryBook1("SB002", "Harry Potter and the Goblet of Fire", "J.K. Rowling", 720.00, 8, "Fantasy");
        StoryBook1 s3 = new StoryBook1("SB003", "Charlotte's Web", "E.B. White", 280.00, 15, "Children");
        StoryBook1 s4 = new StoryBook1("SB004", "The Outsiders", "S.E. Hinton", 400.00, 10, "Young Adult");
        StoryBook1 s5 = new StoryBook1("SB005", "Bridge to Terabithia", "Katherine Paterson", 360.00, 9, "Drama");


        shop1.insertTextBook(t1);
        shop1.insertTextBook(t2);
        shop1.insertTextBook(t3);
        shop1.insertTextBook(t4);
        shop1.insertTextBook(t5);

        shop1.insertStoryBook(s1);
        shop1.insertStoryBook(s2);
        shop1.insertStoryBook(s3);
        shop1.insertStoryBook(s4);
        shop1.insertStoryBook(s5);

        shop1.removeStoryBook(s3);

        shop1.showAllTextBooks();
        shop1.showAllStoryBooks();

        shop1.searchTextBook("TB002");
    }
}
