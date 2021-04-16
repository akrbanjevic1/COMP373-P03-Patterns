package Visitor;

public class Main {

	public static void main(String[] args) {
		StateTax tax = new StateTax();

		Sedan audiA4 = new Sedan(39100);
		SUV porscheCayenne = new SUV(675000);
		Truck fordF150 = new Truck(35000);

		System.out.println(audiA4.acceptIL(tax));
		System.out.println(porscheCayenne.acceptCA(tax));
		System.out.println(fordF150.acceptGA(tax));
	}

}
