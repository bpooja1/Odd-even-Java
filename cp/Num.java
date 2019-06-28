package com.cp;

import java.util.Scanner;

public class Num
{
    int odd,even;
    public void Number(int a) {
        if(a % 2 == 0)
        System.out.println("the no is even");
        else
        System.out.println("the no is odd");
    }

    public static void main(String[] args) {
        int a;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        Num n=new Num();
        n.Number(a);
    }
}

