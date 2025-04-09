package Loop_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 백준 : 25314번 / 코딩은 체육과목 입니다.
* 메모리 : 17616KB -> 14084KB
* 속도   : 176ms   -> 100ms
* */

public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder st = new StringBuilder();
        st.append("long ".repeat(n/4)).append("int");
        System.out.println(st.toString());
    }
}
