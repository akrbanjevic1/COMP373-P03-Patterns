package Bridge;

public class Premium implements PriceClass {

	@Override
	public String getCarClass() {
		// TODO Auto-generated method stub
		String carClass = "Premium-segment vehicle.";
		return carClass;
	}

}
