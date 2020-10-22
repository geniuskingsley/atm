package com.genius;

import java.util.Scanner;

public class Main {

    public static  void with(){


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
            if (amtin.equals("4")){
                System.out.println("Not avaliable yet, our system can't withdraw more than the following so select any of the option above!!");
            }
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
    public static void trans(){
        //----transfer---//


        Scanner transfer = new Scanner(System.in);
        String trann;
        while (true){
            System.out.print("Enter account number to transfer to :");
            trann = transfer.next();
            if (trann.equals("1234")){
                break;
            }
            else {
                System.out.println("Please enter a valid account number");
            }
        }


            System.out.println("--SELECT-- \n 1.$500 \n 2.$1000 \n 3.$5000 \n 4.Enter custom amount");
            Scanner tranamt = new Scanner(System.in);
            String tran1;
            while (true){
                System.out.print("Enter :");
                tran1 = tranamt.next();
                if (tran1.equals("1")){
                    System.out.println("Do you want reciept Yes / no");
                    break;
                }
                if (tran1.equals("2")){
                    System.out.println("Do you want reciept Yes / no");
                    break;
                }
                if (tran1.equals("3")){
                    System.out.println("Do you want reciept Yes / no");
                    break;
                }
                if (tran1.equals("4")){
                    System.out.println("Not avaliable yet, our system can't transfer more than the following so select any of the option above!!");

                }
                else {
                    System.out.println("Select a valid option");
                }
            }

            Scanner yesnoo = new Scanner(System.in);
            String yessnoo;
            while (true){
                System.out.print("Enter :");

                yessnoo = yesnoo.next().toLowerCase();
                if (yessnoo.equals("yes")){
                    System.out.println("Would you love to proceed / cancle");
                    break;
                }

                if (yessnoo.equals("no")){
                    System.out.println("Would you love to proceed / cancle");
                    break;
                }

                else {
                    System.out.println("Enter a valid answer");
                }

            }

            Scanner proocann = new Scanner(System.in);
            String prrocaan;
            while (true){
                System.out.print("Enter :");
                prrocaan = proocann.next().toLowerCase();
                if (prrocaan.equals("proceed")){
                    System.out.println("Thank you for banking with us, your transaction was sent successfully");
                    break;
                }
                if (prrocaan.equals("cancle")){
                    System.out.println("Thank you, you've successfully canclled the transaction");
                    break;
                }
                else {
                    System.out.println("Enter a valid option");
                }

            }


    }

    //---balance--\\

    public  static void checkb(){
        System.out.println("Your available balance is $100,000,000");
    }




    public static void main(String [] args) {

//---enter acct number-----\\
        Scanner scanner = new Scanner(System.in);
        String input ="";
        while (true) {
            System.out.print("Enter account number :");
            input = scanner.next();
            if (input.equals("1234"))
                break;

            if (!input.equals("1234"))
            System.out.println("Error, Input a valid account number and try again");
        }

        Scanner scanner1 = new Scanner(System.in);
        String input1 ="";
        while (true){
            System.out.print("Enter your pin :");
            input1 = scanner1.next();
            if (input1.equals("0000")){
                break; }
            else
                System.out.println("Please enter your valid pin");
        }

                                   //----------select-----------------\\
        System.out.println("--SELECT--  \n 1.Withdraw  \n 2.Transfer \n 3.Checkbalance");
        Scanner acct = new Scanner(System.in);
        String optioninput;
        while (true) {
            System.out.print("Enter :");
            optioninput = acct.next();
            if (optioninput.equals("1")) {
                with();
                break;
            }

        if (optioninput.equals("2")) {
            trans();
            break;

        }
        if (optioninput.equals("3")){
            checkb();
            break;
        }

        }



    }
}
