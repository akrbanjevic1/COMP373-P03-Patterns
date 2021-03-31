package Bridge;

import Bridge.Vehicle;
import Bridge.PriceClass;
import Bridge.Premium;
import Bridge.Sedan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Premium premium = new Premium();
		Vehicle audi = new Sedan(premium);
		
		//Testing of premium car (an audi) should go here
		String audiResult = audi.getVehicle();
		System.out.println(audiResult);
	}

}
