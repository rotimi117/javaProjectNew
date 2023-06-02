import dairyApp.Dairy;
import dairyApp.Gist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    Dairy olofofo;
    @BeforeEach
    public void beforeEach(){
    olofofo = new Dairy("username", "password");
    }


    @Test
    public void dairyCanBeCreatedTest(){
        assertNotNull(olofofo);
    }

    @Test
    public void newDairyIsLockedByDefaultTest(){
        assertTrue(olofofo.isLocked());
    }
    @Test
    public void LockedDairyCanBeUnlockedTest(){
        assertTrue(olofofo.isLocked());
        olofofo.unlockWith("password");
        assertFalse(olofofo.isLocked());
    }
    @Test
    public void LockedDairyCannotBeUnlockedWithWrongPasswordTest(){
        assertTrue(olofofo.isLocked());
        olofofo.unlockWith("wrong password");
        assertTrue(olofofo.isLocked());
    }
    @Test public void unlockedDiaryCanBeLockedTest(){
        olofofo.unlockWith("password");
        assertFalse(olofofo.isLocked());
        olofofo.lock();
        assertTrue(olofofo.isLocked());
    }
    @Test public void unlockedDiaryCanCreateGistTest(){
        olofofo.unlockWith("password");
        assertFalse(olofofo.isLocked());
       olofofo.addGist("Title", "Body");
       assertEquals(1, olofofo.countGist());
    }
    @Test public void createdGist_findGistByTitleReturnCreatedGistTest(){
        olofofo.unlockWith("password");
        assertFalse(olofofo.isLocked());
        olofofo.addGist("Title", "Body");
        Gist gist = olofofo.findGistByTitle("Title");
        assertEquals("Body", gist.getBody());
    }
}
