package pl.erbel.memory.oom;

import org.apache.log4j.Logger;
import org.junit.Test;
import pl.erbel.concurrency.Account;

import static org.apache.log4j.Logger.getLogger;

public class OOMGeneratorTest {

    private static final Logger LOG = getLogger(OOMGeneratorTest.class);

    @Test
    public void doNothing() {
        LOG.error("wohoo");
    }

    @Test
    public void generateOOM() throws Exception {
        OOMGenerator oomGenerator = new OOMGenerator();
        oomGenerator.generateOOM();
    }

    @Test
    public void generateHeap() throws Exception {
        for (int i = 0; i < 1000000; i++) {
            ThreadLocal<Float> data = new ThreadLocal<Float>();
            data.set((float) i);
            Account account = new Account(data);
        }

    }
}