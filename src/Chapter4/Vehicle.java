package Chapter4;

public class Vehicle {
    String manufacturer;
    String model;
    double cc;
    int year;
    boolean sport;

    public Vehicle(){}
    public Vehicle(String manufacturer,String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Vehicle(String manufacturer,String model,double cc,int year,boolean sport){
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sport=" + sport +
                '}';
    }
}
