public class MultiDimensionalArray {
    public static void main(String[] args) {
        
        int multiarray[][] = new int [3][4]; // declaration and instantiation of 2D array

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                multiarray[i][j] = (int) (Math.random() *100);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                System.err.print( multiarray[i][j]+" ");
            }
            System.err.println();
        }        
        // Using enhanced for loop to print the 2D array
        for (int n[] : multiarray){
            for (int m : n){
                System.err.print(m+" ");
            }
            System.err.println();
        }
    }
}