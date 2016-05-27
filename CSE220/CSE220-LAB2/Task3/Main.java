public class Main{
    public static void main(String[] args){
        
        BankAccount acc1 = new BankAccount("John", "Florida", "John123", 260.25);
        BankAccount acc2 = new BankAccount("Smith", "California", "Smith456", 120.25);
        BankAccount acc3 = new BankAccount("Bucky", "Georgia", "Bucky789", 80.60);
        
        acc2.setBalance(170.85);
        acc1.addInterest();
        acc3.addInterest();
        
        System.err.println("Name of acc2: " + acc2.getName());
        System.err.println("Balance of acc1: " + acc1.getBalance());
        System.err.println("Account ID of acc3: " + acc3.getAccountId());
        acc3.setAddress("Michigan");
        
        System.out.println("=============================================");
        
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}