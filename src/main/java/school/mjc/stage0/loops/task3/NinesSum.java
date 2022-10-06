package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = lengthOfLastNumber <= 0 ? 0 : 9;

        for (int i = 1; i < lengthOfLastNumber; i++) {
            int number = 9;

            for (int j = 1; j <= i; j++) {
                number *= 10;
                number += 9;
            }

            result += number;
        }

        System.out.println(result);
    }
}
