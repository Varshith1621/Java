public class Drawbacks_in_Array {
    public static void main(String[] args) {
        // Drawbacks of Arrays in Java

        // 1. Fixed Size
        int[] fixedArray = new int[5];
        // Once the size is set, it cannot be changed
        // fixedArray = new int[10]; // This would create a new array, not resize the existing one

        // 2. Homogeneous Elements
        // Arrays can only store elements of the same data type
        int[] intArray = new int[5];
        // intArray[0] = "Hello"; // This would cause a compile-time error

        // 3. No Built-in Methods for Common Operations
        // Arrays do not have methods for common operations like adding or removing elements
        // We have to manually manage these operations

        // 4. Memory Consumption
        // Arrays can lead to memory wastage if the allocated size is larger than needed
        int[] largeArray = new int[1000]; // If we only need 10 elements, this wastes memory

        // 5. Lack of Flexibility
        // Arrays do not provide flexibility in terms of dynamic resizing or easy element management
        // For dynamic data structures, we often use Collections like ArrayList instead

        System.out.println("Drawbacks of arrays have been demonstrated in the code comments.");
        
    }
}