package bankingProgram;

public class Bank_Account {
    private String accNo;
    private String name;
    private double accBalance;

    public void deposit(double amt){
        if(amt>0){
            accBalance = accBalance + amt;
            System.out.println("Successfully deposited $" + amt);
        }else{
            System.out.println("Invalid amount entered. Kindly make sure the amount to be deposited is greater than $0.");
        }
    }
    public void withdraw(double amt){
        if(amt>0){
            accBalance = accBalance - amt;
            System.out.println("Successfully withdrawn $" + amt);
        }else{
            System.out.println("Invalid amount entered. Kindly make sure the amount to be withdrawn is greater than $0.");
        }
    }
    public void balanceDetails(){
        System.out.println("The total account balance is " + accBalance);
    }

    Bank_Account(String accNo, String name, Double accBalance){
        this.accNo= accNo;
        this.name= name;
        this.accBalance= accBalance;
    }
}
