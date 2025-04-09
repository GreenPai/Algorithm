package Loop_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/*
* 백준 : 2438번 / 별 찍기
* */
public class P2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<= n; i++){
            System.out.println("*".repeat(i));
        }
    }
}
