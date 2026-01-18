class Calculator {

    int a;

    public int add(int n1 , int n2) {
        int r = n1 + n2;
        return  r;
    }
}
public class Object_Oriented_Programming_Classes_and_Objects {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 12;

        Calculator calc = new Calculator();

        int result = calc.add(num1,num2);

        //int result = num1 + num2;

        System.out.println(result);
    }
}

// object Oriented programming (OOP) is a programming paradigm that uses "objects" to design software.
// Object - Properties (attributes) and Behaviors (methods).

// class - blueprint for creating objects.