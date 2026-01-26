class Human {
    private int age;  //= 11;
    private String name;  //= "Varshith";

    //Right click -> Generate -> Getter and Setter

    public int getAge(){ // getter method names Can be anything but by convention we use words which are representing the variable name
        return age;
    }
    public void setAge(int age){// setter method names Can be anything but by convention we use words which are representing the variable name
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
}
}

public class Getters_and_Setters_in_java {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Varshith");
        //obj.age = 21;
        //obj.name = "Varshith";

        System.err.println(obj.getName() + " " + obj.getAge());
    }
}