package ru.netology.sqr;

public class SqrService {

    public long searchSquaresInLimits(long lowerLimit, long upperLimit) {
        long square;
        boolean b = lowerLimit < upperLimit;
        int n = 0;
        for (int i = 10; i < 100; i++) {
            square = i * i;
            if (square < lowerLimit) continue;
            if (square <= upperLimit) {
                n = n + 1;
            }
            if (square > upperLimit) break;
        }
        return n;
    }
}
