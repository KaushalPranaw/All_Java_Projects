package com.yash.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yash.core.User;
import com.yash.core.UserList;
import com.yash.dao.UserDao;
import com.yash.exception.UserException;

@Path("/userservice")
public class UserService {
	
	UserDao dao=new UserDao();

	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser()
	{
		 System.out.println("getUser()");
		return dao.getUser();
	}
	@GET
	@Path("/userlist")
	@Produces(MediaType.APPLICATION_XML)
	public UserList getUserList()
	{
		 System.out.println("getUserList()");
		return dao.getUserList();
	}
	
	@GET
	@Path("/checkUser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkUser(@PathParam("id") int id) throws UserException
	{
		System.out.println("checkUser()");
		String msg=dao.checkUserId(id);
		System.out.println(msg);
		if(msg==null)
			throw new UserException("id not found");
		//return Response.status(Status.OK).entity(msg).build();
		return Response.status(200).entity(msg).build();
	}
	
	
}
