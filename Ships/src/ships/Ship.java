//Marie Ballenger
//CIS 35a 23382
//Lab 4
//Due November 13 2023
//Date Submitted November 12 2023

package ships;
import java.lang.Class;

public class Ship {
	String name;
	int size;
	int age;
	String homePort;
	
	public Ship(String name, int size, String homePort) {
		this.name = name;
		this.size = size;
		this.homePort = homePort;
		
	}
	
	public String shipInfo() {
		return name + "'s size is " + size + "feet and its home port is " + homePort + ".";
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getHomePort() {
		return homePort;
	}

	public void setHomePort(String homePort) {
		this.homePort = homePort;
	}
}
