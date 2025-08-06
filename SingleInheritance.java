

public class SingleInheritance{
    public static void main(String[] args) {
        B obj = new B();
    }
}


class A{

    public A() {
        System.out.println("Class A");
    }
    
}

class B extends A{
    public B()
    {
        System.out.println("Constructor of B");
    }
    
}