package com.example.station8;

public class Main {
    public static void question1(int subtotal) {
        // Station 8 問題(1)
        // ここから
        // ここまで
    }

    public static void question2(int categoryId) {
        // Station 8 問題(2)
        // ここから
        // ここまで
    }

    public static void main(String[] args) {
        System.out.println("問題(1)");
        System.out.println("合計: 8000円の時");
        question1(8000);
        System.out.println("合計: 12000円の時");
        question1(12000);

        System.out.println("問題(2)");
        System.out.println("カテゴリID: 1の時");
        question2(1);
        System.out.println("カテゴリID: 2の時");
        question2(2);
        System.out.println("カテゴリID: 3の時");
        question2(3);
        System.out.println("カテゴリID: 99の時");
        question2(99);
        System.out.println("カテゴリID: 100の時");
        question2(100);
    }
}
