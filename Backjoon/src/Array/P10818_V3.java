package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준: 10818 / 최소, 최대
 * 메모리 : 88156KB
 * 시간  : 476ms
 * */
public class P10818_V3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 이 부분 추가됨

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (val < min) min = val;
            if (val > max) max = val;
        }
        System.out.println(min + " " + max);
    }
}
