package fr.ship.world.service;

import fr.ship.world.pojo.Human;
import fr.ship.world.pojo.Ship;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@ApplicationScoped
public class ShipService {

    @Inject
    Logger logger;

    @Inject
    HumanService humanService;

    private Set<Ship> ships = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public ShipService() {
        ships.add(new Ship("Fregate", "combat", 50, "bleu"));
        ships.add(new Ship("Croisiere", "transporter", 100, "vert"));
    }
    public Set<Ship> list() {

        return ships;
    }

    public Set<Ship> add(Ship ship) {
        ship.getHumans().removeIf(existingHuman -> humanService.deleteWrongHuman(existingHuman));

        ships.add(ship);

        return ships;
    }

    public Set<Ship> delete(Ship ship) {
        ships.removeIf(existingShip -> existingShip.getName().contentEquals(ship.getName()));
        return ships;
    }


}
