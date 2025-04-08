package Conditional_statement_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 2884 : 알람시계
* 이전 코드 : 메모리 18540KB / 시간 192ms
* 현재 코드 : 메모리 16188KB / 시간 124mss
* * */
public class P2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m - 45 >= 0 ){
            m -= 45;
        }else{
            m += 15;
            h -= 1;
        }

        System.out.println( h>=0 ? h + " " + m : 23 + " " + m  );
    }
}
