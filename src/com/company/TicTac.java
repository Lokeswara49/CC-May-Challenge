package com.company;

import java.util.Scanner;

public class TicTac {
    public static void main(String[] args) {

        try{
            Scanner sc=new Scanner(System.in);
            long t=sc.nextLong();
            String s0= sc.nextLine();
            for (long i=0;i<t;i++){
                String[] s=new String[3];
                char[][] ch=new char[3][3];
                boolean flag_1=false;
                int x=0,o=0;
                for(int j=0;j<3;j++) {
                    s[j] = sc.nextLine();
                    for(int k=0;k<3;k++) {
                        ch[j][k] = s[j].charAt(k);
                        if(ch[j][k]=='_')
                            flag_1=true;
                        if(ch[j][k]=='X')
                            x++;
                        else if(ch[j][k]=='O')
                            o++;

                    }
                }
                int  flagx=0;
                int flago=0;
                int flag=0;
                for(int k=0;k<3;k++){
                    flag=check(s[k]);
                    if(flag==1)
                        flagx++;
                    else if(flag==2)
                        flago++;
                }
                String[] s1=new String[3];
                    s1[0]=""+ch[0][0]+ch[1][0]+ch[2][0];
                    s1[1]=""+ch[0][1]+ch[1][1]+ch[2][1];
                    s1[2]=""+ch[0][2]+ch[1][2]+ch[2][2];
                    for(int k=0;k<3;k++){
                        flag=check(s1[k]);
                        if(flag==1)
                            flagx++;
                        else if(flag==2)
                            flago++;
                    }
                    s1[0]=""+ch[0][0]+ch[1][1]+ch[2][2];
                    s1[1]=""+ch[0][2]+ch[1][1]+ch[2][0];
                    for(int k=0;k<2;k++) {
                        flag=check(s1[k]);
                        if(flag==1)
                            flagx++;
                        else if(flag==2)
                            flago++;
                    }
                    if(o>x || x-o>1)
                        System.out.println(3);
                    else if(flagx==1 && flago==0 && x>o)
                        System.out.println(1);
                    else if(x==o && flagx==0 && flago==1)
                        System.out.println(1);
                    else if(!flag_1 && flago+flagx==0)
                        System.out.println(1);
                    else if(!flag_1 && flagx==2)
                        System.out.println(1);
                    else if(flag_1 && flagx==0 && flago==0)
                        System.out.println(2);
                    else
                        System.out.println(3);
            }
        }
        catch(Exception e){
            return;
        }
    }
    static int check(String s){
        if(s.charAt(0)==s.charAt(1) && s.charAt(0)==s.charAt(2) && s.charAt(0)=='X')
            return 1;
        else if(s.charAt(0)==s.charAt(1) && s.charAt(0)==s.charAt(2) && s.charAt(0)=='O') {
            return 2;
        }
        return 0;
    }
}
