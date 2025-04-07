package Input_output_1;

import java.io.*;

/*
* 백준 10926번 : ??!
* */
public class P10926 {

    public static void main(String[] args) throws IOException {
        /*
        * Scanner
        * 메모리 : 17768 / 속도 172ms
        * */

        /*
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str + "??!");
        */

        /*
        * Buffer
        * 메모리 : 14248 / 속도 108ms
        * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.readLine() + "??!");

        /*
        * 메모리 14280 / 속도 108ms
        * */

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(br.readLine() + "??!");
        bw.flush();


    }
}
