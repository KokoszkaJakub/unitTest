import org.junit.Test;

import static org.junit.Assert.*;

public class RocketTest {


    @Test
    public void getName() {
        Rocket apollo = new Rocket("Apollo13");
        assertEquals("Apollo", apollo.getName());

    }


}