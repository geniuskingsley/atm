package com.genius;

import java.util.Scanner;

public class withdraw {

    public  static void withdraww(){


        //------------------1.WITHDRAWAL--------------------------\\
        System.out.println("--SELECT-- \n 1.$500 \n 2.$1000 \n 3.$5000 \n 4.Enter custom amount");
        Scanner amt = new Scanner(System.in);
        String amtin;
        while ( true){
            System.out.print("Enter :");
            amtin = amt.next();
            if (amtin.equals("1")){
                System.out.println("Do you want reciept Yes / no");
                break; }

            if (amtin.equals("2")){
                System.out.println("Do you want reciept Yes / no");
                break; }

            if (amtin.equals("3")){
                System.out.println("Do you want reciept Yes / no");
                break; }
            else
                System.out.println("Please enter a valid number");

        }

        Scanner yn= new Scanner(System.in);
        String yeno;
        while (true){
            System.out.print("Enter :");
            yeno = yn.next().toLowerCase();
            if (yeno.equals("yes")) {
                System.out.println("Would you love to proceed or cancle");
                break;
            }
            if (yeno.equals("no")) {
                System.out.println("Would you love to proceed or cancle");
                break;
            }
            else System.out.println("Enter a valid option");

        }

        Scanner pc = new Scanner(System.in);
        String prca;
        while (true){
            System.out.print("Enter :");
            prca = pc.next().toLowerCase();
            if (prca.equals("proceed")) {
                System.out.println("Thank You for banking with us, here's your cash... take it ");
                break;
            }
            if (prca.equals("cancle")) {
                System.out.println("Thank You, your transaction has being cancled");
                break;
            }
            else System.out.println("Enter a valid option");

        }



    }
}
