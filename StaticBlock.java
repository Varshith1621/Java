class Mobile {
    String brand;
    int price;
    static  String network;
    String name;

    public Mobile(){
        brand = "";
        price = 200;
        name = "phone";
        System.err.println("Constructor executed. Default values set for brand, price, and name.");
    }

    static { //static block
        network = "4G";
        System.err.println("Static Block executed. Default Network set to: " + network);
    }

    public void show(){
        System.err.println("Brand:" + brand + " Price:" + price + " Network:" + network + " Name:" + name);
    }

}

public class StaticBlock {
    public static void main(String[] args)throws ClassNotFoundException { 

        Class.forName("Mobile"); //to trigger static block execution

        //Mobile obj1 = new Mobile();
        //obj1.brand = "Apple";
        //obj1.price = 1500;
        //obj1.name = "iPhone 16 Pro";
        //Mobile.network = "5G"; 

        //Mobile obj2 = new Mobile(); 
    }
    }