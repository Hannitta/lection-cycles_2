package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shouldCalculateSum() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sumCalculate(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMaxSalesMonth() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = service.findMaxSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindBelowAverageSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findBelowAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAboveAverageSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findAboveAverageSales(sales);

        assertEquals(expected, actual);
    }
}