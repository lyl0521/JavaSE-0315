package day04;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CheckTest {
    public static void main(String[] args) {
        try {
            file();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("");
        }
    }

    private static void file() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input filepath");
        String filepath = scanner.nextLine();
        RandomAccessFile randomAccessFile = new RandomAccessFile(filepath,"rw");
    }
}
