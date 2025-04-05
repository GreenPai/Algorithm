package Input_Output;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
* 백준 10869 사칙연산
* */
public class P10869 {

    public static void main(String[] args) throws IOException {

        /*
        * Scanner 메모리 17708 / 속도 172mx
        * */

        /*
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(n1+n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);
         */

        /*
        * Buffer 메모리 15920 / 속도 120ms
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        bw.write(n1+n2+"\n");
        bw.write(n1-n2+"\n");
        bw.write(n1*n2+"\n");
        bw.write(n1/n2+"\n");
        bw.write(n1%n2+"\n");

        bw.flush();
        bw.close();

    }

}
