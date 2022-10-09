package Exercise5;

import Chapter4.Vehicle;

public class Main {
    public static void main(String[] args) {
        CocheCRUDImpl test = new CocheCRUDImpl();
        Vehicle car1 = new Vehicle("toyota","prius");
        Vehicle car2 = new Vehicle("toyota","auris");
        Vehicle car3 = new Vehicle("toyota","rover");
        test.save(car1);
        test.save(car2);
        test.save(car3);

        for(Vehicle vehicle : test.findAll()){
            System.out.println(vehicle.toString());
        }

        test.delete(car1);

        for(Vehicle vehicle : test.findAll()) {
            System.out.println(vehicle.toString());
        }
    }
}
