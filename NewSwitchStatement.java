class NewSwitchStatement {
    public static void main(String[] args){

    String day = "Monday";
    String result = "";
    result = switch(day){
        case "Saturday" , "Sunday" -> "6am"; //result = "6am"; //System.out.println("6am"); // :yield"6am";
        case "Monday" -> "8am"; //result = "8am"; //System.out.println("8am"); //:yield"8am";        
        default -> "7am";// result = "7am"; //System.out.println("7am"); //:yield"7am";
    }//; // only if using yield or assigning to a variable
     System.out.println(result);
    }
}