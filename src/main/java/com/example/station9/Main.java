package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // Aクーポンを使用→合計金額のまま（sumA）
        int sumA = 0;
        for (int price : itemPrices) {
            sumA += price;
        }

        // Bクーポンを使用した場合→5000円以上で10%引き
        double sumB = sumA;
        if (sumA >= 5000) {
            sumB *= 0.9;
        }

        // Cクーポンを使用した場合→2000円以上の場合、20%引き
        double sumC = 0;
        for (int price : itemPrices) {
            if (price >= 2000) {
                sumC += price * 0.8;
            } else {
                sumC += price;
            }
        }
        
        // 最も金額が低いものを選ぶ
        double minSum = Math.min(sumA, Math.min(sumB, sumC));
        
        // 最も金額が低いクーポンを決定する
        String coupon = "";
        if (minSum == sumA) {
            coupon = "A";
        } else if (minSum == sumB) {
            coupon = "B";
        } else if (minSum == sumC) {
            coupon = "C";
        }

        System.out.println(coupon);
    }
}
