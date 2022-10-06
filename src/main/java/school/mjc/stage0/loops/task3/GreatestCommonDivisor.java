package school.mjc.stage0.loops.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.println(second);
            return;
        } else if (second == 0) {
            System.out.println(first);
            return;
        }

        Integer[] firstFactors = factorize(first);
        Integer[] secondFactors = factorize(second);

        int gcd = 1;

        for (int i = 0; i < firstFactors.length; i++) {
            for (int j = 0; j < secondFactors.length; j++) {
                if(Objects.equals(firstFactors[i], secondFactors[j])) {
                    gcd *= secondFactors[j];
                    secondFactors[j] = 0; //to not compare this factor during the next i loop
                    break;
                }
            }
        }

        System.out.println(gcd);
    }

    private Integer[] factorize(int number) {
        if(number < 2)
            return new Integer[]{1};

        List<Integer> factors = new ArrayList<Integer>();

        while(number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }

        for (int i = 3; i <= number; i += 2) {
            while(number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        return factors.toArray(new Integer[0]);
    }
}
