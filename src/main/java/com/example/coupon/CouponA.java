package com.example.coupon;

public class CouponA {
  public float calculate(int[] cartItems) {
    int totalA = 0;
    for (int price : cartItems) {
      totalA += price;
  }
  return totalA;
  }
}
