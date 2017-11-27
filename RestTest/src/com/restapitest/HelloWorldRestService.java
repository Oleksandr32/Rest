package com.restapitest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/helloWorld")
public class HelloWorldRestService {
	
	/* @GET
	 @Produces(MediaType.TEXT_PLAIN)
	 @Path("{name}")
	 public String getCelcius(@Context HttpHeaders headers, @PathParam("name") String name){
		 return "Hello, "+name;
	 }*/
	 
	// download img
	 private static final String FILE_PATH = "d:\\124.png";
	@GET
	@Path("/get")
	@Produces("image/png")
	public Response getFile() {
	
		File file = new File(FILE_PATH);
	
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=image_from_server.png");
		return response.build();
	
	}
	
	
	 // downlaod file
	 /* private static final String FILE_PATH = "d:\\file.txt";
	 @GET
	 @Path("/get")
	 @Produces("text/plain")
	 public Response getFile() {
		File file = new File(FILE_PATH);
		
		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
			"attachment; filename=\"file_from_server.log\"");
		return response.build();
	 }*/
}