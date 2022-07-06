package fr.ship.world.service;

import fr.ship.world.pojo.Human;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class HumanServiceTest {


    @Inject
    HumanService humanService;

    @Test
    public void should_delete_human_under_majority() {
        //si race = humans et que l’age est inferieur a 18 ans il est supprimé(false)
        Human human = new Human();
        human.setYears(18);
        human.setRace("human");

        boolean isDeleted = humanService.deleteWrongHuman(human);
        assertEquals(false, isDeleted);
    }

    @Test
    public void should_delete_human_top_majority() {
        //si race = humans et que l’age est inferieur a 18 ans il est supprimé(false)
        Human human = new Human();
        human.setYears(17);
        human.setRace("human");

        boolean isDeleted = humanService.deleteWrongHuman(human);
        assertEquals(true, isDeleted);
    }

    @Test
    public void should_delete_other_race_under_very_old_age() {
        Human human = new Human();
        human.setYears(257);
        human.setRace("alien");

        boolean isDeleted = humanService.deleteWrongHuman(human);
        assertEquals(false, isDeleted);
    }
    @Test
    public void should_delete_other_race_top_very_old_age() {
        Human human = new Human();
        human.setYears(254);
        human.setRace("alien");

        boolean isDeleted = humanService.deleteWrongHuman(human);
        assertEquals(true, isDeleted);
    }
}