package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 백준 10813/공 바꾸기
* 메모리 : 15920KB
* 속도 : 120ms
* */
public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i = 1; i <= N; i++){
            arr[i-1] = i;
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int temp = arr[x-1];
            arr[x-1] = arr[y-1];
            arr[y-1] = temp;
        }

        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
