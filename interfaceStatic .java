
@FunctionalInterface               // should have Only one abstract method
interface Demo{
    void abc();                  // abstract method 
    static void show(){        // static method
        System.out.println("in Demo show");
    }
}

public class Main
{
	public static void main(String[] args) {
	    Demo.show(); //no need to create class and object to implement interface
	}
}
