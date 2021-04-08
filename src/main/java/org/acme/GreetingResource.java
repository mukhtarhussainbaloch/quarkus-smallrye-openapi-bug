package org.acme;

import java.time.LocalDate;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        LocalDate now = LocalDate.of(2019, 04, 04);
        Person person = new Person();
        person.id = 10;
        person.name = "Mukhtar";
        person.dob = now;
        return Response.ok(person).build();
    }
}