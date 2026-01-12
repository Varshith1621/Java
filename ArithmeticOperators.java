class ArithmeticOperators {
    public static void main (String args[]){
        int num1 = 7;
        int num2 = 5;

        int resultAdd = num1 + num2;
        System.out.println("Addition: " + resultAdd);

        int resultSub = num1 - num2;
        System.out.println("Subtraction: " + resultSub);

        int resultMul = num1 * num2;
        System.out.println("Multiplication: " + resultMul);

        int resultDiv = num1 / num2;
        System.out.println("Division: " + resultDiv);

        int resultMod = num1 % num2;
        System.out.println("Modulus: " + resultMod);

        num1 = num1 + 3;
        num1 += 3; // Using compound assignment operator
        num1++; // post-increment
        ++num1; // pre-increment
        System.out.println("After num1 = num1 + : " + num1);

        num1 -= 3;
        num1--;
        System.out.println("After num1 = num1 - : " + num1);

        num1 *= 3;
        System.out.println("After num1 = num1 * : " + num1);

        int num = 7;
        int result = ++num; //first fetch then increment
        int result2 = num++; // first increment then fetch
        System.out.println("Result after pre-increment: " + result);
    }
}