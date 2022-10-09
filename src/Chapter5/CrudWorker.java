package Chapter5;

import java.util.ArrayList;
import java.util.List;

public class CrudWorker {
    private List<Employee> employeeList = new ArrayList<>();
    public void save(Employee employee){
        employeeList.add(employee);
    }
    public List<Employee> findAll(){
        return employeeList;
    }
}
