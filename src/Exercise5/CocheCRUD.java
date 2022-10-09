package Exercise5;

import Chapter4.Vehicle;

import java.util.List;

public interface CocheCRUD {
    void save(Vehicle vehicle);
    List<Vehicle> findAll();
    void delete(Vehicle vehicle);
}
