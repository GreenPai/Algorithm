package Input_Output;

import java.util.Scanner;

/*
* 10430 : 나머지
* */
public class P10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println( (A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println( (A*B)%C);
        System.out.println(  ((A%C) * (B%C))%C);

    }
}
