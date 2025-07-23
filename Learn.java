
public class Learn {
    public static void main(String arr[]) {
        Calculate obj = new Calculate();
       System.out.println(obj.add(10,20));
    }
}
class Calculate{
    public int add(int a,int b)
    {
        return a+b;
    }
}
