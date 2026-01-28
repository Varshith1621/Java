class A extends Object{ // implicit call to Object class constructor without mentioning super() and extends Object
    public A(){
        super(); //
        System.out.println("Parent class A constructor called");
    }
    public A(int x){
        super();
        System.out.println("Parent class A constructor with parameter ");
    }
}

class B extends A{
    public B(){
        super(); // super(5); to call parameterized constructor of parent class
        System.out.println("Child class B constructor called");
    }
    public B(int x){
        //super(x); 
        this(); // calling Constructor of same class and super class 
        System.out.println("Child class B constructor with parameter");
    }
}

public class This_and_Super_Method_in_java {
    public static void main(String[] args) {
        //B obj = new B();
        B obj1 = new B(5);
    }
}