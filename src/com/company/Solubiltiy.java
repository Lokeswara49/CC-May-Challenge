package com.company;

import java.util.Scanner;

public class Solubiltiy {

    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                int x= sc.nextInt();
                int a= sc.nextInt();
                int b= sc.nextInt();
                int ans=a+(100-x)*b;
                ans*=10;
                System.out.println(ans);
            }
        }
        catch(Exception e){
            return;
        }
    }
}
