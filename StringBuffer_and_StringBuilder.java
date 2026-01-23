public class StringBuffer_and_StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Varshith");
        System.err.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" A M R");
        System.out.println(sb); // Output: Varshith A M R
        sb.insert(0, "Java ");
        System.out.println(sb); // Output: Java Varshith A M R
        String str = sb.toString();
        System.out.println( "Converted to String" + str);
        sb.deleteCharAt(2);
        System.out.println(sb); // Output: Vashith A M R
        sb.setLength(30);
        sb.ensureCapacity(100);

        StringBuilder sbd = new StringBuilder("Varshith"); // Similar to StringBuffer but not synchronized
        System.err.println(sbd.capacity());
        System.out.println(sbd.length());
        sbd.append(" A M R");
    }
}