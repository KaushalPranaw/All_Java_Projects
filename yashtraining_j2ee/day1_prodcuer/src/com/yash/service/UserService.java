package com.yash.service;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yash.dao.UserDao;
import com.yash.pojos.User;
import com.yash.pojos.UserList;

@Path("/service")
public class UserService {

	UserDao dao=new UserDao();
	
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser() {
		return dao.getUser();
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public UserList getAllList()
	{
		return dao.getAllList();
	}
	
//	http://localhost:8080/day1_prodcuer/rest/service/pathparam/1/raj
	@GET
	@Path("/pathparam/{id}/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testPathParam(@PathParam("id") String id,@PathParam("name") String name)
	{
		return Response.status(200).entity("id : "+id+" ,Name : "+name).build();
	}
	
	
	//  http://localhost:8080/day1_prodcuer/rest/service/queryparam?id=1&name=pranaw
	@GET
	@Path("/queryparam")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testQueryParam(@QueryParam("id") String id,@QueryParam("name") String name)
	{
		return Response.status(200).entity("id : "+id+" , Name : "+name).build();
	}
	
	
	//http://localhost:8080/day1_prodcuer/rest/service/matrixparam;id=123;name=abc
	@GET
	@Path("/matrixparam")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testMatrixParam(@MatrixParam("id") String id,@MatrixParam("name") String name)
	{
		return Response.status(200).entity("id : "+id+" , Name : "+name).build();
	}
	
	@POST
	@Path("/formparam")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testFormParam(@FormParam("keyId") String id,@FormParam("keyName") String name)
	{
		return Response.status(200).entity("id : "+id+" , Name : "+name).build();
	}
	
	
}
