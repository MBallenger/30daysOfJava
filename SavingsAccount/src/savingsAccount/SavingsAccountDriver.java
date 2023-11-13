//Marie Ballenger
//CIS 35a 23382
//Lab 4
//Due November 13 2023
//Date Submitted November 12 2023

package savingsAccount;

public class SavingsAccountDriver {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.setAnnualInterestRate(4);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		saver1.updateSavings();
		saver2.updateSavings();
		
		System.out.println("The balance for saver1's account is: " + saver1.getSavingsBalance());
		System.out.println("The balance for saver2's account is: " + saver2.getSavingsBalance());
		
		SavingsAccount.modifyInterestRate(5);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		saver1.updateSavings();
		saver2.updateSavings();
		
		System.out.println("The balance for saver1's account is: " + saver1.getSavingsBalance());
		System.out.println("The balance for saver2's account is: " + saver2.getSavingsBalance());
	}


}

