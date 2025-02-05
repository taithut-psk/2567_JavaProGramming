
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
		
		return (pdPrice * ( (pdInterestRate / 100) / 12) ) * 
			    Math.pow(1 + ( (pdInterestRate / 100) / 12) , pdYear * 12 ) / 
			   (Math.pow(1 + ( (pdInterestRate / 100) / 12), pdYear * 12) - (1));
	}
	
	public void displayLoanDetails() {
		System.out.println("Product: " + pdName);
		System.out.println("Price: " + pdPrice);
		System.out.println("Interest Rate: " + pdInterestRate + "%");
		System.out.println("Loan Period: " + pdYear + " years");
		System.out.println("Monthly Payment: " + String.format("%.2f", calculateMonthlyPayment()));
	}
}
