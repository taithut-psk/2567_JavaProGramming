
public class TestIncomeTaxCalculator {

	public static void main(String[] args) {
		IncomeTaxCalculator incomeTaxCalculator = new IncomeTaxCalculator();
		
		incomeTaxCalculator.setIncome(450000);

		incomeTaxCalculator.displayTaxDetails();
	}

}
