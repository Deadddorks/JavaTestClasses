package vehicle;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Vehicle
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	protected String company;
	protected String name;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Vehicle(final String company, final String name)
	{
		this.company = company;
		this.name = name;
	}
	
	public String getCompany()
	{
		return company;
	}
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		return "{Vehicle} {company: ["+company+"], name: ["+name+"]}";
	}
}
