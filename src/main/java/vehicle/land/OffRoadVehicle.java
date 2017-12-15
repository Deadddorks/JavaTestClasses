package vehicle.land;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class OffRoadVehicle extends LandVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	public enum OffRoadType {DIRTBIKE, ATV, UTV}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected OffRoadType offRoadType;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public OffRoadVehicle(final String company, final String name, final int numWheels, final OffRoadType offRoadType)
	{
		super(company, name, numWheels);
		this.offRoadType = offRoadType;
	}
	
	public OffRoadType getOffRoadType()
	{
		return offRoadType;
	}
	
	@Override
	public String toString()
	{
		return "{OffRoadVehicle} {company: ["+company+"], name: ["+name+"], numWheels: ["+numWheels+"], offRoadType: ["+offRoadType+"]}";
	}
}
