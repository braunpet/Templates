package de.fhws.applab.restdemo;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import de.fhws.applab.restdemo.Accounts;

@ApplicationPath("/demo")
public class TestApplication extends Application
{
	@Override
	public Set<Class<?>> getClasses()
	{
		final Set<Class<?>> returnValue = new HashSet<Class<?>>();
		returnValue.add(Accounts.class);
		return returnValue;
	}
} 