package real_world_exmple_account;

public class Account {
    int accNo;
    String name;
    float amount;
    
    void insert(int ac, String n, float am){
        accNo = ac;
        name = n;
        amount = am;
    }
    
    void deposit(float am){
        amount = amount + am;
        System.out.println("Total amount is: " + amount);
    }
    
    void withdraw(float am){
        if (amount < am) {
            System.out.println("Insufficient balance!");
        } else {
            amount = amount - am;
            System.out.println("Amount withdrawn: " + am);
            System.out.println("Present balance is: " + amount);
        }
    }
    
    void checkBalance(){
        System.out.println("Balance is: " + amount);
    }
    
    void display(){
        System.out.println("The balance of account number " + accNo + " and name " + name + " is: " + amount);
    }
}
