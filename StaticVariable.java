class Mobile {
    String brand;
    int price;
    static  String network;
    String name;

    public void show(){
        System.err.println("Brand:" + brand + " Price:" + price + " Network:" + network + " Name:" + name);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "iPhone 16 Pro";
        Mobile.network = "5G"; //static variable should be accessed by class name

        Mobile obj2 = new Mobile(); //static variable shared among all instances
        obj2.brand = "Samsung";
        obj2.price = 1200;
        obj2.name = "Galaxy S23 Ultra";
        Mobile.network = "5G";

        Mobile.network = "6G"; //static variable changed reflected in all objects

        obj1.show();
        obj2.show();
    }
    }