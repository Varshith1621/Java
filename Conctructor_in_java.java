class Human {
    private int age; 
    private String name; 

    public Human(){ // Constructor has same name as class name and no return type
        age = 21;
        name = "Varshith";
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

public class Conctructor_in_java {
    public static void main(String[] args) {
        Human obj = new Human();
        System.err.println(obj.getName() + " " + obj.getAge());
        // we are able to access the values without using setter methods because constructor initialized the values

        //obj.setAge(21);
        //obj.setName("Varshith");

     //System.err.println(obj.getName() + " " + obj.getAge());
    }
}