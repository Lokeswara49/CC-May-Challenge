package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int ans=1;
        int count=0;
        int lastindex=n-1;
        for(int i=0,j=n-1;i<=j;i++,j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        int i=0;
        while(count<k){
            if(a[i]*a[i+1]<a[lastindex]*a[lastindex-1]){
                count+=2;
                ans*=(a[lastindex]*a[lastindex-1]);
                lastindex-=2;
            }
            else{
                count+=2;
                ans*=(a[i]*a[i+1]);
                i+=2;
            }
        }
        System.out.println(ans);
    }
}
