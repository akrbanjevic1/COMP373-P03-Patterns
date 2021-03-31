package Bridge;

public abstract class Vehicle {
	PriceClass priceclass;
	
	public Vehicle(PriceClass priceclass) {
		this.priceclass = priceclass;
	}
	
	abstract public String getVehicle();
	
}
