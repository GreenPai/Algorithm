package Loop_3;

import java.io.*;

/*
* 백준 : 2739번 : 구구단
* */
public class P2739 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /*
        * System.out.println : 메모리 16280KB, 시간 128ms
        * */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<= 9; i++){
            bw.write(n + " * " + i + " = " + (n*i) + "\n");
            //System.out.println( n + " * " + i + " = " + (n*i));
        }

        bw.flush();
        bw.close();
    }
}
