package controllers;

@Path("/hello")
public class RestTest {
	
	public String task() {
		return "Hello Jetty, JAX-RS now";
	}

}
