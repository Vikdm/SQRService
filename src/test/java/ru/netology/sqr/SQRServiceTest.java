package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/SQRServiceTest.csv")

    public void test(int lim1, int lim2) {

        SQRService service = new SQRService();
        int x = service.Calculate(lim1, lim2);
        System.out.println("Tаких чисел = " + x);
    }
}
