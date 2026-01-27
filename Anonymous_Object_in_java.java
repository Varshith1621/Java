class A{
    public A(){
        System.err.println("Anonymous Object Created");
    }
    public void show(){
        System.out.println("Hello from class A");
    }
}
public class Anonymous_Object_in_java {
    public static void main(String[] args) {

        new A(); // Anonymous Object
        new A().show(); // Anonymous Object with method call
        new A().show(); //can be used only once

        //A obj = new A(); // named object
        //obj.show();
    }
}