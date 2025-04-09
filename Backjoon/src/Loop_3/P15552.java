package Loop_3;

import java.io.*;
import java.util.StringTokenizer;

/*
* 백준 : 15552번 / 빠른 A + B
*
* */
public class P15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            bw.write(n1+n2 +"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
