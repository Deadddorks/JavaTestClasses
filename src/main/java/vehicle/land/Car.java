package vehicle.land;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Car extends RoadVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected double mpg;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Car(final String company, final String name, final String licensePlate, final double mpg)
	{
		super(company, name, 4, licensePlate);
		this.mpg = mpg;
	}
	
	public double getMpg()
	{
		return mpg;
	}
	
	@Override
	public String toString()
	{
		return "{Car} {company: ["+company+"], name: ["+name+"], numWheels: ["+numWheels+"], licensePlate: ["+licensePlate+"], mpg: ["+mpg+"]}";
	}
	
}
