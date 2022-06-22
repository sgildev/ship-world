package fr.ship.world.service;


import fr.ship.world.pojo.Human;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import org.jboss.logging.Logger;

@ApplicationScoped
public class HumanService {
    @Inject
    Logger logger;


    private Set<Human> humans = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public HumanService() {
        humans.add(new Human("toto", "male", "alien"));
        humans.add(new Human("tata", "female", "martien"));
        humans.add(new Human("titi", "male", "earthlings "));
    }


    public void msg() {
        logger.info("tata");
    }

    public Set<Human> list() {
        return humans;
    }

    public Set<Human> add(Human human) {
        humans.add(human);
        return humans;
    }

    public Set<Human> delete(Human human) {
        humans.removeIf(existingHuman -> existingHuman.getName().contentEquals(human.getName()));
        return humans;
    }


}