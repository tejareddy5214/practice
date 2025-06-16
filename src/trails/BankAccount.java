package trails;



public class BankAccount{

    public static  void main(String[] args){
        Validator v=new Validator("teja",987654321,500);
        System.out.println(v.displayBalance(987654321));
        v.deposit(987654321,5000);
        v.withdraw(987654321,1000);
        System.out.println(v.displayBalance(987654321));
    }
}

class Validator {
    private String name;
    public int accountNumber;
    private int balance;
    public Validator(String x,int y,int z){
        this.name = x;
        this.accountNumber = y;
        this.balance = z;
    }

    public void withdraw(int accountNumber,int withdrawAmount){
        if (this.accountNumber != accountNumber){
            System.out.println("Details Mismatch");
        }
        if(this.balance>withdrawAmount) {
            this.balance = balance - withdrawAmount;
            System.out.println("Hi "+this.name+" - "+accountNumber+"\n"+"Withdraw Successful and your current balance :" + balance);
        }
        else {
            System.out.println("Balance insufficient");
        }
    }
    public void deposit(int accountNumber, int depositAmount){
        if (this.accountNumber != accountNumber){
            System.out.println("Details Mismatch");
        }
        System.out.println("Deposit Successful.");
        this.balance = balance+depositAmount;
        System.out.println("Current balance is: "+balance);
    }
    public int displayBalance(int accountNumber){
        if (this.accountNumber != accountNumber){
            System.out.println("Details Mismatch");
            return 0;
        }
        return balance;
    }
}