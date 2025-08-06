public class MultiLevelInheritance {
    public static void main(String[] args) {
       C obj = new C();
    }
}

class A {
    public A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public B() {
        System.out.println("Constructor of B");
    }
}

class C extends B {
    public C() {
        System.out.println("Constructor of C");
    }
}
