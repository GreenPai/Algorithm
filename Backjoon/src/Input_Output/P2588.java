package Input_Output;

import java.util.Scanner;

/*
* 2588 : 곱셈
* */
public class P2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        int b = sc.nextInt();
        int d1 = b%10;
        int d2 = (b/10)%10;
        int d3 = b/100;

        System.out.println(a*d1);
        System.out.println(a*d2);
        System.out.println(a*d3);
        System.out.println(a*b);


    }
}
