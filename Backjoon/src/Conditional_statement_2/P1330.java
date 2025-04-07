package Conditional_statement_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 : 1330번 / 두 수 비교하기
* if문보다 삼항 연산자가 미세하게 더 느리다.
* 메모리, 속도 측면에서 큰 차이는 없다.
* */
public class P1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        /*
        * if문 메모리 : 14308 / 시간 : 100ms
        * */

        /*
        if(n1 == n2){
            System.out.println("==");
        }else if( n1 > n2){
            System.out.println(">");
        }else{
            System.out.println("<");
        }
         */

        /*
        * 메모리 14160 / 속도 104ms
        * */
        System.out.println(n1 == n2 ? "==" : n1 > n2 ? ">" : "<");

    }
}
