package polymorphism_Method_overriding;

public class Bank_Link {
    public static void main(String[] args) {
        Bank_NCC bn = new Bank_NCC();
        Bank_NRBC bnr = new Bank_NRBC();
        Bank_IFIC bi = new Bank_IFIC();
        
        System.out.println("NCC bank rte of Interest: " + bn.getRateOfInterest());
        System.out.println("NRBC bank rte of Interest: " + bnr.getRateOfInterest());
        System.out.println("IFIC bank rte of Interest: " + bi.getRateOfInterest());                
    }
}
