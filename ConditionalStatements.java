class ConditionalStatements {
    public static void main(String[] args){
        int a = 28;
        int x = 11;
        int y = 7;

        if( a > 10 && a <=20) // expected value 11-20
        System.out.println("Hello");
        else
        System.out.println("Bye");

        if( x > y )
        {
        System.out.println(x);
        System.out.println("Thank You");
        } // curly braces when multiple statements
        else
        System.out.println(y);

    }
}