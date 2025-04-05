package Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AB_1000 {
    public static void main(String[] args) throws IOException {

        // BufferedReader
        /*
        * BufferedReader : 메모리 14228 - 시간 108ms
        * Scanner : 메모리 17708 - 시간 188ms
        * */


        /*
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            System.out.println(n1 + n2);
        */

        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n + m);
    }
}
