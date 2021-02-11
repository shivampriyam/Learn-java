/******************************************************************************
java doesn't support multiple Interface with same parameter
can be solved by override by super implements method or by abstract method
*******************************************************************************/
@FunctionalInterface               // should have Only one abstract method
interface Demo{
    void abc();                  // abstract method 
    default void show(){        // default method
        System.out.println("in Demo show");
    }
}
interface MyDemo{
    default void show(){
        System.out.println("in MyDemo show");
    }
}
class DemoImp implements Demo,MyDemo{
    public void abc() {
        System.out.println("in abc");
    }
    // public void show(){
    //     System.out.println("in DemoImp show");  //overide the default method show in interface Demo
    // }
    
    // @Override
    // public void show(){
    //     MyDemo.super.show();
    // }
}
public class Main
{
	public static void main(String[] args) {
	    Demo obj = new DemoImp();
	    obj.abc();
	    obj.show();
// 		System.out.println("Hello World");
	}
}
