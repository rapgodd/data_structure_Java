package com.giyeon.data_structure.backjoon;


import java.io.*;

//어떤 오류가 있는건지 모르겠음.
public class FindWord2 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String word = br.readLine();

        int count = 0;

        while(line.contains(word)){
            line = line.replaceFirst(word, "");
            count++;
        }

        String result = String.valueOf(count);
        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }

}
