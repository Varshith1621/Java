class Human {
    private int age;  //= 11;
    private String name;  //= "Varshith";

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
}
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Varshith");
        //obj.age = 21;
        //obj.name = "Varshith";

        System.err.println(obj.getName() + " " + obj.getAge());
    }
}