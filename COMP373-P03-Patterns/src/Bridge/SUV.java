package Bridge;

public class SUV extends Vehicle{
	private String name;
	
	public SUV (PriceClass priceclass) {
		super(priceclass);
	}

	@Override
	public String getVehicle() { //This method is from the abstract vehicle class. 
		// TODO Auto-generated method stub
		String setVehicle = "This "+this.getVehicleName()+" is: an SUV, and a: " + priceclass.getCarClass();
		return setVehicle;
	}
	
	@Override
	public void setVehicleName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
