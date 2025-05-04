package OOP1;

public class Start2 {
    public static void main(String[] args) {
        Book2[] b = new Book2[3];

        b[0] = new Book2("ISBN001", "Java Basics", "John Smith", 499.99, 10);
        b[1] = new Book2("ISBN002", "Python Fundamentals", "Alice Jones", 599.00, 8);
        b[2] = new Book2("ISBN003", "C++ Programming", "Robert Green", 450.50, 15);

        for (int i = 0; i < b.length; i++) {
            b[i].showDetails();
            System.out.println();
        }

    }
}
