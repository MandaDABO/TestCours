package testcours;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GavTest {

    @Test
    void shouldParseAnotherCoordinate() {
        Gav gav = new Gav("org.other:lib-c:3.0.0");

        assertEquals("org.other", gav.group());
        assertEquals("lib-c", gav.artifact());
        assertEquals("3.0.0", gav.version());
    }
}
