package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if(t < 0) {
            t = -t;
        }

        String stringNumbers = String.valueOf(t);

        int result = 0;

        for (int i = 0; i < stringNumbers.length(); i++) {
            result +=  Character. getNumericValue(stringNumbers.charAt(i));
        }

        System.out.println(result);
    }
}
