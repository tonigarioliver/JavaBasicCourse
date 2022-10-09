package Exercise5;

import Chapter4.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    @Override
    public void save(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleList;
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicleList.remove(vehicle);
    }
}
