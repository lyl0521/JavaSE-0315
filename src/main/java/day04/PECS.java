package day04;

public class PECS<N extends Number> {
    private void test(N n1,N n2){
        System.out.println(n1);
        System.out.println(n2);

    }

    public static void main(String[] args) {
        PECS<Integer> p1 = new PECS();
        p1.test(1,2);

        PECS<Double> p2 = new PECS<>();
        p2.test(1.1,2.2);

//        PECS<String> p3 = new PECS<String>();
//        因为N expend Number 定义有界类型   继承于Number  所以只能使用Number下的封装类
    }
}
