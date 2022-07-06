package fr.ship.world.service;

import data.ShipData;
import fr.ship.world.pojo.Ship;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Set;


@ApplicationScoped
public class ShipService {

    @Inject
    ShipData shipData;

    @Inject
    HumanService humanService;


    public Set<Ship> list() {
        return shipData.list();
    }

    public Set<Ship> add(Ship ship) {
        ship.getHumans().removeIf(existingHuman -> humanService.deleteWrongHuman(existingHuman));

        shipData.add(ship);

        return shipData.list();
    }

    public Set<Ship> delete(Ship ship) {
        shipData.delete(ship);
        return shipData.list();
    }


}
