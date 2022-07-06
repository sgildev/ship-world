package fr.ship.world.resource;

import fr.ship.world.pojo.Human;
import fr.ship.world.service.HumanService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Set;

@Path("/humans")
public class HumanResource {

    @ApplicationScoped

    @Inject
    HumanService humanService;

    @GET
    public Set<Human> list() {
        return humanService.list();
    }


    @POST
    public Set<Human> add(Human human) {
        return humanService.add(human);
    }

    @DELETE
    public Set<Human> delete(Human human) {
        return humanService.delete(human);
    }
}