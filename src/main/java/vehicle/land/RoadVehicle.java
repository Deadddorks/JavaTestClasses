package vehicle.land;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class RoadVehicle extends LandVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected String licensePlate;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public RoadVehicle(final String company, final String name, final int numWheels, final String licensePlate)
	{
		super(company, name, numWheels);
		this.licensePlate = licensePlate;
	}
	
	public String getLicensePlate()
	{
		return licensePlate;
	}
	
	@Override
	public String toString()
	{
		return "{RoadVehicle} {company: ["+company+"], name: ["+name+"], numWheels: ["+numWheels+"], licensePlate: ["+licensePlate+"]}";
	}
	
}
