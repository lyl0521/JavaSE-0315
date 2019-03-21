package day05;


import java.io.*;

public class InputStreamTest {
    /**
     *   输入流
     *   Read -> FileReader -> method
     *   单字节输出 -> 原字符输出
     */
        private static final String filename = "src/main/java/day05/InputStreamTest.java";

    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream(filename);
//            FileReader fileread = new FileReader(filename);
            int i = inputStream.read();
//            int i = fileread.read();
            while (i != -1){
                System.out.print((char) i);
//                i = fileread.read();
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
