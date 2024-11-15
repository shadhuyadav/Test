interface A {
    void add(); // Added return type
}

abstract class B implements A {
    // Optionally, you could provide an implementation for `add()` here
}

class C extends B {
    @Override
    public void add() { // Added return type and proper method body
        // Implementation of add()
        System.out.println("Add from class C");
    }
}

class D implements A { // Fixed typo in "implements"
    @Override
    public void add() { // Added return type and proper method body
        // Implementation of add()
        System.out.println("Add from class D");
    }
}




public class InterfaceTest {

    public static void main(String args[]){
        B bo=new C();
        bo.add();


    }
}
