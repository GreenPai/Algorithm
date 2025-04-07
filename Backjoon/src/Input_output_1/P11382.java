package Input_output_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 : 11382 / 꼬마 정민
* */
public class P11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum = 0;
        while(st.hasMoreTokens()){
            sum += Long.parseLong(st.nextToken());
        }

        System.out.println(sum);
    }
}
