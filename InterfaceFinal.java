
@FunctionalInterface               // should have Only one abstract method
interface Demo{
    int num = 7;    //by default final 
    void abc();                  // abstract method 
    static void show(){        // static method
        System.out.println("in Demo show");
    }
}
class DemoImp implements Demo{
    public void abc(){
        num=9;              //cannot assign a value to final variable num
    }
}

public class Main
{
	public static void main(String[] args) {
	    Demo.show(); //no need to create class and object to implement interface
	    
	}
}
