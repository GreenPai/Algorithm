package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 : 10871/X보다 작은 수
* 메모리: 17356KB
* 속도  : 168ms
* */
public class P10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int max =  Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){

            int num = Integer.parseInt(st.nextToken());
            if(num < max){
                sb.append(num + " ");
            }
        }

        System.out.println(sb.toString());
    }
}
