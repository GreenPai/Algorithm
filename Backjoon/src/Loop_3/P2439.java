package Loop_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 백준: 2439 / 별 찍기2
* 메모리: 14552KB / 속도: 108ms
* */
public class P2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(br.readLine());
        for(int i=n; i>=1; i--){
            System.out.println(" ".repeat(i-1) + "*".repeat(n-i+1));
        }
    }
}
