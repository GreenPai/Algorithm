package Loop_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 10952 / A + B - 5
* 메모리 : 14224KB
* 속도   : 112ms
* */
public class P10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if(n1 == 0 && n2 == 0){
                break;
            }

            System.out.println(n1 + n2);
        }
    }

}
