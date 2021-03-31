package Observer;

public interface Subject {
	public void attach(Observer a);
	public void detach(Observer b);
	public void setStatus(String status);
}
