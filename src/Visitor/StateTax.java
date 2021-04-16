package Visitor;

import java.text.DecimalFormat;

public class StateTax implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##");

    public StateTax() {}

    // These methods calculate the tax for each vehicle depending on the type of vehicle as well as the state
    @Override
    public double visitIL(Sedan sedan) {
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((sedan.getPrice() * .1525) + sedan.getPrice()));
    }

    @Override
    public double visitGA(Sedan sedan) {
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((sedan.getPrice() * .095) + sedan.getPrice()));
    }

    @Override
    public double visitCA(Sedan sedan) {
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((sedan.getPrice() * .1125) + sedan.getPrice()));
    }

    @Override
    public double visitIL(SUV suv) {
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((suv.getPrice() * .1375) + suv.getPrice()));
    }

    @Override
    public double visitGA(SUV suv) {
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((suv.getPrice() * .08) + suv.getPrice()));
    }

    @Override
    public double visitCA(SUV suv) {
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((suv.getPrice() * .0975 + suv.getPrice())));
    }

	@Override
	public double visitIL(Truck truck) {
		// TODO Auto-generated method stub
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((truck.getPrice() * .1525 + truck.getPrice())));
	}

	@Override
	public double visitGA(Truck truck) {
		// TODO Auto-generated method stub
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((truck.getPrice() * .092) + truck.getPrice()));
	}

	@Override
	public double visitCA(Truck truck) {
		// TODO Auto-generated method stub
        System.out.println("Your total today, including tax, is: ");
        return Double.parseDouble(df.format((truck.getPrice() * .112 + truck.getPrice())));
	}
}
