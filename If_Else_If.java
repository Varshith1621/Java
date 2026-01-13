class If_Else_If {
    public static void main(String[] args){
        int x = 18;
        int y = 21;
        int z = 28;

        if(x > y && x > z) {
            System.out.println("x is the greatest:"  +x);
        }
        else if(y > z) { // else if ( y > x && y > z ) but the first condition is already false
            System.out.println("y is the greatest:"  +y);
        }
        else {
            System.out.println("z is the greatest:"  +z);
        }

    }
}