package fr.ship.world.service;  // Dossier du projet

import fr.ship.world.pojo.Human; // Importation de la class Human dans le pojo

import javax.enterprise.context.ApplicationScoped; // C'est pour charger la classe
import javax.inject.Inject; // C'est pour récuperer le service ou on le souhaite
import java.util.Collections; // une liste
import java.util.LinkedHashMap; // Lié liste et la synchronisé
import java.util.Set; // importer liste de la collection

import org.jboss.logging.Logger;

@ApplicationScoped // Annotations pour les objets injectés
public class HumanService {    // classe HumanService
    @Inject
    Logger logger;

    private Set<Human> humans = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>())); // liste humans


    public HumanService() {
        humans.add(new Human("toto", "male", "human", 18));
        humans.add(new Human("tata", "female", "martien", 300));
        humans.add(new Human("titi", "male", "hobbit", 400));
    }

    public boolean deleteWrongHuman(Human human) {
        String race = human.getRace();
        int years = human.getYears();

        if (race == "humans" && years <= 18 || race != "humans" && years >= 256) {
            return true;
        } else {
            return false;
        }
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