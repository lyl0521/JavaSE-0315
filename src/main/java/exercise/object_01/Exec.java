package exercise.object_01;

import java.util.Scanner;

public class Exec {

//        定义一个判断闰年的方法，在 main 方法中调用该方法判断输入的一个年份是否是闰年

    public Exec(){

    }

    public void check(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + "年是闰年");
            }
            else {
            System.out.println(year + "年不是闰年");
        }
    }}}






