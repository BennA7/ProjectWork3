class Animal{
    void eat() {
    	System.out.println("This animal can eat");
	}
}
class Dog extends Animal{
    void sleep() {
    	System.out.println("This animal can sleep");
	}
}
class Puppy extends Dog{
    void bark() {
    	System.out.println("This animal can bark");
	}
}
public class InherMultilevelEx {
	public static void main(String[] args) {
	Puppy obj = new Puppy();
	obj.bark();
	obj.sleep();
	obj.eat();
		
	}

}
