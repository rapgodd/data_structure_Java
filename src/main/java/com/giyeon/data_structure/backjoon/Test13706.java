package com.giyeon.data_structure.backjoon;

import java.math.*;
import java.io.*;
import java.util.*;

public class Test13706 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String WeNeedToFindRootWithThis = br.readLine();
        BigInteger WeNeedToFindRootWithThisBI = new BigInteger(WeNeedToFindRootWithThis);

        BigInteger root = binarySearch(WeNeedToFindRootWithThisBI);

        sb.append(root);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static BigInteger binarySearch(BigInteger WeNeedToFindRootWithThisBI){


        BigInteger two = new BigInteger("2");
        BigInteger one = new BigInteger("1");
        BigInteger left = new BigInteger("1");
        BigInteger right = WeNeedToFindRootWithThisBI;
        BigInteger mid = (left.add(right)).divide(two);

        while(!mid.multiply(mid).equals(WeNeedToFindRootWithThisBI)){

            mid = (left.add(right)).divide(two);

            if(mid.multiply(mid).compareTo(WeNeedToFindRootWithThisBI)>0){

                right = mid.subtract(one);

            }else{

                left = mid.add(one);

            }
        }

        return mid;

    }

}
