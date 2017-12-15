package person;

// ~~~~~~~~~~ Imports ~~~~~~~~~~

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

public class Person
{
	
	// ~~~~~~~~~~ Constants ~~~~~~~~~~
	
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// ~~~~~~~~~~ Variables ~~~~~~~~~~
	private String firstName;
	private String lastName;
	private int age;
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public Person(final String firstName, final String lastName, final int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.age = age;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	public String getIndexName()
	{
		return lastName + ", " + firstName;
	}
	public String label()
	{
		return getIndexName() + ". " + age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	@Override
	public String toString()
	{
		return "{Person} {firstName: ["+firstName+"], lastName: ["+lastName+"], age: ["+age+"], getFullName(): ["+getFullName()+"], getIndexName: ["+getIndexName()+"]}";
	}
	
}
