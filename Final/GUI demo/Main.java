import javax.swing.*;
import java.awt.event.*;

class Person {
    String name;
    String age;

    Person(){

    }
    Person(String name, String age){
        this.name = name;
        this.name = name;
    }

    public String showDetails(){
        return "Name" + name + "Age: " + age;
    }
}

public class Main extends JFrame implements ActionListener{
    private JTextField nameField, ageField;
    private JLabel nameLabel, ageLabel;
    private JButton createBtn;
    public Main(){
        setTitle("Person Information");
        setSize(500, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        nameLabel = new JLabel("Enter Your Name: ");
        nameLabel.setBounds(30, 25, 150, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(170, 25, 250, 25);
        add(nameField);

        ageLabel = new JLabel("Enter Your Age: ");
        ageLabel.setBounds(30, 70, 150, 25);
        add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(170, 70, 50, 25);
        add(ageField);

        createBtn = new JButton("Add Person");
        createBtn.addActionListener(this);
        createBtn.setBounds(170, 150, 100, 25);
        add(createBtn);
    }
    public void actionPerformed(ActionEvent e){

    }
    public static void main(String[] args){
        new Main().setVisible(true);
    }
}