package Visitor;

public interface Visitor {
    public double visitIL(Sedan sedan);
    public double visitGA(Sedan sedan);
    public double visitCA(Sedan sedan);
    public double visitIL(SUV suv);
    public double visitGA(SUV suv);
    public double visitCA(SUV suv);
}
