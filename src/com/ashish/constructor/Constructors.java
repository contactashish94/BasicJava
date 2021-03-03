package com.ashish.constructor;

public class Constructors {



    public static void main(String[] args) {

        Account account = new Account();
        Account account1 = new Account("ABCD");

        account.withdrawal(50.46);

        account.depositAmmount(100.23);
        account.depositAmmount(100.23);


        account.withdrawal(200.47);
    }

}
