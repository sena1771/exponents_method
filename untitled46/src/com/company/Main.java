package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("The base number: ");
        int base= inp.nextInt();
        System.out.print("The exponent number:");
        int exponent= inp.nextInt();
       System.out.print(power(base,exponent));
    }
    public static int power(int base,int exponent){
int result=1;



        if (exponent == 1){
            return base;
        }




        else{
            return base * power(base, exponent - 1);
        }

      
    }





}




