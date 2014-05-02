package de.fhws.applab.demo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path( "/entities" )
public class EntityResource {
	
	@GET
	public String ping()
	{
		return "OK";
	}
	
} 