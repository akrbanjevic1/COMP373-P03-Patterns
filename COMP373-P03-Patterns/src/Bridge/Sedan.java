package Bridge;

public class Sedan extends Vehicle{
	public Sedan (PriceClass priceclass) {
		super(priceclass);
	}

	@Override
	public String getVehicle() {
		// TODO Auto-generated method stub
		String setVehicle = "This car is: a sedan, and a: " + priceclass.getCarClass();
		return setVehicle;
	}
	
}
