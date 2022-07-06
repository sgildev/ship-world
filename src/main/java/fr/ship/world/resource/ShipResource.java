package fr.ship.world.resource;

import fr.ship.world.pojo.Ship;
import fr.ship.world.service.ShipService;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Set;

@Path("/ships")
public class ShipResource {

    @Inject
    ShipService shipService;


    @GET
    public Set<Ship> list() {
        return shipService.list();
    }

    @POST
    public Set<Ship> add(Ship ship) {
        return shipService.add(ship);
    }

    @DELETE
    public Set<Ship> delete(Ship ship) {
        return shipService.delete(ship);
    }


}
