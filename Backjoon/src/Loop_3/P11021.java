package Loop_3;

import java.io.*;
import java.util.StringTokenizer;

/*
* 백준 11021번 / A + B - 7
* */
public class P11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + (num1 + num2) + "\n");
        }

        bw.flush();
        bw.close();

    }
}
