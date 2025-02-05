
public class IncomeTaxCalculator {

	private double income;
	
	public void setIncome(double income) {
		this.income = income;
	}
	
	public double calculateTax() {
		
		if (income <= 150000) {
			return 0 ;
		}
		else if (income <= 300000) {
			return (income - 150000) * 0.05;
		}
		
		else if (income <= 500000) {
			return (300000 - 150000) * 0.05 + (income - 300000) * 0.10;
		}
		
		else {
			return ((150000 * 0.05) + (200000 * 0.10)) + ((income - 500000) * 0.20);
		}
	}
	
	public void displayTaxDetails() {
		System.out.println("Income: $" + income);
		System.out.println("Tax: $" + calculateTax());

	}
}
