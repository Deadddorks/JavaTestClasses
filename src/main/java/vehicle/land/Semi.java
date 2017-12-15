package vehicle.land;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Semi extends RoadVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected double maxWeight;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Semi(final String company, final String name,  final String licensePlate, final double maxWeight)
	{
		super(company, name, 18, licensePlate);
		this.maxWeight = maxWeight;
	}
	
	public double getMaxWeight()
	{
		return maxWeight;
	}
	
	@Override
	public String toString()
	{
		return "{Semi} {company: ["+company+"], name: ["+name+"], numWheels: ["+numWheels+"], licensePlate: ["+licensePlate+"], maxWeight: ["+maxWeight+"]}";
	}
	
}
