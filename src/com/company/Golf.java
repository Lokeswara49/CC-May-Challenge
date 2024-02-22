package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Golf {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0){
                long n= sc.nextLong();
                long x= sc.nextLong();
                long k= sc.nextLong();
                boolean flag=true;
                if(x%k==0) {
                    System.out.println("YES");
                }
                else{
                    if((n-x+1)%k==0)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                t--;
            }
        }
        catch (Exception e){
            return;
        }
    }
}
