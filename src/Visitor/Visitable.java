package Visitor;

public interface Visitable {
    public double acceptIL(Visitor visitor);
    public double acceptGA(Visitor visitor);
    public double acceptCA(Visitor visitor);
    public double acceptNY(Visitor visitor);
}
