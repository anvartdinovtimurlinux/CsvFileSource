package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void getAmountSquaresInRange(String test, int begin, int end, int expected) {
        SQRService service = new SQRService();
        int actual = service.getAmountSquaresInRange(begin, end);
        assertEquals(expected, actual);
    }
}