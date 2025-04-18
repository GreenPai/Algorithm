package Loop_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 : 11022번 / A+B-8
* */
public class P11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<= n; i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + n1 + " + " + n2 + " = " + (n1+n2));
        }
    }
}
