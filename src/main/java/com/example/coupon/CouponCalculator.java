package com.example.coupon;

public class CouponCalculator {
  public String findBestCoupon(int[] cartItems) {
     // 各クラスのインスタンスを作成
     CouponA couponA = new CouponA();
     CouponB couponB = new CouponB();
     CouponC couponC = new CouponC();

      // 各クラスの calculate メソッドを呼び出し結果を取得
      float totalA = couponA.calculate(cartItems);
      float totalB = couponB.calculate(cartItems);
      float totalC = couponC.calculate(cartItems);

      // 最小値を求める
      float minTotal;
      if (totalA <= totalB && totalA <= totalC) {
          minTotal = totalA;
      } else if (totalB <= totalA && totalB <= totalC) {
          minTotal = totalB;
      } else {
          minTotal = totalC;
      }

      // 最も金額が低いクーポンを決定する
      String coupon = "";
      if (minTotal == totalA) {
          coupon = "A";
      } else if (minTotal == totalB) {
          coupon = "B";
      } else if (minTotal == totalC) {
          coupon = "C";
      }
      return coupon;
  }
}
