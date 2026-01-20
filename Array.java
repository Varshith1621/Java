public class Array {
    public static void main(String[] args) {

        int num[] = {4,6,8,1};
        num[1] = 7; // updating value at index 1

        int num1[] = new int[4]; // declaration and instantiation
        num1[0] = 4; // initialization
        num1[1] = 6;
        num1[2] = 3;
        num1[3] = 9;
        System.err.println(num[3]);
        for (int i = 0; i < 4; i++){
            System.err.println(num1[i]);
        }
    }
}