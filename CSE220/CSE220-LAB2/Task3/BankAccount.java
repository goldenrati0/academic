public class BankAccount{

    private String name, address, accountId;
    private double balance;

    BankAccount(String name, String address, String accountId, double balance){

        this.name = name;
        this.address = address;
        this.accountId = accountId;
        this.balance = balance;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void setAddress(String address){

        this.address = address;
    }

    public String getAddress(){

        return address;
    }

    public void setAccountId(String accountId){

        this.accountId = accountId;
    }

    public String getAccountId(){

        return accountId;
    }

    public void setBalance(double balance){

        this.balance = balance;
    }

    public double getBalance(){

        return balance;
    }

    public void addInterest(){

        double interest = (7 * balance) / 100;
        balance = balance + interest;
    }

    public String toString(){

        String info = "Name: " + name + "\nAddress: " + address + "\nAccountID: " + accountId + "\nBalance: " + balance + "\n=============================================";

        return info;
    }
}
