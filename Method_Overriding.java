class A{
    public void show(){
        System.out.println("Hello from class A");
    }
    public void Config(){
        System.out.println("Config method in class A");
    }
}

class B extends A{
    @Override
    public void show(){ // method overriding - same method name and same parameters as in parent class
        System.out.println("Hello from class B");
    }
}

class Calc {
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    @Override
    public int add(int n1, int n2){ // method overriding - same method name and same parameters as in parent class
        System.out.println("Overridden add method in AdvCalc");
        return n1 + n2 + 1; // adding extra 1 for demonstration
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        //A obj = new A();
        B obj = new B(); // upcasting
        obj.show();
        obj.Config();

        AdvCalc calc = new AdvCalc();
        int result = calc.add(10, 5);
        System.out.println(+ result);
    }
}