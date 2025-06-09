package com.giyeon.data_structure.backjoon;

import java.io.*;
import java.util.*;

public class BJ9655 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N % 2 != 0) {
            bw.write("SK");
            bw.flush();
            bw.close();
            br.close();
        }else{
            bw.write("CY");
            bw.flush();
            bw.close();
            br.close();
        }
    }

}
