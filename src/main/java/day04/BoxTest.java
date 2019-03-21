package day04;

public class BoxTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

//        long sum = 0L;      比较封装类和基本类型运算速度
        Long sum = 0L;           //  速度比基本类型慢
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println(System.currentTimeMillis() - start);
    }
}