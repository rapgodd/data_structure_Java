package com.giyeon.data_structure.backjoon;


import java.io.*;

public class FindWord {

    public static int count = 0;
    public static int nextIndex = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String paragraph = br.readLine();
        String word = br.readLine();

        String[] words = paragraph.split("");
        String[] oneLetterByOneLetter = word.split("");


        for (nextIndex = 0; nextIndex < words.length; nextIndex++) {

            if(words[nextIndex].equals(oneLetterByOneLetter[0])){
                for(int j = 1; j < oneLetterByOneLetter.length; j++){
                    if(!oneLetterByOneLetter[j].equals(words[nextIndex+j])){
                        break;
                    }
                    //끝까지 같은 경우
                    if(oneLetterByOneLetter[oneLetterByOneLetter.length-1].equals(words[nextIndex+ oneLetterByOneLetter.length-1])){
                        count++;
                        nextIndex = nextIndex + (oneLetterByOneLetter.length);
                    }
                }
            }


        }

        String s = String.valueOf(count);

        bw.write(s + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
