//Marie Ballenger
//CIS 35a 23382
//Lab 4
//Due November 13 2023
//Date Submitted November 12 2023

package ships;
import java.util.Scanner;
import java.util.Random;

public class ShipDriver {
		
	public static void main(String[] args) {
		Ship[] shipList = new Ship[3];
		shipList[0] = new Ship( "Money Pit Ship",  30,  "San Francisco");
		shipList[1] = new CruiseShip( "Big Cruise Ship",  100,  "Trinidad", "Happy Cruising");
		shipList[2] = new CargoShip( "Big Cargo Ship",  300,  "Panama City", 1200);
		
		Random rand = new Random();
		int shipRand = rand.nextInt(shipList.length);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to sign up for ShipFacts?");
		
		String response = input.nextLine();
		
		System.out.println("Since ShipFacts is spam we don't care how you responded.  We provide Ship Facts regardless.");
		
		System.out.println("Your random Ship Fact is that " + shipList[shipRand].shipInfo());
	
	}
}


