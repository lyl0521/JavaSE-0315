package exercise.object_01;

import exercise.object_01.Exec;

import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查询年份");
        int year = scanner.nextInt();
        Exec exec = new Exec();
        exec.check(year);
    }


    }

