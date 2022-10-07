package Chapter4;

public class Main {
    public static void main(String[] args) {
        Vehicle toyotaPrius = new Vehicle("toyota","prius");
        System.out.println(toyotaPrius);
        Vehicle electricar = new ElectricVehicle("tesla","advantor","true");
        System.out.println(electricar);

        if(electricar instanceof Vehicle)
            System.out.println("electricar is vehicle");
        if(toyotaPrius instanceof ElectricVehicle)
            System.out.println("toyota prius is ElectricVehicle");
    }
}
