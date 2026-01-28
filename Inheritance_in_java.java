class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

class AdvCalc extends Calc {  // Inheritance from Calc class
    public int multi(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

public class Inheritance_in_java {
    public static void main(String[] args) {
        Calc obj = new Calc();
        AdvCalc obj2 = new AdvCalc();

        int r1 = obj.add(10, 5);
        int r2 = obj.sub(10, 5);
        int r3 = obj2.multi(10, 5);
        int r4 = obj2.div(10, 5);

        System.out.println( r1 + " " + r2 + " " + r3 + " " + r4);  
    }
}