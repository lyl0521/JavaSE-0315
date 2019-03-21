package day04;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CheckedExceptionTest {
    public static void main(String[] args){
        try {
            m();
        }catch (FileNotFoundException e){
//            e.printStackTrace();
            System.out.println("文件不存在或权限不足");
        }
    }
//   防止用户输入错误路径的检测
    private static void m() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("in put filepath ");  //输入文件正确也有权限不够的情况出现异常
        String filepath = scanner.nextLine();
        RandomAccessFile randomAccessFile = new RandomAccessFile(filepath,"rw");


    }
}
