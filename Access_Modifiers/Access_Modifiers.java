import other.*;

public class Access_Modifiers {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Marks: " + obj.marks); // Accessible within the same package

        // System.out.println("Marks1: " + obj.marks1); // Not Accessible, will cause a compile-time error
    }
}