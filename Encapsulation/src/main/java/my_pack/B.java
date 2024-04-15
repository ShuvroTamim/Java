package my_pack;
//import pack.*;  //(1). For every class of the package pack
//import pack.A;  //(2). For only declared class of the package pack

public class B {
    public static void main(String[] args) {
        //A obj = new A();  // For (1) and (2)
        pack.A obj = new pack.A();  //using fully qualified name
        obj.msg();
    }
}
