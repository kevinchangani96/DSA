package OOP;

public class Main1 {
    public static void main(String[] args) {
        Account1 a1 = new Account1(1234,"kevin",10000);
        a1.printDetails();
        a1.deposit(1000);
        a1.printDetails();
        a1.withDraw(20000);
        a1.printDetails();
    }
}

class Account1 {
    int AccounaccountNo;
    String custName;
    int accountBalance;

    public Account1(int accounaccountNo, String custName, int accountBalance) {
        AccounaccountNo = accounaccountNo;
        this.custName = custName;
        this.accountBalance = accountBalance;
    }

    public void printDetails(){
        System.out.println("account no" + AccounaccountNo);
        System.out.println("name"+custName);
        System.out.println("acbalance"+accountBalance);
    }
    public void deposit(int deposit){
        accountBalance =accountBalance+deposit;
    }

    public int withDraw(int withDraw) {
        if (accountBalance < withDraw) {
            System.out.println("balance is not sufficent");
            return withDraw;
        }
        accountBalance = accountBalance - withDraw;
        return accountBalance;
    }
    }


