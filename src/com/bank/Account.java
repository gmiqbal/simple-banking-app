package com.bank;

public class Account {
    //customer name, account, phone, email, balance
    private String name;
    private int accountNo;
    private int phoneNo;
    private String email;
    private double Balance;

    public Account(String name, int accountNo, int phoneNo, String email, float Balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.Balance = Balance;
    }

    public void DepositMoney(double DepositedMoney){
        Balance += DepositedMoney;
        System.out.println("Deposit is Successful! \n" +
                "New balance is: "+ Balance + "Taka");
    }

    public void WithdrawMoney(int WithdrawnMoney){
        if(Balance - WithdrawnMoney < 0){
            System.out.println("Withdraw unsuccessful! " +
                    "Available balance is "+ Balance + "Taka Only");
        }else {
            Balance -= WithdrawnMoney;
            System.out.println("Taka" + WithdrawnMoney + " has been withdrawn." +
                    " New balance is " + Balance + "Taka");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        this.Balance = balance;
    }
}
