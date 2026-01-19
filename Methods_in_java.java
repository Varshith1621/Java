class Computer {

    public void playMusic(){
        System.out.println("Playing Music...");
    }

    public String browseInternet(int speed){
    if(speed >= 100){
        return "Browsing the internet at speed: " + speed + " Mbps";  
    }
    //else{
        return "Internet speed is too low";
    //}
    }
}


public class Methods_in_java {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.browseInternet(100);
        System.out.println(str);
    }
}