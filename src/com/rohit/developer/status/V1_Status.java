package com.rohit.developer.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/v1/status")
public class V1_Status {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return "<p>Java Web Service</p>";
	}

}
