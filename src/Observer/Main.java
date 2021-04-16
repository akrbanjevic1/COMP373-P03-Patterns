package Observer;
import Observer.BodyShop;
import Observer.Subject;
import Observer.Car;
import Observer.SUV;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		SUV suv = new SUV();
		car.setName("Toyota Camry");
		car.setID(1045);
		suv.setName("Volkswagen Atlas");
		suv.setID(398);
		
		BodyShop bodyshop = new BodyShop();

		// Let's pretend that the bodyshop can only hold two cars at once
		bodyshop.attach(car);
		bodyshop.attach(suv);
		
		bodyshop.setStatus("Capacity reached; wait until a vehicle has left."); // Limit reached as 'car' and 'suv' are in there
		
		//Testing to see what happens when an observer is removed here from bodyshop's list.
		bodyshop.detach(suv);
		bodyshop.setStatus("Bodyshop slot(s) open; drive up for service!"); // One slot open now thanks to 'suv' leaving
		
		SportsCar sportsCar = new SportsCar();

		sportsCar.setName("Subaru BRZ");
		sportsCar.setID(47);

		bodyshop.attach(sportsCar); // Shop is now full again

		bodyshop.setStatus("Capacity reached; wait until a vehicle has left.");

		bodyshop.detach(sportsCar); // Shop has one slot available again

		bodyshop.setStatus("Bodyshop slot(s) open; drive up for service!");
	}

}
