package Bridge;

public class SUV extends Vehicle{
	public SUV (PriceClass priceclass) {
		super(priceclass);
	}

	@Override
	public String getVehicle() {
		// TODO Auto-generated method stub
		String setVehicle = "This car is: an SUV, and a: " + priceclass.getCarClass();
		return setVehicle;
	}
	
}
