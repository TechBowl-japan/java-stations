package com.example.coupon;

public class CouponC {
  public float calculate(int[] cartItems) {
    float totalC = 0;
        for (int price : cartItems) {
            if (price >= 2000) {
                totalC += price * 0.8f;
            } else {
                totalC += price;
            }
        }
        if(totalC < 5000) {
          totalC =totalC + 800;
        }
        return totalC;
  }
}
