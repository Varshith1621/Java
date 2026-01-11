class TypeConversion{
    public static void main (String args[]){
        //byte b = 127;
        int a = 257; // Implicit conversion from byte to int
        byte k =(byte)a; // Explicit conversion from int to byte
       // System.out.println("Implicit conversion from byte to int: " + a);
        //System.out.println("Explicit conversion from int to byte: " + k);


        float f = 5.6f;
        int t = (int)f; // Explicit conversion from float to int
        //System.out.println("Explicit conversion from float to int: " + t); 

        // Type Proptioning
        byte a= 10;
        byte b= 30;
        int result = a * b; // a and b are promoted to int before multiplication
        System.out.println("Type Promotion in Expression: " + result);
    }
}