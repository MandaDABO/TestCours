package testcours;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class GavTest {

    
    @ParameterizedTest
    @CsvFileSource(resources = "/gav.csv")
    void shouldParseCoordinate(String coordinate, String expectedGroup,
                            String expectedArtifact, String expectedVersion) {

        Gav gav = new Gav(coordinate);

        assertEquals(expectedGroup, gav.group());
        assertEquals(expectedArtifact, gav.artifact());
        assertEquals(expectedVersion, gav.version());
    }




    @Test
    void shouldRejectCoordinateWithLessThanThreeComponents() {
        assertThrows(Exception.class, () -> Gav.parse("org.acme:lib-a"));
    }

    @Test
    void shouldRejectCoordinateWithMoreThanThreeComponents() {
        assertThrows(Exception.class, () -> Gav.parse("org.acme:lib-a:1.0.0:extra"));
    }

    @Test
    void shouldRejectCoordinateWithEmptyComponent() {
        assertThrows(Exception.class, () -> Gav.parse("org.acme::1.0.0"));
    }

    @Test
    void shouldRejectEmptyCoordinate() {
        assertThrows(Exception.class, () -> Gav.parse(""));
    }
}
