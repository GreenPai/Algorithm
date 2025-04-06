package Input_Output;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

/*
* 백준 18108번 : 1998년생인 내가 태국에서는 2541년생?
* */
public class P18108 {


    public static void main(String[] args) throws IOException {

        /*
         * Scanner : 메모리 17744/ 속도 180ms
         * */

        /*
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(year - 543);
         */

        /*
        * 메모리 14368 / 사건 108mx
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(n-543));
        bw.flush();
        bw.close();

    }

}
