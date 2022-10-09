package Chapter5;

public class Employee {
    String name;
    int age;
    double salary;
    boolean active;

    //constructors


    public Employee() {}

    public Employee(String name, int age, double salary, boolean active) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", active=" + active +
                '}';
    }
}
