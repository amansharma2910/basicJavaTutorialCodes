package bankingProgram;

public class Banking_Main {
    public static void main(String[] args) {
        Bank_Account b1= new Bank_Account("69420SUCKME", "Aman Sharma", 1000000.0);

        b1.deposit(2100);
        b1.balanceDetails();
        b1.deposit(-2400);
        b1.withdraw(25000);
        b1.balanceDetails();
    }
}
