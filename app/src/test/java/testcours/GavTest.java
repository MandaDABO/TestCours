package testcours;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GavTest {

    @Test
    void shouldParseGroup() {
        Gav gav = new Gav("org.acme:lib-a:1.0.0");

        assertEquals("org.acme", gav.group());
    }
}
