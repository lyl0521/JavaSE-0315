package day05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("writer.txt");) {
//            Writer writer = new FileWriter("writer.txt");
//            写在try后的括号中  自动运行  write.flush() 和 write.close()
//            运行write。close() 之前默认运行 write.flush() 把内容从内存输入到文件
            writer.write("Hello , Java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
