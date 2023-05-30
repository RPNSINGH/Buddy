package co.buddy.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/buddy")
public class BuddyServices
{
	@GET
	@Produces("text/html")
	public String localServices(){
		return "<h2>Buddy: - :India customer service center::</h2>";
	}
	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalServices(){
		return "<h2>Buddy: - :International customer service center::</h2>";
	}
}
