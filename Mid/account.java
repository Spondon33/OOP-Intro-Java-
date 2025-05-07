public class account {
    int accountNumber;
    String accountHolderName;
    double balance;

    public void setAccountNumber(int an){
        accountNumber = an;
    }
    public void setAccountHolderName(String ahn){
        accountHolderName = ahn;
    }
    public void setBalance(double b){
        balance = b;
    }

    int getAccountNumber(){
        return accountNumber;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    double getBalance(){
        return balance;
    }
    void showDetails(){
        getAccountNumber();
        getAccountHolderName();
        getBalance();
    }
}
