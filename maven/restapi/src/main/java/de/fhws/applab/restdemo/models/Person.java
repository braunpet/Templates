package de.fhws.applab.restdemo.models;

import java.util.Date;

import com.owlike.genson.annotation.JsonDateFormat;
import com.owlike.genson.annotation.JsonIgnore;

public class Person
{

	private String firstName;

	private String lastName;

	private Address address;

	private Date dateOfBirth;

	private String password;

	public Person( )
	{}

	public Person( String firstName, String lastName )
	{
		super( );
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = new Date( );
		this.password = "secret";
	}

	public String getFirstName( )
	{
		return firstName;
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public String getLastName( )
	{
		return lastName;
	}

	public void setLastName( String lastName )
	{
		this.lastName = lastName;
	}

	public Address getAddress( )
	{
		return address;
	}

	public void setAddress( Address address )
	{
		this.address = address;
	}

	@JsonDateFormat( asTimeInMillis = true )
	public Date getDateOfBirth( )
	{
		return dateOfBirth;
	}

	@JsonDateFormat( asTimeInMillis = true )
	public void setDateOfBirth( Date dateOfBirth )
	{
		this.dateOfBirth = dateOfBirth;
	}

	@JsonIgnore
	public String getPassword( )
	{
		return password;
	}

	@JsonIgnore
	public void setPassword( String password )
	{
		this.password = password;
	}

	@Override
	public String toString( )
	{
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", dateOfBirth=" +
			dateOfBirth + ", password=" + password + "]";
	}

}
