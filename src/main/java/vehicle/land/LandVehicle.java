package vehicle.land;

// ~~~~~~~~~~ Imports ~~~~~~~~~~
import vehicle.Vehicle;
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class LandVehicle extends Vehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected int numWheels;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public LandVehicle(final String company, final String name, final int numWheels)
	{
		super(company, name);
		this.numWheels = numWheels;
	}
	
	public int getNumWheels()
	{
		return numWheels;
	}
	
	@Override
	public String toString()
	{
		return "{LandVehicle} {company: ["+company+"], name: ["+name+"], numWheels: ["+numWheels+"]}";
	}
	
}
