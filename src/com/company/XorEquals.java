package com.company;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class XorEquals {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t= sc.nextInt();
            for(int i=0;i<t;i++){
                int n= sc.nextInt();
                long ans=pow(2,n-1);
                System.out.println(ans%1000000007);
            }
        }
        catch (Exception e){
            return;
        }
    }
    static long pow(long x,int n){
        long ans=1;
        while(n>0){
            if(n%2==0){
                x=(x*x)%1000000007;
                n=n/2;
            }
            else{
                ans=(ans*x)%1000000007;
                n--;
            }
        }
        return ans;
    }
}


