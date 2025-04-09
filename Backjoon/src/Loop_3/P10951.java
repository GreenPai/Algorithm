package Loop_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준: 10951/A+B-4
* 메모리: 14184KB
* 속도  : 104ms
* */
public class P10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        StringTokenizer st;
        String line;
        while((line=br.readLine()) != null){
            st = new StringTokenizer(line);
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            System.out.println(n1 + n2);
        }
    }
}
