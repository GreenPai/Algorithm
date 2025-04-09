package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
* 백준: 10807/개수 세기
* */
public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int find = Integer.parseInt(br.readLine());

        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }

        for(int i=0; i<list.size();i++){
            if(list.get(i)==find){
                count++;
            }
        }

        System.out.println(count);
    }
}
