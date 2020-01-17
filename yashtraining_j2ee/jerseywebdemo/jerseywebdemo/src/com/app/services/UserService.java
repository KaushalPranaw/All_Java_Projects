package com.app.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.app.exception.UserNotFoundException;
import com.app.user.User;
import com.app.user.UserList;
import com.app.userDao.UserDao;

@Path("/userservice")
public class UserService {

	UserDao dao = new UserDao();

	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser() {
		return dao.getUser();
	}

	@GET
	@Path("/userlist")
	@Produces(MediaType.APPLICATION_XML)
	public UserList getUserList() {
		return dao.getUsersList();
	}

	@GET
	@Path("/checkuser/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkUserId(@PathParam("id") int id) {
		String msg = dao.checkUserById(id);
		if (msg == null) {
			throw new UserNotFoundException("User With Id : " + id + " not  found");
		}

		else
			return Response.status(200).entity(msg).build();

	}
}
