package Visitor;

public class Sedan implements Visitable {
    private double price;

    public Sedan(double vehicle) {
        price = vehicle;
    }

    public double getPrice() {
        return price;
    }

    // Methods to receive the visitor for each state
    public double acceptIL(Visitor visitor) {
        return visitor.visitIL(this);
    }

    public double acceptGA(Visitor visitor) {
        return visitor.visitGA(this);
    }

    public double acceptCA(Visitor visitor) {
        return visitor.visitCA(this);
    }

	@Override
	public double acceptNY(Visitor visitor) {
		return visitor.visitNY(this);
	}
}
