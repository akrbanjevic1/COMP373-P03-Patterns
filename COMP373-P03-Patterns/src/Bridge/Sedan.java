package Bridge;

public class Sedan extends Vehicle{
	private String name;
	public Sedan (PriceClass priceclass) {
		super(priceclass);
	}
	
	@Override
	public String getVehicle() {
		// TODO Auto-generated method stub
		String setVehicle = "This "+this.getVehicleName()+" is: a sedan, and a: " + priceclass.getCarClass();
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
