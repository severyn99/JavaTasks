package server;

import shop.Stuff;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/stuffs")
public class StuffService {

    private static Map<Integer, Stuff> stuffMap = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final Stuff getStuff(@PathParam("id") Integer id) {
        return stuffMap.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Stuff createStuff(final Stuff stuff) {
        stuffMap.put(stuff.getId(), stuff);
        return stuffMap.get(stuff.getId());
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteStuff(final @PathParam("id") Integer id) {
        stuffMap.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateStuff(final Stuff stuff) {
        stuffMap.replace(stuff.getId(), stuff);
        return Response.status(200).entity(stuffMap.get(stuff.getId())).build();
    }
}