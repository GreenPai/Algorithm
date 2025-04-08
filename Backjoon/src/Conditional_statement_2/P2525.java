package Conditional_statement_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 2525번 : 오븐 시계
* 이전 코드 : 메모리 18372KB , 속도 184ms
* 현재 코드 : 메모리 16028KB , 속도 128ms
* */
public class P2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m =  Integer.parseInt(st.nextToken());

        m += Integer.parseInt(br.readLine());

        if(m>=60){

            h+= (m/60);
            m-= 60 * (m/60);

            if(h>=24){
                h = h-24;
            }
        }

        System.out.println(h + " " + m);

    }
}
