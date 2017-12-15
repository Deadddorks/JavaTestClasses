package vehicle.land;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Motorcycle extends RoadVehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	public enum MotorCycleType {SPORT, CRUISER, HARLEY}
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected MotorCycleType bikeType;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Motorcycle(final String company, final String name, final String licensePlate, final MotorCycleType bikeType)
	{
		super(company, name, 2, licensePlate);
		this.bikeType = bikeType;
	}
	
	public MotorCycleType getBikeType()
	{
		return bikeType;
	}
	
	@Override
	public String toString()
	{
		return "{Motorcycle} {company: ["+company+"], name: ["+name+"], numWheels: ["+numWheels+"], licensePlate: ["+licensePlate+"], bikeType: ["+bikeType+"]}";
	}
	
}
