//Marie Ballenger
//CIS 35a 23382
//Lab 4
//Due November 13 2023
//Date Submitted November 12 2023

package savingsAccount;

public class SpecialSavingsDriver {

	public static void main(String[] args) {
		
		SpecialSavings saver1 = new SpecialSavings(2000);
		SpecialSavings saver2 = new SpecialSavings(3000);
		
		SavingsAccount.setAnnualInterestRate(4);
		
		saver1.deposit(8000);
		saver2.deposit(100);
		saver1.deposit(0);
		saver2.deposit(0);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		saver1.updateSavings();
		saver2.updateSavings();
		
		System.out.println("The balance for saver1's account is: " + saver1.getSavingsBalance());
		System.out.println("The balance for saver2's account is: " + saver2.getSavingsBalance());
		
		saver1.withdraw(0);
		saver2.withdraw(3000);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		saver1.updateSavings();
		saver2.updateSavings();
		
		System.out.println("The balance for saver1's account is: " + saver1.getSavingsBalance());
		System.out.println("The balance for saver2's account is: " + saver2.getSavingsBalance());

		}
	}
