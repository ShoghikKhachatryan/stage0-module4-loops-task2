package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;
        while(i <= printToInclusive) {
            int j = 1;
            int count = 0;
            while (j <= i / 2) {
                if (i % j == 0) {
                    ++count;
                }
                ++j;
            }
            if (count == 1) {
                System.out.println(i);
            }
            ++i;
        }
    }
}
