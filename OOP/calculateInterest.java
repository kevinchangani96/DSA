package OOP;

public class calculateInterest {
    public static void main(String[] args) {
        account c1 = new account();
        c1.accountNumber = 200300;
        c1.custName = "kevin";
        c1.balance = 31000;
        c1.interest = 7.00f;

c1.displayAccountDetails();
    }
}

class account {
    long accountNumber;
    String custName;
    float balance;
    float interest;


    public float calculateInterest() {
        float interest1     = (balance * interest ) / 100;
        return  interest1;
    }

    public void displayAccountDetails() {
        System.out.println(accountNumber);
        System.out.println(custName);
        System.out.println(balance);
        System.out.print("balance after interest rate : ");
        System.out.print(balance+(calculateInterest()));

    }
}
