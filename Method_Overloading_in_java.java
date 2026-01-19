
class Calculator {
    public int add (int n1 , int n2) {
        return  n1 + n2;
    }
    public int add (int n1 , int n2, int n3) { // method overloading same method name with different parameters
        return  n1 + n2 + n3;
    }
    public double  add (double  n1 , double  n2) {// method overloading same method name with different type of parameters
        return  n1 + n2;
    }
}

public class Method_Overloading_in_java {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(12,11,16);
        System.err.println(r1);
    }
}