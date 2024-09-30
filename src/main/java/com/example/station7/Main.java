package com.example.station7;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices = { 1200, 2300, 3500, 2500, 1000, 2980, 9800, 4600, 5000, 2000 };
        // ここから
        int sum = 0;
        for (int i =0; i < itemPrices.length; i = i + 1) {
            sum += itemPrices[i];
        }
        System.out.println(sum);
        // ここまで
    }
}
