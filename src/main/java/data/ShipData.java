package data;

import fr.ship.world.pojo.Ship;
import fr.ship.world.service.ShipService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@ApplicationScoped
public class ShipData {

    @Inject
    ShipService ShipService;

    private Set<Ship> ships = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));


    public ShipData() {
        ships.add(new Ship("Fregate", "combat", 50, "bleu"));
        ships.add(new Ship("Croisiere", "transporter", 100, "vert"));
    }


    public Set<Ship> add(Ship ship) {
        ships.add(ship);
        return ships;
    }

    public Set<Ship> list() {
        return ships;
    }

    public Set<Ship> delete(Ship ship) {
        ships.removeIf(existingShip -> existingShip.getName().contentEquals(ship.getName()));
        return ships;
    }


}
