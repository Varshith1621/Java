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

class SuperAdvCalc extends AdvCalc { // Multilevel Inheritance from AdvCalc class
    public double  power(int n1, int n2){
        return Math.pow(n1, n2);
    }
    public int mod(int n1, int n2){
        return n1 % n2;
    }
}

public class Single_and_Multilevel_inheritance {
    public static void main(String[] args) {

        //Calc obj = new Calc();
        //AdvCalc obj = new AdvCalc();
        SuperAdvCalc obj = new SuperAdvCalc();

        int r1 = obj.add(10, 5);
        int r2 = obj.sub(10, 5);
        int r3 = obj.multi(10, 5);
        int r4 = obj.div(10, 5);
        double r5 = obj.power(2, 3);
        int r6 = obj.mod(10, 3);

        System.out.println( r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6);  
    }
}