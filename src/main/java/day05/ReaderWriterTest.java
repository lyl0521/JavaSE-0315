package day05;

import java.io.*;

public class ReaderWriterTest {
    public static void main(String[] args) {
        try (
                Reader reader = new FileReader("README.md");
                Writer writer = new FileWriter("writer.md");
        ) {
            int i = reader.read();
            while (i != -1) {
                writer.write(i);
                i = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
