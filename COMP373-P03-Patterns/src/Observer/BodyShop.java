package Observer;
import java.util.*;


public class BodyShop implements Subject{
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		for(Observer x: this.observers) {
			x.setUpdate(status);
		}
	}

	@Override
	public void attach(Observer a) {
		// TODO Auto-generated method stub
		observers.add(a);
	}

	@Override
	public void detach(Observer b) {
		// TODO Auto-generated method stub
		observers.remove(b);
	}
}
