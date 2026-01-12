class RelationalOperators {
    public static void main(String[] args){
        int x = 6;
        int y = 5;

        boolean lessThan = x < y;
        System.out.println("x < y: " + lessThan);

        boolean greaterThan = x > y;
        System.out.println("x > y: " + greaterThan);

        boolean lessThanOrEqual = x <= y;
        System.out.println("x <= y: " + lessThanOrEqual);

        boolean greaterThanOrEqual = x >= y;
        System.out.println("x >= y: " + greaterThanOrEqual);

        boolean equalTo = x == y;
        System.out.println("x == y: " + equalTo);

        boolean notEqualTo = x != y;
        System.out.println("x != y: " + notEqualTo);
    }
}