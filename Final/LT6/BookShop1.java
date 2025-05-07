package OOP1_Final;

public class BookShop1 {
    String name;
    TextBook1[] textBooks = new TextBook1[100];
    StoryBook1[] storyBooks = new StoryBook1[100];

    BookShop1(){}
    BookShop1(String name){
        this.name = name;
    }

    boolean insertTextBook(TextBook1 tb){
        for (int i = 0; i < textBooks.length ; i++){
            if (textBooks[i] == null){
                this.textBooks[i] = tb;
                return true;
            }
        }
        return false;
    }
    boolean removeTextBook(TextBook1 tb){
        for (int i = 0; i < textBooks.length ; i++){
            if (textBooks[i] == tb){
                this.textBooks[i] = null;
                return true;
            }
        }
        return false;
    }
    TextBook1 searchTextBook(String isbn){
        for (int i = 0; i < textBooks.length ; i++){
            if (textBooks[i] != null && textBooks[i].getIsbn().equals(isbn)){
                return textBooks[i];
            }
        }
        return null;
    }
    void showAllTextBooks(){
        for (TextBook1 tb: textBooks){
            if (tb != null) {
                tb.showDetails();
            }
        }
    }

    boolean insertStoryBook(StoryBook1 sb){
        for (int i = 0; i < storyBooks.length ; i++){
            if (storyBooks[i] == null){
                this.storyBooks[i] = sb;
                return true;
            }
        }
        return false;
    }
    boolean removeStoryBook(StoryBook1 sb){
        for (int i = 0; i < storyBooks.length ; i++){
            if (storyBooks[i] == sb){
                this.storyBooks[i] = null;
                return true;
            }
        }
        return false;
    }
    StoryBook1 searchStoryBook(String isbn){
        for (int i = 0; i < storyBooks.length ; i++){
            if (storyBooks[i] != null && storyBooks[i].getIsbn().equals(isbn)){
                return storyBooks[i];
            }
        }
        return null;
    }
    void showAllStoryBooks(){
        for (StoryBook1 sb: storyBooks){
            if (sb != null) {
                sb.showDetails();
            }
        }
    }
}
