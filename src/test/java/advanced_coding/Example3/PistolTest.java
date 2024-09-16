package advanced_coding.Example3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class PistolTest {

    private Pistol pistol;

    @BeforeEach
    void setUp(){
         pistol = new Pistol();
    }

    @Test
    void loadBullet_loadingTwoBulletsToThreeBulletMagazine() {

        for (int i = 0; i < 2; i++) {
            pistol.loadBullet();
        }
        assertEquals(2,pistol.getMagazineLoad().size());
    }

    @Test
    void loadBullet_loadingFourBulletsToThreeBulletMagazine() {

        for (int i = 0; i < 4; i++) {
            pistol.loadBullet();
        }
        Assertions.assertEquals(3,pistol.getMagazineLoad().size());
    }


//    @Test
//    void isLoaded() {
//    }
//
    @Test
    void shot_firingFromEmptyMagazineThrowsIllegalStateException() {

        assertThrows(IllegalStateException.class, () -> pistol.shot());

    }
//
//    @Test
//    void incrementDeterioration() {
//    }
}