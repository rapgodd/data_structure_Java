package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FriendNetwork1 {
    static int[] level;//노드의 층의 개수이다.
    static int[] parent;//노드 배열 안에 들어 있는것은 부모이다

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= T; t++) {
            int F = Integer.parseInt(br.readLine());

            parent = new int[F * 2];
            level = new int[F * 2];

            for (int i = 0; i < F*2; i++) {
                parent[i] = i;
                level[i] = 1;
            }

            int index = 0;//그냥 인덱스 역할로 맵 value에 집어 넣는것
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < F; i++) {
                st = new StringTokenizer(br.readLine());
                String s1 = st.nextToken();
                String s2 = st.nextToken();

                if (!map.containsKey(s1)) {
                    map.put(s1, index++);
                }
                if (!map.containsKey(s2)) {
                    map.put(s2, index++);
                }

                sb.append(union(map.get(s1), map.get(s2)) + "\n");
            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int find(int x) {
        if(x == parent[x]){
            return x;
        }else {
           parent[x] = find(parent[x]);
           return parent[x];
        }
    }
    public static int union(int a, int b) {//a와 b는 맵의 값이다.
        int i = find(a);
        int j = find(b);

        if (i > j) {
            parent[i] = j;
            level[i] += level[j];
            return level[j];
        } else if (i < j) {
            parent[j] = i;
            level[j] += level[i];
            return level[i];
        }
        return level[i];
    }
}
