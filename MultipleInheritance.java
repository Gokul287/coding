public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.fun();
    }
}

interface A{
    default void fun() {
        System.out.println("A's fun");
    }
}

interface B{
    default void fun() {
        System.out.println("B's fun");
    }
}
class C implements A,B{
    public void fun()
    {
        A.super.fun();
        B.super.fun();
    }
}
