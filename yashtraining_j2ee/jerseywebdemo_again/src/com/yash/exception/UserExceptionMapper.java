package com.yash.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

public class UserExceptionMapper implements ExceptionMapper<UserException> {

	@Override
	public Response toResponse(UserException ex) {
		// TODO Auto-generated method stub
		return Response.status(Status.NOT_FOUND).entity(new ErrorProps(ex.getMessage())).build();
	}

}
