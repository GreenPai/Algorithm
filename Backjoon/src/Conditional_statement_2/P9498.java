package Conditional_statement_2;

/*
* 백준 : 9498 / 시험 성적
* Switch, If : 메모리 미세하게 if문이 좋음, 속도 같음.
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
/*
        if(n1 >= 90){
            System.out.println("A");
        }else if(n1 >= 80){
            System.out.println("B");
        }else if(n1 >= 70){
            System.out.println("C");
        }else if(n1 >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
*/
        switch (n1 / 10) {
            case 10: // 100점
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
