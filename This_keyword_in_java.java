class Human {
    private int age;  //= 11;
    private String name;  //= "Varshith";

    public int getAge(){ 
        return age;
    }
    public void setAge(int age){// Human obj1) just for understanding
    // setter method names Can be anything but by convention we use words which are representing the variable name
    //obj1.age = age;
    this.age = age; // 'this' keyword is used to refer to the current object's variable
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name; //
}
}

public class This_keyword_in_java {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21); //obj); passing current object reference
        obj.setName("Varshith");
        //obj.age = 21;
        //obj.name = "Varshith";

        System.err.println(obj.getName() + " " + obj.getAge());
    }
}