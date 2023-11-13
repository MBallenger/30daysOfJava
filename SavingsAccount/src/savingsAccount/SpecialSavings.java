//Marie Ballenger
//CIS 35a 23382
//Lab 4
//Due November 13 2023
//Date Submitted November 12 2023

package savingsAccount;

public class SpecialSavings extends SavingsAccount{
		

	public SpecialSavings(double savingsBalance) {
		super(savingsBalance);
	}
	
	public void calculateMonthlyInterest() {
		if (savingsBalance > 10000) {
			modifyInterestRate(10);
		}
		else {
			modifyInterestRate(4);
		}
		super.calculateMonthlyInterest();
	}
		
		

}


