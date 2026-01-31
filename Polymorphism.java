import tools.AdvCalc;
import tools.calc;

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism (Method Overloading)
        // Creating an object of the Calculator class
        Calculator calc = new Calculator(); // calls calculator constructor
        AdvCalc AdvCalc = new AdvCalc(); // calls Advcalc constructor
        System.out.println("Addition of two integers: " + calc.add(5, 10)); // Calls add(int, int)
        System.out.println("Addition of three integers: " + AdvCalc.add(5, 10, 15)); // Calls add(int, int, int)

        // Run-time polymorphism (Method Overriding)
        // Creating an object of the Dog class
        Animal myDog = new Dog();
        myDog.sound(); // Calls the overridden method in Dog class  
        Calculator advCalc = new tools.AdvCalc(); // Upcasting
        System.out.println("Multiplication: " + ((tools.AdvCalc)advCalc).multi(4, 5)); // Calls multi method from AdvCalc
        System.out.println("Division: " + ((tools.AdvCalc)advCalc).div(20, 4)); // Calls div method from AdvCalc

    }
}