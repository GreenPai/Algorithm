package Conditional_statement_2;

import java.util.Scanner;

/*
* 백준 2753 : 윤년
* */
public class P2753{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        * 메모리 17756, 시간 176ms
        * */

        /*
        int year = sc.nextInt();
        int n = 0;

        if(year%4 == 0){
            n = 1;
        }

        if(year %100 == 0){
            n = 0;
        }

        if(year % 400 == 0){
            n = 1;
        }

        System.out.println(n);
         */

        int year =  sc.nextInt();
        int n1 = 0;
        if(year % 4 ==0){
            n1 = 1;
            if(year%100==0 && year%400!=0) {
                n1 = 0;
            }
        }

        System.out.println(n1);
    }
}
