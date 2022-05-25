package jsp_jersey_restful_api.demo_001.resources;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jsp_jersey_restful_api.demo_001.model.User;
import jsp_jersey_restful_api.demo_001.service.UserService;

@Path("/users")
public class UserResource {

	private UserService userService = new UserService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> fetchAll() {
		return userService.fetchAll();
	}

	@GET
	@Path("user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") int id) {
		return Response.ok().entity(userService.fetchBy(id)).build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(User user) {
		// create notification
//		userService.create(user);
		return Response.status(Status.CREATED).build();
	}

	@PUT
	@Path("/user/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") long id, User user) {
//		userService.update(user);
		return Response.noContent().build();
	}

	@DELETE
	@Path("/user/{id}")
	public Response delete(@PathParam("id") long id) {
//		userService.delete(id);
		return Response.status(202).entity("User deleted successfully !!").build();
	}
}
