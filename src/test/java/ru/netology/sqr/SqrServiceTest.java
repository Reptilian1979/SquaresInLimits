package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/main/resources/squares.csv")
    public void testSquaresLimits(long lowerLimit, long upperLimit, long expected, boolean b) {
        SqrService Service = new SqrService();
        long actual = Service.searchSquaresInLimits(lowerLimit, upperLimit);
        Assertions.assertEquals(expected, actual);
    }
}
