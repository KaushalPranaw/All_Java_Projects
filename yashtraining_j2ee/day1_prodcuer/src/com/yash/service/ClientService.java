package com.yash.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import com.app.exception.UserNotFoundException;

import com.exec.UserNotFoundException;

@Path("/serv")
public class ClientService {

	@GET
	@Path("/checkUser/{id}")
	@Produces(MediaType.APPLICATION_JSON)                               
	public Response testPathParam(@PathParam("id") int id)
	{
		String msg=checkUser(id);
		if(msg==null)
		{
			throw new UserNotFoundException(" "+id +" not Found");
		}
		else
			return Response.status(200).entity(msg).build();
	}
	
	
	 String checkUser(int id)
	{
		if(id==10)
			return id+" is valid";
		else
			return null;
	}
}
