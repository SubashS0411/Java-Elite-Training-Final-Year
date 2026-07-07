public class BankAccount {
    public static void main(String[] args) {
        Account h1=new Account(1000,"Leo");
        h1.setBalance(107);
        System.out.println(h1.getBalance());
    }
}
class Account{
    private int balance;
    private String AccountHolderName;
    public Account(int balance,String AccountHolderName){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        if(balance>0){
            balance+=balance;
            System.out.println("Balance is "+balance);

        }
        else{
            System.out.println("Balance is less than zero: "+balance);
        }
    }

}
