package Bridge;

public class SportsCar extends Vehicle {
    String name;

    public SportsCar(PriceClass priceClass) {
        super(priceClass);
    }

    public String getVehicle() {
        String setVehicle = "This " + this.getVehicleName()+" is: a sports car, and a: " + priceclass.getCarClass();

        return setVehicle;
    }

    public void setVehicleName(String name) {
        this.name = name;
    }

    public String getVehicleName() {
        return this.name;
    }
}
