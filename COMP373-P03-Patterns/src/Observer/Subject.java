package Observer;

public interface Subject {
	public void attach(Observer a); //method used to add an observer to bodyshop
	public void detach(Observer b); //method used to remove observer from bodyshop
	public void setStatus(String status); //method to update observers on status of bodyshop
}
