package Conditional_statement_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* 백준 14681 : 사분면 고르기
* */
public class P14681 {
    public static void main(String[] args) throws IOException {

        /*
        * Scanner : 메모리 17700 / 시간 176ms
        * */
        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        */

        /*
        * Buffer : 메모리 14124 / 시간 104ms
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        System.out.println( n1 > 0 ? (n2 > 0 ? 1 : 4) : (n2 > 0 ? 2 : 3 ));
    }
}
