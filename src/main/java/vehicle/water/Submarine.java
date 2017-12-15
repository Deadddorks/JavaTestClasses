package vehicle.water;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Submarine extends WaterVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected int maxDepth;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Submarine(final String company, final String name, final String marineID, final int maxDepth)
	{
		super(company, name, marineID);
		this.maxDepth = maxDepth;
	}
	
	public int getMaxDepth()
	{
		return maxDepth;
	}
	
	@Override
	public String toString()
	{
		return "{Submarine} {company: ["+company+"], name: ["+name+"], marineID: ["+marineID+"], maxDepth: ["+maxDepth+"]}";
	}
	
}
