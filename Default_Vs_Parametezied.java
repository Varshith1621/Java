class Human {
    private int age; 
    private String name; 

    //right click -> source & Action(Alt+Insert) -> Generate Constructor using Fields

    public Human(){ 
        age = 21;
        name = "Varshith";
    }

    public Human(int a, String n){ // Parameterized Constructor
        this.age = a; 
        this.name = n;
    }

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

public class Default_Vs_Parametezied {
    public static void main(String[] args) {
        Human obj = new Human(); // Default Constructor allows to create object without passing any values
        Human obj1 = new Human(21, "Priya"); // Parameterized Constructor quick way to initialize the object with some values

        System.err.println(obj.getName() + ":" + obj.getAge());
        System.err.println(obj1.getName() + ":" + obj1.getAge());
    }
}