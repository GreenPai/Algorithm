package Conditional_statement_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 2480 : 주사위 세개
*
* */
public class P2480 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());

        int sum = 0;

        if(n1 == n2 && n2 == n3){
            sum = 10000 + n1*1000;
        }else if(n1 == n2 || n2 == n3 || n3 == n1){

            if(n2 == n3){
                sum = 1000 + n2*100;
            }else{
                sum = 1000 + n1*100;
            }
        }else{
            int max = 0;
            max = Math.max(n1 , Math.max(n2, n3));
            sum = 100* max;
        }

        System.out.println(sum);


    }
}
