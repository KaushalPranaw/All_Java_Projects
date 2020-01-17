package com.form;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/formservice")
public class FormsService {

	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTextFile() {
		File file = new File("F:\\welcome.txt");
		System.out.println(file.isFile());
		return Response.ok(file).build();
	}

	@GET
	@Path("/files")
	@Produces("text/plain")
	public Response getFile() {
		File file = new File("F:\\welcome.txt");
		ResponseBuilder responseBuilder = Response.ok(file);
		responseBuilder.header("Content-Disposition", "attachment; filename=\"abc.txt\"");
		return responseBuilder.build();
	}

	@GET
	@Path("/image")
	@Produces("image/png")
	public Response getImage() {
		File file = new File("F:\\abc.png");
		return Response.ok(file).build();
	}

	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getPDF() {
		File file = new File("F:\\abc.pdf");
		return Response.ok(file).build();
		/*ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition", "attachment; filename=\"pranaw.pdf\"");
		return response.build();*/
	}
}
