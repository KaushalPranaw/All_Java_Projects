package com.app.services;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/fileservice")
public class FileService {

	private static final String IMAGE_PATH = "C:\\Users\\shubham.singh\\Downloads\\image.jpg";

	@GET
	@Path("/image")
	@Produces("image/png")
	public Response getImage() {
		File img = new File(IMAGE_PATH);
		ResponseBuilder response = Response.ok(img);
	
		return response.build();
	}

	
	  private static final String FILE_PATH = "c:\\myfile.txt";
	  
	  @GET
	  
	  @Path("/txt")
	  
	  @Produces("text/plain") public Response getFile() { File file = new
	  File(FILE_PATH);
	  
	  ResponseBuilder response = Response.ok(file);  return
	  response.build();
	  
	  }
	  private static final String PDF_FILE = "C:\\Users\\shubham.singh\\Downloads\\JunePayslip.pdf";  
	    @GET  
	    @Path("/pdf")  
	    @Produces("application/pdf")  
	    public Response getpdf() {  
	        File pdf = new File(PDF_FILE);  
	        ResponseBuilder response = Response.ok(pdf);  
	     
	        return response.build();  
	    }  
	  
	 
}
