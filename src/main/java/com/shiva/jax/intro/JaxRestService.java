package com.shiva.jax.intro;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")
public class JaxRestService {
	@GET
	public  String welcome() {
		return "Welcome";
	}
}
