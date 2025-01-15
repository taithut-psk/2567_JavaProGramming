
public class TestLoanCalculator {

	public static void main(String[] args) {
		LoanCalculator loan = new LoanCalculator();
		
		loan.setLoanDetails("Labtop", 50000, 5, 2);
		
		loan.displayLoanDetails();
	}

}