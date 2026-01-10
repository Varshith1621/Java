class literals {
    public static void main(String args[]){
        
        int num = 0b01011; // Binary literal for 11
        int hexNum = 0xB; // Hexadecimal literal for 11
        int underscoreNum = 1_000_000; // Using underscores for readability

        double pow = 12e10; // Scientific notation for 12 * 10^10

        char c = 'A'; // Character literal
        c++; // Increment character to 'B'

        System.out.println("Binary literal: " + num);
        System.out.println("Hexadecimal literal: " + hexNum);
        System.out.println("Underscore literal: " + underscoreNum);
        System.out.println("Scientific notation literal: " + pow);
        System.out.println("Character literal after increment: " + c);
    }
}