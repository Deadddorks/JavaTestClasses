package vehicle.water;

// ~~~~~~~~~~ Imports ~~~~~~~~~~
import vehicle.Vehicle;
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class WaterVehicle extends Vehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected String marineID;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public WaterVehicle(final String company, final String name, final String marineID)
	{
		super(company, name);
		this.marineID = marineID;
	}
	
	public String getMarineID()
	{
		return marineID;
	}
	
	@Override
	public String toString()
	{
		return "{WaterVehicle} {company: ["+company+"], name: ["+name+"], marineID: ["+marineID+"]}";
	}
	
}
