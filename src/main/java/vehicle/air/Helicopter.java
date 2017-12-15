package vehicle.air;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Helicopter extends AirVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected int maxHeight;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Helicopter(final String company, final String name, final int capacity, final int maxHeight)
	{
		super(company, name, capacity);
		this.maxHeight = maxHeight;
	}
	
	public int getMaxHeight()
	{
		return maxHeight;
	}
	
	@Override
	public String toString()
	{
		return "{Helicopter} {company: ["+company+"], name: ["+name+"], capacity: ["+capacity+"], maxHeight: ["+maxHeight+"]}";
	}
	
}
