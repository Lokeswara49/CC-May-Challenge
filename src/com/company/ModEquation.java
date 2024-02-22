package com.company;

import java.util.Scanner;

public class ModEquation {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0){
                int n= sc.nextInt();
                int m= sc.nextInt();
                int ans=n-1;
                int[] a=new int[n+1];
                for(int i=1;i<n+1;i++)
                    a[i]=m%i;
                    for(int i=2;i<n;i++){
                        if(m<=i){
                            ans+=n-i;
                        }
                        else{
                            int j=i+1;
                            while(j<=n){
                                if(m%i==(m%j)%i)
                                    ans++;
                                j+=i;
                            }
                        }
                    }
                System.out.println(ans);
                t--;
            }
        }
        catch (Exception e){
            return;
        }
    }
}
