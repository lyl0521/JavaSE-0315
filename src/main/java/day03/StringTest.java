package day03;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {

        // 字符串String
        // 具有判断功能的方法
        // equals 判断两个字符串是否具有相同的字符序列
        String str = "abcdef";

        boolean result1 = str.equals("abcdef");
        boolean result2 = str.equals("ABCdef");

        System.out.println("(equals) : result1 = " + result1 + ", result2 = " + result2);

// equalsIgnoreCase 与equals相同，但忽略大小写
        result1 = str.equalsIgnoreCase("abcdef");
        result2 = str.equalsIgnoreCase("ABCdef");

        System.out.println("(equalsIgnoreCase) : result1 = " + result1
                + ", result2 = " + result2);

// 判断是否包含指定的字符串
        result1 = str.contains("a");
        result2 = str.contains("x");
        System.out.println("(contains) : result1 = " + result1 + ", result2 = "
                + result2);

// startsWith 判断是否以指定字符串开始
        result1 = str.startsWith("abc");
        result2 = str.startsWith("def");
        System.out.println("(startsWith) : result1 = " + result1
                + ", result2 = " + result2);

// endsWith 判断是否以指定字符串结束
        result1 = str.endsWith("abc");
        result2 = str.endsWith("def");
        System.out.println("(endsWith) : result1 = " + result1 + ", result2 = "
                + result2);

// isEmpty 判断字符串是否为空
        result1 = str.isEmpty();
        result2 = "".isEmpty();
        System.out.println("(isEmpty) : result1 = " + result1 + ", result2 = "
                + result2);

        // compareTo 根据字典顺序，判断两个字符串每个字符的Unicode值
// 按照字典顺序，比指定字符串大，返回正数，小则返回负数，相等返回0
        int num1 = str.compareTo("abcdef");
        int num2 = str.compareTo("abcdee");
        int num3 = str.compareTo("abcdeg");
        System.out.println("(compareTo) : num1 = " + num1 + ", num2 = " + num2
                + ", num3 = " + num3);

// compareToIgnoreCase 忽略大小写，与compareTo相同
        num1 = str.compareToIgnoreCase("ABCdef");
        System.out.println("(compareToIgnoreCase) : num1 = " + num1);



       // 具有获取功能
       // length 获得字符串长度
        String str1 = "abcdef";

        System.out.println("(length) : " + str1.length());

// charAt 获得指定位置的字符
        System.out.println("(charAt) :　" + str1.charAt(2));

// indexOf 获得指定字符串第一次出现的位置，没有找到返回 -1
        System.out.println("(indexOf) : " + str1.indexOf("cd"));

// lastIndexOf 获得指定字符串最后一次出现的位置,没有找到返回 -1
        System.out.println("(lastIndexOf) : " + str1.lastIndexOf("de"));

// split 根据指定的正则表达式，切割字符串，返回字符串数组
        String[] ss = "abc|def|ghi".split("[|]");
        System.out.println("(split) : " + Arrays.toString(ss));

// substring 截取字符串
        System.out.println("(substring) : " + str1.substring(2)); // 从索引2的位置截取，截取到最后
        System.out.println("(substring) : " + str1.substring(2, 4));// 从索引2的位置截取，截取到索引4，不包括4（包头不包尾）



        //具有转换功能
        // getBytes 将字符串转换成字节数组
        String str2 = "abcdef";
        byte[] byteBuf = str2.getBytes();
        System.out.println("(getBytes) : " + Arrays.toString(byteBuf));

// toCharArray 将字符串转换成字符数组
        char[] charBuf = str2.toCharArray();
        System.out.println("(toCharArray) : " + Arrays.toString(charBuf));

// valueOf 将任意值/对象转换成字符串
        System.out.println("(valueOf) : " + String.valueOf(new char[] { 97, 98, 99 }));

// toUpperCase 将字符转换成大写形式
        System.out.println("(toUpperCase) : " + str2.toUpperCase());

// toLowerCase 将字符串转换成小写形式
        System.out.println("(toLowerCase) : " + "ABCdef".toLowerCase());

// concat 拼接两个字符串
        str2 = "aaa".concat("ccc");
        System.out.println("(concat) : " + str2);


        //具有替换功能
        // replace 把字符串中指定字符替换成新的字符串
        String str3 = " \t  abc abc abc   ";
        System.out.println("(replace) : " + str3.replace("a", "x"));

// trim 去除字符串两端的空白符
        System.out.println("(trim) : " + str3.trim());


        System.out.println("CharAt:"+("hello world").charAt(5));

    }
}