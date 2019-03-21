package day03;

public class StringBufferTest {
    //字符缓冲区
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

//        常用方法
// 获得 StringBuffer 缓冲区的初始长度
        System.out.println("(capacity) : " + sb.capacity());

// append 追加字符串
        sb.append("abc");
        System.out.println("(append) : " + sb);

// length 获得缓冲区的实际长度
        System.out.println("(length) : " + sb.length());

// insert 插入数据到缓冲区指定的位置
        sb.insert(1, "xx");
        System.out.println("(insert) : " + sb);

// setCharAt 替换指定字符
        sb.setCharAt(2,'y');
        System.out.println("(setCharAt):" + sb);

// deleteCharAt 删除指定位置的字符
        sb.deleteCharAt(2);
        System.out.println("(deleteCharAt) : " + sb);

// delete 删除指定范围的字符
        sb.delete(2, sb.length());
        System.out.println("(delete) : " + sb);

// replace 替换缓冲区指定范围的字符串
        sb.replace(1, 2, "b");
        System.out.println("(replace) : " + sb);

// reverse 反转缓冲区内的字符串
        sb.reverse();
        System.out.println("(reverse) : " + sb);

// substring 截取字符串，不会操作原缓冲区，返回一个新的字符串
        String str = sb.substring(1, 2);
        System.out.println("(substring) : sb = " + sb + ", str = " + str);



    }
}
