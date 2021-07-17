class Animals{
    void eats() {
    	System.out.println("This animal can eat");
	}
}
class Dogs extends Animal{
    void sleeps() {
    	System.out.println("This animal can sleep");
	}
}
class Puppys extends Dog{
    void barks() {
    	System.out.println("This animal can bark");
	}
}
public class InherHirEx {
	public static void main(String[] args) {
	Puppys obj = new Puppys();
	obj.barks();
	obj.sleeps();
	obj.eats();
		
	}

}

