package pl.erbel.memory.oom;

import org.apache.log4j.Logger;

import static java.lang.Runtime.getRuntime;

public class OOMGenerator {

    private static final Logger LOG =
            Logger.getLogger(OOMGenerator.class);

    //-XX:+PrintGCDetails
    public void generateOOM() throws Exception {
        int iteratorValue = 20;

        LOG.debug("Runing: " +
                OOMGenerator.class + " with processors: " +
                getRuntime().availableProcessors()
                + " MaxMemory: " + getRuntime().maxMemory()
                + " TotalMemory: " + getRuntime().totalMemory());

        for (int outerIterator = 1; outerIterator < 200; outerIterator++) {

            LOG.info("Iteration " + outerIterator + " Free Mem: " + getRuntime().freeMemory());

            int[] memoryFillIntVar = new int[iteratorValue];
            iteratorValue = iteratorValue * 2;

            LOG.info("\nRequired Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }

}
