package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 백준: 2562 / 최대값
* 메모리: 14284KB
* 시간 : 104ms
* */
public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 1;
        int index = -1;

        for(int i=0; i<9; i++){
            int n = Integer.parseInt(br.readLine());

            if(n > max){
                max = n;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);

    }
}
