package testcours;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BufferedLineReaderTest {

    @Test
    void shouldReadLinesFromStringReader() throws Exception {
        StringReader reader = new StringReader("premiere ligne\ndeuxieme ligne");

        ILineReader lineReader = new BufferedLineReader(reader);

        assertEquals("premiere ligne", lineReader.readLine());
        assertEquals("deuxieme ligne", lineReader.readLine());
        assertEquals(null, lineReader.readLine());
    }
}