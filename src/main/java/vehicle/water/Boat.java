package vehicle.water;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Boat extends WaterVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected int maxSpeed;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Boat(final String company, final String name, final String marineID, final int maxSpeed)
	{
		super(company, name, marineID);
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString()
	{
		return "{Boat} {company: ["+company+"], name: ["+name+"], marineID: ["+marineID+"], maxSpeed: ["+maxSpeed+"]}";
	}
	
}
