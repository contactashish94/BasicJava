package com.ashish.constructor;

public class Account {

    private String number;
    private double balance;
    private String custName;
    private String custEmailAdd;
    private String custPhoneNum;
    public Account(){
        System.out.println("Empty called:");
    }

    public Account(String str){
        System.out.println("Argumented called" + str);
    }

    {
        System.out.println("IIB executed");
    }
    {
        System.out.println("IIB executed-1");
    }

    public void depositAmmount(double depositedAmmnt){
        this.balance += depositedAmmnt;
        System.out.println("Deposited.. " + depositedAmmnt + "  Successfully, available balance now is " + this.balance);
    }

    public void withdrawal(double withdrawalAmmnt){
        if(this.balance - withdrawalAmmnt < 0 ){
            System.out.println("requested ammount is " + withdrawalAmmnt +", only " + this.balance + " available, withdrawal not processed");
        } else {
            this.balance -= withdrawalAmmnt;
            System.out.println("Withdrawal of " + withdrawalAmmnt + " Processed, Remaining balance is " + this.balance);
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmailAdd() {
        return custEmailAdd;
    }

    public void setCustEmailAdd(String custEmailAdd) {
        this.custEmailAdd = custEmailAdd;
    }

    public String getCustPhoneNum() {
        return custPhoneNum;
    }

    public void setCustPhoneNum(String custPhoneNum) {
        this.custPhoneNum = custPhoneNum;
    }
}
