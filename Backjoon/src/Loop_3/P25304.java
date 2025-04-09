package Loop_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 : 25304 / 영수증
* 메모리: 17924 -> 14316KB
* 속도 :  180ms -> 100ms
* */
public class P25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st;
        for(int i=0;i<n;i++){
           st = new StringTokenizer(br.readLine());
           int num = Integer.parseInt(st.nextToken());
           int price = Integer.parseInt(st.nextToken());
           sum += num*price;
        }

        System.out.println( sum == total ? "Yes" : "No");

    }
}
