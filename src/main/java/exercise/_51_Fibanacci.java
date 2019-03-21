package exercise;

public class _51_Fibanacci {

    public static void main(String[] args) {

        int i ;
        for (i = 1 ; i <= 50 ; i++)
            System.out.println(Fib(i));
    }
    public static long Fib(int i){
        if (i == 1 || i == 2){
            return 1;
        }
        else {
            return Fib( i - 1 ) + Fib( i - 2);
        }
    }
}
