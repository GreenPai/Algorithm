package Conditional_statement_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P2753_GPT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
        // 윤년 조건: 4의 배수이면서 100의 배수가 아니거나 400의 배수인 경우
        int isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0;

        System.out.println(isLeap);
    }
}
