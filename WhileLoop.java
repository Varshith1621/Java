class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i<=4){
            System.out.println("Hi there!" + i);
            i++;
        }
        System.out.println("Bye now!" + i);

        // nested while loop
        while(i<=4){
            System.out.println("Hi there!" + i);
            int j =1;
            while(j<=3){
                System.out.println("   Hello!" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye now!" + i);
    }
}