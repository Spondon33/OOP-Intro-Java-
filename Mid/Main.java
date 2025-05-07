package OOP1;

public class Main{
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.name = "Bob";
		dog.eat();
		System.out.println(dog.name);
		System.out.println(dog.isAlive);

		Cat cat = new Cat();
		cat.name = "Tom";
		cat.eat(cat.name);
		System.out.println(cat.name);
		System.out.println(cat.isAlive);

		Fish fish = new Fish();
		fish.name = "Nemo";
		fish.eat(fish.name);
		System.out.println(fish.name);
		System.out.println(fish.isAlive);

		dog.move(dog.name);
		cat.move(cat.name);
		fish.move(fish.name);
	}
}
