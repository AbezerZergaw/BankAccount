import java.util.ArrayList;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {

        double balance;
        String YesOrNO;
        Scanner input = new Scanner(System.in);
        ArrayList<Account> myAccount = new ArrayList<>();
        do {


            System.out.println("Enter your account number\r");
            Account account = new Account();
            String accNum = input.nextLine();
            account.setNumber(accNum);

            System.out.println("Enter your PIN\r");
            String pin = input.nextLine();
            account.setPin(pin);

            System.out.println("Enter the amount you want to deposit\r");
            double Intitaldeposit = input.nextDouble();
            account.setBalance(Intitaldeposit);
            myAccount.add(account);
            input.nextLine();
            System.out.println("Do you want to create another account? Yes or No\r");
            YesOrNO = input.nextLine();

        } while (YesOrNO.equalsIgnoreCase("Yes"));


        System.out.println("Please Enter Your Account Number:");

        String actNum = input.nextLine();

        System.out.println("Please Enter Your PIN: ");

        String pinNum = input.nextLine();

        //after accepting pin

        //validation
        for (int i = 0; i < myAccount.size(); i++) {
            if (actNum.equals(myAccount.get(i).getNumber()) && pinNum.equals(myAccount.get(i).getPin())) {
                balance = myAccount.get(i).getBalance();
            }
        }
        System.out.print("\nPlease Choose From the Following Options:"
                + "\n 1. Display Balance \n 2. Deposit"
                + "\n 3. Withdraw\n 4. Log Out\n\n");

        int menuChoice = input.nextInt();

        if (menuChoice < 1 || menuChoice > 4) {
            System.out.println("error");
        } else if (menuChoice == 1) {
           // displayBalance(balance);
        } else if (menuChoice == 2) {

        } else if (menuChoice == 3) {

        } else if (menuChoice == 4) {

        } else
            System.out.println("Invalid Input");

    }

    public static void displayBalance(double x) {
        System.out.printf("\nYour Current Balance is $%.2f\n", x);
    }

  /*  public static void withdraw(double balance) {
        System.out.println("Enter the amount you want to Withdraw");
     //   double withdraw = input.nextDouble();

        balance = balance - withdraw;
        System.out.println("Your Remaining balance is:" + balance);


    }*/
}




        /*for (int i = 0; i < myAccount.size(); i++)

        {
            System.out.println(myAccount.get(i).getBalance() + " " + myAccount.get(i).getNumber());


        }*/








