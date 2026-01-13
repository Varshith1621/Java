class TernaryOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;
        int MultipleTernaryResult;
        int result = 0;

        //if (a % 2 == 0) {
            //result = 10;
        //} else {
            //result = 20;
        //}

        result = (a % 2 == 0) ? 10 : 20; // ?: is the ternary operator
        System.out.println("Result is: " + result);

        // Multiple Ternary Operator
        MultipleTernaryResult = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Greatest value is: " + MultipleTernaryResult);
    }
}