package testcours;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class InMemoryStorageTest {

    private IStorage storage;

    @BeforeEach
    void init() {
        storage = new InMemoryStorage();
    }

    @Test
    void shouldStoreAndRetrieveArtifact() {
        Gav gav = new Gav("org.acme:lib-a:1.0.0");
        Artifact artifact = mock(Artifact.class);

        storage.put(gav, artifact);

        assertEquals(Optional.of(artifact), storage.get(gav));
    }

    @Test
    void shouldReturnEmptyWhenArtifactDoesNotExist() {
        Gav gav = new Gav("org.acme:unknown:1.0.0");

        assertEquals(Optional.empty(), storage.get(gav));
    }
}