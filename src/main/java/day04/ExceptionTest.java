package day04;

public class ExceptionTest {
    public static void main(String[] args) {
//        System.out.println(1/0);    ArithmeticException  数学异常
//        System.out.println("hello".charAt(5));  StringIndexOutOfBoundsException   字符串下标越界异常
//        System.out.println(new int[]{1,2,3}[3]);   ArrayIndexOutOfBoundsException    数组下标越界异常
//        System.out.println(Integer.parseInt("l23"));   NumberFormatException   数字格式异常

        String s = "hello";
        s = null ;
        try {
//            System.exit(0);
            System.out.println(s.length());
            System.out.println("in try block...");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("NEP...");
        }finally {
            System.out.println("test");
        }
        System.out.println("done.");
    }
}
