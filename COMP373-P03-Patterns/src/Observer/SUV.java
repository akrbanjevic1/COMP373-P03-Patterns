package Observer;

public class SUV implements Observer{
	private String name;
	private int ID;
	@Override
	public void setUpdate(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+" with ID of: "+this.getID()+" " + message);
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setID(int ID) {
		// TODO Auto-generated method stub
		this.ID = ID;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}
}
