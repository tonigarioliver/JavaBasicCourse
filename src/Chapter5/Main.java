package Chapter5;

public class Main {
    public static void main(String[] args){
        Employee juanito = new Employee("Juanito", 40,4000,true);
        Employee paco = new Employee("Paco", 40,4000,true);

        CrudWorker CRUDWorkers = new CrudWorker();
        CRUDWorkers.save(juanito);
        CRUDWorkers.save(paco);

        for (Employee employee : CRUDWorkers.findAll()){
            System.out.println(employee.toString());
        }
    }
}
