package school.mjc.stage0.loops.task3;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int lastFib = 0;
        int currentFib = 1;
        for (int i = 1; i <= lastFibonacci; i++) {
            if(i == 1) {
                System.out.println(0);
                continue;
            } else if (i == 2) {
                System.out.println(1);
                continue;
            }

            System.out.println(lastFib + currentFib);
            currentFib = currentFib + lastFib;
            lastFib = currentFib - lastFib;
        }
    }
}
