package vehicle.air;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Plane extends AirVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected int engineCount;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Plane(final String company, final String name, final int capacity, final int engineCount)
	{
		super(company, name, capacity);
		this.engineCount = engineCount;
	}
	
	public int getEngineCount()
	{
		return engineCount;
	}
	
	@Override
	public String toString()
	{
		return "{Plane} {company: ["+company+"], name: ["+name+"], capacity: ["+capacity+"], engineCount: ["+engineCount+"]}";
	}
	
}
