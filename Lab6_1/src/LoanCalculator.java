
public class LoanCalculator {

	private String pdName;
	private double pdPrice;
	private double pdInterestRate;
	private int pdYear;
	
	
	
	public void setLoanDetails(String productName, double price, double interestRate, int years) {
		pdName = productName;
		pdPrice = price;
		pdInterestRate = interestRate;
		pdYear = years;
	}
	
	public double calculateMonthlyPayment() {
		
		double rate = pdInterestRate / 100;
		rate /= 12;
		
		double finalStep = Math.pow(1 + pdInterestRate / 100, pdYear);
		
		return (pdPrice * rate * finalStep) / (finalStep - 1);
	}
	
	public void displayLoanDetails() {
		System.out.println("Product: " + pdName);
		System.out.println("Price: " + pdPrice);
		System.out.println("Interest Rate: " + pdInterestRate + "%");
		System.out.println("Loan Period: " + pdYear + " years");
		System.out.println("Monthly Payment: " + calculateMonthlyPayment());
	}
}
