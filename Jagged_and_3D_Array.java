public class Jagged_and_3D_Array {
    public static void main(String[] args) {
        
        int nums[][] = new int [3][]; // declaration of jagged array
        nums[0] = new int[3]; // first row has 3 columns
        nums[1] = new int[4]; // second row has 4 columns
        nums[2] = new int[2]; // third row has 2 columns

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int) (Math.random() *100);
            }
        }
        // Using enhanced for loop to print the 2D array
        for (int n[] : nums){
            for (int m : n){
                System.err.print(m+" ");
            }
            System.err.println();
        }

        System.err.println("");
        System.err.println("");

        int D[][][] = new int [3][4][2]; // declaration and instantiation of 3D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                for (int k = 0; k < 2; k++){
                    D[i][j][k] = (int) (Math.random() *100);
                }
            }
        }
        // Using enhanced for loop to print the 3D array
        for (int X[][] : D){
            for (int Y[] : X){
                for (int Z : Y){
                    System.err.print(Z+" ");
                }
                System.err.println();
            }
            System.err.println();
        }
    }
}