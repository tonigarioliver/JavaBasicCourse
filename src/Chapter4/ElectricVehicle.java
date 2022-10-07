package Chapter4;

public class ElectricVehicle extends Vehicle{
    String electricmotor;

    public ElectricVehicle(){

    }

    public ElectricVehicle(String electricmotor){
        this.electricmotor = electricmotor;
    }
    public ElectricVehicle ( String manufacturer,String model, String electricmotor) {
        super(manufacturer,model);
        this.electricmotor = electricmotor;
    }

    @Override
    public void acceleration(Integer acceleration){
        super.acceleration(acceleration);
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "electricmotor='" + electricmotor + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                '}';
    }
}
