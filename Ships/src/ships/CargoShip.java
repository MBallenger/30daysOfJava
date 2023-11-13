//Marie Ballenger
//CIS 35a 23382
//Lab 4
//Due November 13 2023
//Date Submitted November 12 2023

package ships;

public class CargoShip extends Ship{
	int containerCapacity;

	
	CargoShip(String name, int size, String homePort, int containerCapacity){
		super(name, size, homePort);
		this.containerCapacity = containerCapacity;
	}

	public int getContainerCapacity() {
		return containerCapacity;
	}

	public void setContainerCapacity(int containerCapacity) {
		this.containerCapacity = containerCapacity;
	}

	@Override
	public String shipInfo() {
		return super.getName() + "'s size is " + super.getSize() + "feet and its home port is " + super.getHomePort() + ". It can hold " + containerCapacity + " containers.";
	}
}
