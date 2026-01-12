class LogicalOperators {
    public static void main(String[] args){
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a < b;
        System.out.println("Logical AND (x>y && a>b): " + result);

        boolean result2 = x > y || a < b;
        System.out.println("Logical OR (x>y || a>b): " + result2);

        boolean result3 = (a > b);
        System.out.println("Logical NOT (!(a>b)): " + !result3);
    }
    }