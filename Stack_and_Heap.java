class Calculator {
    int num = 4;
    public int add (int n1 , int n2) {
        System.err.println(num);
        return  n1 + n2;
    }
 
}public class Stack_and_Heap {
    public static void main(String[] args) {
        int data =  10;

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        int r1 = obj.add(12,11);
        System.err.println(r1);
        System.err.println(obj1.num);
        obj.num = 8;
        System.err.println(obj.num);
        

    }
}