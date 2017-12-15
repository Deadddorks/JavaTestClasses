package vehicle.air;

// ~~~~~~~~~~ Imports ~~~~~~~~~~
import vehicle.Vehicle;
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class AirVehicle extends Vehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected int capacity;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public AirVehicle(final String company, final String name, final int capacity)
	{
		super(company, name);
		this.capacity = capacity;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	@Override
	public String toString()
	{
		return "{AirVehicle} {company: ["+company+"], name: ["+name+"], capacity: ["+capacity+"]}";
	}
	
}
