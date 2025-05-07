package OOP1;

public class Animal extends LivingThing{
    String name;
    void eat() {
        System.out.println("This animal eats");
    }
    // Over-Loading
    void eat(String animal){
        System.out.println(animal + " eats");
    }
    void move(String animal){
        System.out.println(animal + " runs");
    }
}
