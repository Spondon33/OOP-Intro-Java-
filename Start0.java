public class Start {
    public static void main(String[] args){
        StoryBook storyBook1 = new StoryBook();
        StoryBook.setDiscountRate(15);
        storyBook1.setIsbn("1561489161");
        storyBook1.setBookTitle("The Hidden Treasure");
        storyBook1.setAuthorName("Tom Walker");
        storyBook1.setPrice(460);
        storyBook1.setAvailableQuantity(54);
        storyBook1.addQuantity(8);
        storyBook1.setCategory("Adventure");
        System.out.println("---------- STORYBOOKS----------");
        System.out.println();
        System.out.println("Isbn: " + storyBook1.getIsbn());
        System.out.println("Book Title: " + storyBook1.getBookTitle());
        System.out.println("Author: " + storyBook1.getAuthorName());
        System.out.println("Price: " + storyBook1.getPrice());
        System.out.println("Available Quantity: " + storyBook1.getAvailableQuantity());
        System.out.println("Category: " + storyBook1.getCategory());
        System.out.println("Discount Rate: " + StoryBook.getDiscountRate() + "%");
        System.out.println();
        StoryBook storyBook2 = new StoryBook("15618646168", "Time Traveler", "Diana Smith", 370, 38, "Sci-fi");
        storyBook2.sellQuantity(11);
        storyBook2.showDetails();
        System.out.println();

        TextBook textBook1 = new TextBook();
        TextBook.setDiscountRate(20);
        textBook1.setIsbn("17816151664");
        textBook1.setBookTitle("Mathematics");
        textBook1.setAuthorName("Rahim Uddin");
        textBook1.setPrice(500);
        textBook1.setAvailableQuantity(33);
        textBook1.addQuantity(5);
        textBook1.setStandard(8);
        System.out.println("---------- TEXTBOOKS----------");
        System.out.println();
        System.out.println("Isbn: " + textBook1.getIsbn());
        System.out.println("Book Title: " + textBook1.getBookTitle());
        System.out.println("Author: " + textBook1.getAuthorName());
        System.out.println("Price: " + textBook1.getPrice());
        System.out.println("Available Quantity: " + textBook1.getAvailableQuantity());
        System.out.println("Standard: " + textBook1.getStandard());
        System.out.println("Discount Rate: " + TextBook.getDiscountRate());
        System.out.println();
        TextBook textBook2 = new TextBook("35838948924", "Physics", "Karim Hossain", 500.0, 29, 10);
        textBook2.sellQuantity(6);
        textBook2.showDetails();
    }
}
