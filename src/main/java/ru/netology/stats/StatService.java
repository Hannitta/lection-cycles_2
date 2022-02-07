package ru.netology.stats;

public class StatService {

    public int sumCalculate(int[] sales) {
        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = 0;

        for(int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverageSum(int[] sales) {
        return sumCalculate(sales) / sales.length;
    }

    public int findMaxSalesMonth(int[] sales) {

        int currentMonth = 0;
        int maxMonth = 0;

        for(int i = 0; i < sales.length; i++) {
            if(currentMonth < sales[i]) {
                currentMonth = sales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    public int findMinSalesMonth(int[] sales) {

        int currentMonth = sales[0];
        int minMonth = 0;

        for(int i = 0; i < sales.length; i++) {
            if(currentMonth > sales[i]) {
                currentMonth = sales[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }

    public int findBelowAverageSales(int[] sales) {

        int monthCount = 0;

        for(int i = 0; i < sales.length; i++) {
            if(sales[i] < calculateAverageSum(sales)) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int findAboveAverageSales(int[] sales) {

        int monthCount = 0;

        for(int i = 0; i < sales.length; i++) {
            if(sales[i] > calculateAverageSum(sales)) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }
}
