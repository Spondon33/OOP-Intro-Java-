import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    Book[] books = new Book[100];
    int bookCount = 0;
    private JTextField isbnField, bookTitleField, authorNameField, priceField, availableQuantityField, extraField;
    private JLabel isbnLabel, bookTitleLabel, authorNameLabel, priceLabel, availableQuantityLabel, extraLabel;
    private JButton addBook, removeBook, searchBook, addQuantity, soldQuantity, showAllBooks;
    private JTextArea displayArea;
    public Main(){
        setTitle("Book Management System");
        setSize(550, 700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        isbnLabel = new JLabel("ISBN:");
        isbnLabel.setBounds(50, 30, 150, 25);
        add(isbnLabel);

        isbnField = new JTextField();
        isbnField.setBounds(180, 30, 200, 25);
        add(isbnField);

        bookTitleLabel = new JLabel("Book Title:");
        bookTitleLabel.setBounds(50, 60, 150, 25);
        add(bookTitleLabel);

        bookTitleField = new JTextField();
        bookTitleField.setBounds(180, 60, 200, 25);
        add(bookTitleField);

        authorNameLabel = new JLabel("Author Name:");
        authorNameLabel.setBounds(50, 90, 150, 25);
        add(authorNameLabel);

        authorNameField = new JTextField();
        authorNameField.setBounds(180, 90, 200, 25);
        add(authorNameField);

        priceLabel = new JLabel("Price:");
        priceLabel.setBounds(50, 120, 150, 25);
        add(priceLabel);

        priceField = new JTextField();
        priceField.setBounds(180, 120, 200, 25);
        add(priceField);

        availableQuantityLabel = new JLabel("Available Quantity:");
        availableQuantityLabel.setBounds(50, 150, 150, 25);
        add(availableQuantityLabel);

        availableQuantityField = new JTextField();
        availableQuantityField.setBounds(180, 150, 200, 25);
        add(availableQuantityField);

        addBook = new JButton("Add Book");
        addBook.addActionListener(this);
        addBook.setBounds(50, 200, 120, 25);
        add(addBook);

        searchBook = new JButton("Search Book");
        searchBook.addActionListener(this);
        searchBook.setBounds(200, 200, 120, 25);
        add(searchBook);

        removeBook = new JButton("Remove Book");
        removeBook.addActionListener(this);
        removeBook.setBounds(350, 200, 120, 25);
        add(removeBook);

        showAllBooks = new JButton("Show All Books");
        showAllBooks.addActionListener(this);
        showAllBooks.setBounds(190, 250, 140, 25);
        add(showAllBooks);

        extraLabel = new JLabel("Quantity:");
        extraLabel.setBounds(50, 300, 150, 25);
        add(extraLabel);

        extraField = new JTextField();
        extraField.setBounds(180, 300, 200, 25);
        add(extraField);

        addQuantity = new JButton("Add Quantity");
        addQuantity.addActionListener(this);
        addQuantity.setBounds(120, 350, 120, 25);
        add(addQuantity);

        soldQuantity = new JButton("Sell Quantity");
        soldQuantity.addActionListener(this);
        soldQuantity.setBounds(280, 350, 120, 25);
        add(soldQuantity);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBounds(50, 400, 430, 230);
        add(scrollPane);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addBook){
            if (bookCount < books.length) {
                String isbn = isbnField.getText();
                String bookTitle = bookTitleField.getText();
                String authorName = authorNameField.getText();
                double price = Double.parseDouble(priceField.getText());
                int availableQuantity = Integer.parseInt(availableQuantityField.getText());
                Book book = new Book(isbn, bookTitle, authorName, price, availableQuantity);
                books[bookCount] = book;
                bookCount++;
                String bookDetails = "Book Successfully Added!" + "\n";
                displayArea.setText(bookDetails);
            }
            else {
                displayArea.setText("Storage is Full !");
            }
            isbnField.setText("");
            bookTitleField.setText("");
            authorNameField.setText("");
            priceField.setText("");
            availableQuantityField.setText("");
        }

        if(e.getSource() == searchBook){
            String isbn = isbnField.getText();
            boolean found = false;
            for (int i = 0; i < bookCount; i++){
                if (books[i].getIsbn().equals(isbn)){
                    Book book = books[i];
                    String bookDetails = "Book Found !" + "\n\n"
                                    + "ISBN: " + book.getIsbn() + "\n"
                                    + "Title: " + book.getBookTitle() + "\n"
                                    + "Author: " + book.getAuthorName() + "\n"
                                    + "Price: " + book.getPrice() + "\n"
                                    + "Available Quantity: " + book.getAvailableQuantity() + "\n";
                    displayArea.setText(bookDetails);
                    found = true;
                    break;
                }
            }
            if (!found){
                displayArea.setText("Book Not Found !");
            }
        }

        if (e.getSource() == removeBook){
            String isbn = isbnField.getText();
            boolean found = false;
            for (int i = 0; i < bookCount; i++){
                if (books[i].getIsbn().equals(isbn)){
                    for (int j = i; j < bookCount - 1; j++) {
                        books[j] = books[j + 1];
                    }
                    books[bookCount - 1] = null;
                    bookCount--;
                    displayArea.setText("Book Removed !");
                    found = true;
                    break;
                }
            }
            if (!found){
                displayArea.setText("Book Not Found ! So it couldn't be removed.");
            }
        }

        if (e.getSource() == showAllBooks){
            String allBooks = "";
            for (int i = 0; i < bookCount; i++){
                if (books[i] != null) {
                    allBooks += "Book " + (i + 1) + " : \n\n"
                            + "ISBN: " + books[i].getIsbn() + "\n"
                            + "Title: " + books[i].getBookTitle() + "\n"
                            + "Author: " + books[i].getAuthorName() + "\n"
                            + "Price: " + books[i].getPrice() + "\n"
                            + "Available Quantity: " + books[i].getAvailableQuantity() + "\n\n";
                }
            }
            if (allBooks.equals("")){
                displayArea.setText("No Books to Display");
            }
            else {
                displayArea.setText(allBooks);
            }
        }

        if (e.getSource() == addQuantity){
            String isbn = isbnField.getText();
            int quantity = Integer.parseInt(extraField.getText());
            boolean found = false;
            for (int i = 0; i < bookCount; i++){
                if (books[i].getIsbn().equals(isbn)){
                    books[i].addQuantity(quantity);
                    String bookDetails = "Available Quantity Updated !" + "\n\n"
                                    + "ISBN: " + books[i].getIsbn() + "\n"
                                    + "Title: " + books[i].getBookTitle() + "\n"
                                    + "Author: " + books[i].getAuthorName() + "\n"
                                    + "Price: " + books[i].getPrice() + "\n"
                                    + "Available Quantity: " + books[i].getAvailableQuantity() + "\n";
                    displayArea.setText(bookDetails);
                    found = true;
                    break;
                }
            }
            if (!found){
                displayArea.setText("Book Not Found !");
            }
        }

        if (e.getSource() == soldQuantity){
            String isbn = isbnField.getText();
            int quantity = Integer.parseInt(extraField.getText());
            boolean found = false;
            for (int i = 0; i < bookCount; i++){
                if (books[i].getIsbn().equals(isbn)){
                    books[i].sellQuantity(quantity);
                    String bookDetails = "Available Quantity Updated !" + "\n\n"
                                    + "ISBN: " + books[i].getIsbn() + "\n"
                                    + "Title: " + books[i].getBookTitle() + "\n"
                                    + "Author: " + books[i].getAuthorName() + "\n"
                                    + "Price: " + books[i].getPrice() + "\n"
                                    + "Available Quantity: " + books[i].getAvailableQuantity() + "\n";
                    displayArea.setText(bookDetails);
                    found = true;
                    break;
                }
            }
            if (!found){
                displayArea.setText("Book Not Found !");
            }
        }

    }
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}


