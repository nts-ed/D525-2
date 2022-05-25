package jsp_jersey_restful_api.demo_001;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jsp_jersey_restful_api.demo_001.model.User;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/")
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getIt() {
		User u = new User();
		u.setName("duan");
		return u;
	}
}
