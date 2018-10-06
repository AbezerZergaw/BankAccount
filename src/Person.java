import java.util.ArrayList;

import java.util.Scanner;

public class Person {
    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        double balance;
        String YesOrNO;
        ArrayList<Account> myAccount = new ArrayList<>();
        // creates a new accounts
        do {


            System.out.println("Enter your new account number\r");

            Account account = new Account();

            String accNum = input.nextLine();
            account.setNumber(accNum);

            System.out.println("Enter new PIN\r");
            String pin = input.nextLine();
            account.setPin(pin);

            System.out.println("Enter the amount you want to deposit\r");
            double initialDeposit = input.nextDouble();
            account.setBalance(initialDeposit);
            myAccount.add(account);
            input.nextLine();
            System.out.println("Do you want to create another account? Yes or No\r");
            YesOrNO = input.nextLine();

        } while (YesOrNO.equalsIgnoreCase("Yes"));


        // a user enters his account number and pin to login

        int count = 0;

        do {

            Account account1 = new Account();

            System.out.println("Please Enter Your Account Number to Login:");

            String actNum = input.nextLine();
            account1.setNumber(actNum);

            System.out.println("Please Enter Your PIN to Login: ");

            String pinNum = input.nextLine();
            input.nextLine();
            account1.setPin(pinNum);


            //after accepting account number and  pin


            //validation account number and PIN


            for (int i = 0; i < myAccount.size(); i++) {

                if (actNum.equals(myAccount.get(i).getNumber()) && pinNum.equals(myAccount.get(i).getPin())) {
                    balance = myAccount.get(i).getBalance();

                    System.out.print("\nPlease Choose From the Following Options:"
                            + "\n 1. Display Balance \n 2. Deposit"
                            + "\n 3. Withdraw\n 4. Log Out\n\n");

                    int menuChoice = input.nextInt();
                    input.nextLine();

                    if (menuChoice < 1 || menuChoice > 4) {
                        System.out.println("error");

                    } else if (menuChoice == 1) {
                        displayBalance(balance);
                    } else if (menuChoice == 2) {
                        System.out.println("Enter the Amount you want to deposit !");
                        double deposit = input.nextDouble();
                        input.nextLine();
                        deposit(deposit, balance);

                    } else if (menuChoice == 3) {
                        System.out.println("enter the amount you want to withdraw ");
                        double withdrawMoney = input.nextDouble();
                        input.nextLine();
                        withdraw(withdrawMoney, balance);
                    } else if (menuChoice == 4) {
                        System.out.println("Thank you for banking we us.");
                        break;
                    } else
                        System.out.println("Invalid Input");
                } else {
                    System.out.println("Invalid Account number or PIN");
                }

            }
            count++;

        } while (count < 3);

        if (count == 3 ) {
            System.out.println("Your Account is LOCKED!");
        }
    }


    // methods for accessing account

    public static void displayBalance(double x) {
        System.out.printf("\nYour Current Balance is $%.2f\n", x);
    }

    public static void withdraw(double money, double balance) {

        if (money > balance) {
            System.out.println("Withdraw not processed Try different amount");

        } else

            balance = balance - money;
        System.out.println("Your Remaining balance is:" + balance);

    }

    public static void deposit(double money, double balance) {

        balance = balance + money;
        System.out.println("Your balance is :" + money);

    }
}












