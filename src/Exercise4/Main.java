package Exercise4;

public class Main {
    public static void main(String[] args) {
        SmartDevice Iphone14 = new SmartPhone();
        SmartDevice AppleWatch = new SmartWatch();
        if(Iphone14 instanceof SmartDevice)
            System.out.println(Iphone14.toString());
        if(AppleWatch instanceof SmartDevice)
            System.out.println(AppleWatch.toString());
    }
}
