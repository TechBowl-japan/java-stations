package com.example.coupon;

public class CouponB {
  public float calculate(int[] cartItems) {
    int totalA = 0;
    float totalB = 0;
    for (int price : cartItems) {
      totalA += price;
    }
    totalB = totalA * 0.9f;

    if(totalB < 5000) {
      totalB =totalB + 800;
    }

    return totalB;
  }
}
