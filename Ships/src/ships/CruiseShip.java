//Marie Ballenger
//CIS 35a 23382
//Lab 4
//Due November 13 2023
//Date Submitted November 12 2023

package ships;

public class CruiseShip extends Ship {
	String cruiseLine;
	
	CruiseShip(String name, int size, String homePort, String cruiseLine){
		super(name, size, homePort);
		this.homePort = homePort;
		this.cruiseLine = cruiseLine;
	}

	public String getCruiseLine() {
		return cruiseLine;
	}

	public void setCruiseLine(String cruiseLine) {
		this.cruiseLine = cruiseLine;
	}

	@Override
	public String shipInfo() {
		return super.getName() + "'s size is " + super.getSize() + " feet and its home port is " + super.getHomePort() + ". It is operated by " + cruiseLine + ".";
	}
	
}
