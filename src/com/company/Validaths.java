package com.company;

import java.util.Scanner;

public class Validaths {
    static int n;
    static boolean[] b;
    static int result=0;
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                n= sc.nextInt();
                int[][] a=new int[n+1][n+1];
                b=new boolean[n+1];
                for(int i=0;i<n+1;i++) {
                    for (int j = 0; j < n + 1; j++)
                        a[i][j] = 0;
                }
                for(int i=0;i<n-1;i++){
                    int x= sc.nextInt();
                    int y= sc.nextInt();
                    a[x][y]=1;
                    a[y][x]=1;
                }
                int ans=0;
                for(int i=1;i<n+1;i++){
                    for(int j=1;j<n+1;j++)
                        b[j]=false;
                    result=1;
                    dfs(a,i);
                    ans+=(int)Math.pow(2,result);
                    System.out.println("");
                }
                System.out.println(ans);
            }
        }
        catch(Exception e){
            return;
        }
    }
    static void dfs(int[][] a,int x){
        b[x]=true;
        for(int i=1;i<n+1;i++){
            if(!b[i] && a[x][i]==1){
                result++;
                System.out.print(i);
                b[i]=true;
                dfs(a,i);
            }
        }
    }
}
