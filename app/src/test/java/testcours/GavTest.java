package testcours;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
