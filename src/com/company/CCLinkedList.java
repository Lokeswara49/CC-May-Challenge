package com.company;
import java.util.Scanner;

class Node{
    int data;
    Node link;
    Node(){};
    Node(int data){
        this.data= data;
        this.link=null;
    }
    Node(int data, Node link){
        this.data= data;
        this.link= link;
    }
}
public class CCLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node head = CreateList(n);
        Node temp = head;
        Node bef=null;
        int count=1;
        while(n>1){
            if(count==k){
                System.out.println(temp.data);
                bef.link=temp.link;
                n--;
                count=0;
                temp=temp.link;
            }
            else{
                bef=temp;
                temp=temp.link;
            }
            count++;
        }
        System.out.println(bef.data);

    }
 static Node CreateList(int n){
        int i=0;
        Node curr=null;
        Node head=null;
        while(i<n){
            Node node=new Node(i);
            if(i==0)
                head=node;
            else{
                curr.link=node;
            }
            curr=node;
            i++;
        }
        curr.link=head;
        return head;
   }
}
