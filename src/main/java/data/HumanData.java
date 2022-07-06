package data;

import fr.ship.world.pojo.Human;
import fr.ship.world.service.HumanService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@ApplicationScoped

public class HumanData {
    @Inject
    HumanService humanService;
    public Set<Human> humans = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public HumanData() {
        humans.add(new Human("toto", "male", "human", 18));
        humans.add(new Human("tata", "female", "martien", 300));
        humans.add(new Human("titi", "male", "hobbit", 400));
    }
    public Set<Human> add(Human human) {
        humans.add(human);
        return humans;
    }
    public void delete(Human human) {
        humans.removeIf(existingHuman -> existingHuman.getName().contentEquals(human.getName()));
    }


    public Set<Human> list() {
        return humans;
    }
}
