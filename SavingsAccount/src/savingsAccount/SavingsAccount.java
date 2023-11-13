//Marie Ballenger
//CIS 35a 23382
//Lab 4
//Due November 13 2023
//Date Submitted November 12 2023

package savingsAccount;

public class SavingsAccount {
	
	public static double annualInterestRate;
	protected double savingsBalance;
	public double monthlyInterest;
	
	public SavingsAccount(double savingsBalance){	
		this.savingsBalance = savingsBalance;
	}
		
	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate / 100;
	}
	
	public void calculateMonthlyInterest(){
		monthlyInterest = savingsBalance * (annualInterestRate / 12);
	}
	
	double updateSavings() {
		savingsBalance += monthlyInterest;
		return savingsBalance;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double rate) {
		SavingsAccount.annualInterestRate = rate / 100;
	}

	double getSavingsBalance() {
		savingsBalance = (Math.round(savingsBalance * 100))/100;
		return savingsBalance;
	}

	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double getMonthlyInterest() {
		return monthlyInterest;
	}

	public void deposit(double depositAmount) {
		savingsBalance += depositAmount;
	}
	
	public void withdraw(double withdrawAmount){
		savingsBalance -= withdrawAmount;
	}
}

