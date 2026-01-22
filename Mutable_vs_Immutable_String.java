public class Mutable_vs_Immutable_String {
    public static void main(String[] args) {
        String name = "Varshith";
        name = name + " A M R"; // Strings are immutable, so this creates a new String object
        System.out.println(name); // Output: Varshith A M R

        String s1 = "Varshith"; 
        String s2 = "Varshith"; // Both refer to the same object in the string pool
        System.out.println(s1 == s2); // true, as both reference the same object
    }
}