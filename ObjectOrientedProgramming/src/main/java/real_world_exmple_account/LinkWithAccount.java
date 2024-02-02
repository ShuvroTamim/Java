package real_world_exmple_account;

public class LinkWithAccount {
    public static void main(String[] args) {
        Account cus1 = new Account();
        
        cus1.insert(832345, "Tamim", 1000);
        cus1.display();
        cus1.checkBalance();  
        cus1.deposit(40000);  
        cus1.checkBalance();  
        cus1.withdraw(15000);  
        //cus1.checkBalance();
    }
}
