package pl.erbel.memory.oom;

import static java.lang.Runtime.getRuntime;

public class OOMGenerator {

    //-XX:+PrintGCDetails
    public void generateOOM() throws Exception {
        int iteratorValue = 20;
        System.out.println("Runing: " +
                OOMGenerator.class + " with processors: " +
                getRuntime().availableProcessors()
                + " MaxMemory: " + getRuntime().maxMemory()
                + " TotalMemory: " + getRuntime().totalMemory());
        for (int outerIterator = 1; outerIterator < 200; outerIterator++) {
            System.out.println("Iteration " + outerIterator + " Free Mem: " + getRuntime().freeMemory());
            int[] memoryFillIntVar = new int[iteratorValue];
            // feel memoryFillIntVar array in loop...
            iteratorValue = iteratorValue * 2;
            System.out.println("\nRequired Memory for next loop: " + iteratorValue);
            Thread.sleep(1000);
        }
    }

}
