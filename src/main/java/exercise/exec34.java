package exercise;

import java.util.Hashtable;
import java.util.Random;

import static java.lang.Math.random;

public class exec34 {
//    随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），
//    并判断两种方法的效率和分布。
    public static void main(String[] args) {

//        直接调用 Random 方法


//        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
//        Random random = new Random();
//        int x = 0;
//        int a = 0;
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            x = (int) (2 * random() * 10 + 1);
//            hashtable.put(i, x);
////            System.out.println(hashtable.get(i));
//        }
//        System.out.println("total time: " + (System.currentTimeMillis() - start) + "ms.");
//        for (int j = 1; j <= 20 ; j++) {
//            for (int i = 0; i < hashtable.size(); i++) {
//                if (j == hashtable.get(i))
//                    a++;
//            }
//            System.out.println("数字" + j + "有" + a + "个");
//            a = 0;
//        }
//
//          }


//        Math.random()   方法

        Hashtable<Integer, Integer> hashtable1 = new Hashtable<>();
        int y = 0;
        int a = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            y = (int) (Math.random() * 2 * 10 + 1);
            hashtable1.put(i, y);
        }
        System.out.println("total time: " + (System.currentTimeMillis() - start) + "ms.");
        for (int j = 1; j <= 20 ; j++) {
            for (int i = 0; i < hashtable1.size(); i++) {
                if (j == hashtable1.get(i))
                    a++;
            }
            System.out.println("数字" + j + "有" + a + "个");
            a = 0;
        }
        }
}


