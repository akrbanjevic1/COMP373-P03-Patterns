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
		
		bodyshop.attach(car);
		bodyshop.attach(suv);
		
		bodyshop.setStatus("Capacity reached; wait until a vehicle has left.");
		
		//Testing to see what happens when an observer is removed here from bodyshop's list.
		bodyshop.detach(suv);
		bodyshop.setStatus("Bodyshop slot(s) open; drive up for service!");
		
		
	}

}
