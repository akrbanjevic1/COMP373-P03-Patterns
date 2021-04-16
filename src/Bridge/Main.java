package Bridge;

import Bridge.Vehicle;
import Bridge.Economy;
import Bridge.SUV;
import Bridge.PriceClass;
import Bridge.Premium;
import Bridge.Sedan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiating the car classes here
		Economy economy = new Economy();
		Premium premium = new Premium();
		Sport sport = new Sport();
		
		//Instantiating specific vehicles here
		Vehicle audi = new Sedan(premium);
		audi.setVehicleName("Audi A4");

		Vehicle crv = new SUV(economy);
		crv.setVehicleName("Honda CRV");

		Vehicle taurus = new Sedan(economy);
		taurus.setVehicleName("Ford Taurus");

		Vehicle gWagen = new SUV(premium);
		gWagen.setVehicleName("Mercedes G-Wagen");

		Vehicle toyota = new SportsCar(sport);
		toyota.setVehicleName("Toyota GT 86");
		
		//Testing of premium car (an audi) should go here
		String audiResult = audi.getVehicle();
		System.out.println(audiResult);

		//Testing of an economy suv here
		String crvResult = crv.getVehicle();
		System.out.println(crvResult);

		//Testing of an economy sedan here
		String taurusResult = taurus.getVehicle();
		System.out.println(taurusResult);

		//Testing of a premium SUV here
		String gWagenResult = gWagen.getVehicle();
		System.out.println(gWagenResult);

		// Testing of a sports car here
		String toyotaResult = toyota.getVehicle();
		System.out.println(toyotaResult);
	}

}
