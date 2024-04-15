package encapsulation_class;

public class Account_Test {
    public static void main(String[] args) {
        Account obj = new Account();
        
        obj.setAccNo(1733300000079L);
        obj.setName("Tamim");
        obj.setEmail("tamim.ahmed.mbstu@gmail.com");
        obj.setAmount(500000f);
        //getting values through getter methods
        System.out.println("\nAccount No: "+obj.getAccNo()+"\nName: "+obj.getName()+"\nEmail: "+obj.getEmail()+"\nAmount is: "+obj.getAmount());
        
    }
}
