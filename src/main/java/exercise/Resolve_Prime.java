package exercise;

import java.util.Scanner;

public class Resolve_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要分解的数字：");
        int i = scanner.nextInt();
        for (int j = 2; j <= i / 2 ; j++) {
            if(i % j == 0){
                System.out.print(j + "*");
                i = i / j;

            }
        }
        System.out.println(i);
        }
    }

