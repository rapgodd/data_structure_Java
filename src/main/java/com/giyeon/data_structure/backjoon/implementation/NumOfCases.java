package com.giyeon.data_structure.backjoon.implementation;

public class NumOfCases {

    public int v1(int n){
        int count = 1;

        for(int i=1; i<=n; i++){
            int sum = 0;

            for(int j=i; j<=n; j++){
                sum += j;
                if(sum>n){break;}
                if(sum==n){count+=1; break;}
            }
        }

        return count;

    }


    public int v2(int n){
        int count = 1;

        for(int i=1; i<=n; i++){
            int sum = 0;

            if(n/2 < i){
                break;
            }

            for(int j=i; j<=n; j++){
                sum += j;
                if(sum>n){break;}
                if(sum==n){count+=1; break;}
            }
        }

        return count;

    }
}
