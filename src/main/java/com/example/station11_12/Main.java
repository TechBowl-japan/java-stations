package com.example.station11_12;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Main().test();
    }

    private void test() {
        // テストする場合、以下の「//」を消してください。
        //Item item = new Item("商品A", 1000, "食品", new String[]{"お菓子", "要冷蔵"});
        //System.out.println("商品名: " + item.name);
        //System.out.println("価格" + item.price);
        //System.out.println("カテゴリ:" + item.category);
        //System.out.println("タグ: " + Arrays.toString(item.tags));
    }

    // ここから
    class Item {
        String name;
        int price;
        String category;
        String[] tags;

        Item (String name, int price, String category,  String[] tags) {
            this.name = name;
            this.price = price;
            this.category = category;
            this.tags = tags;
        }
        float getPriceWithTax (boolean isKeigenzeiritu) {
            if(isKeigenzeiritu == true) {
                return price * 1.08f;
            } else {
                return price * 1.1f;
            }
        }
    }
    // ここまで
}
