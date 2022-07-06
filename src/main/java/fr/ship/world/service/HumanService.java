package fr.ship.world.service;  // Dossier du projet

import data.HumanData;
import fr.ship.world.pojo.Human;
import fr.ship.world.resource.HumanResource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Set;

@ApplicationScoped // Annotations pour les objets injectés
public class HumanService {    // classe HumanService
    @Inject
    HumanData humanData;
    @Inject
    HumanResource humanResource;

    public boolean deleteWrongHuman(Human human) {
        String race = human.getRace();
        int years = human.getYears();

        if (race.equals("human") && years < 18 || !race.equals("human") && years < 256) {
            return true;
        } else {
            return false;
        }
    }

    public Set<Human> list() {
        return humanData.list();
    }


    public Set<Human> add(Human human) {
        humanData.add(human);
        return humanData.list();
    }

    public Set<Human> delete(Human human) {
        humanData.delete(human);
        return humanData.list();
    }


}