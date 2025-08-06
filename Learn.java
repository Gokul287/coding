
// CLASS AND OBJECT

import java.util.*;
import java.lang.*;
// public class Learn {
//     public static void main(String arr[]) {
//         Calculate obj = new Calculate();
//        System.out.println(obj.add(10,20));
//     }
// }
// class Calculate{
//     public int add(int a,int b)
//     {
//         return a+b;
//     }
// }


//###########################################

//    STATIC EXAMPLE
// class Basic{
//     static int nums;
//     public Basic(int nums)
//     {
//         this.nums=nums;
//     }
//     public int fun()
//     {
//         return  nums;
//     }
// }
// public class Learn{
//     public static void main(String[] args) {
//         Basic obj = new Basic(5);
//         Basic obj1 = new Basic(5);
//         Basic.nums=10;
//         System.out.println(obj.fun()+" " + obj1.fun());
//     }
// }

//###########################################//


// STRING EXAMPLE

// public class Learn{
//     public static void main(String[] args) {
//         String s1 = new String("Gokul");
//         System.out.println(s1);
//     }
// }



//######################################


// STATIC VARIABLE EXAMPLE
// class Human
// {
//    static String name;
//    public Human(String name)
//    {
//     this.name =name;
//    }
//    public String getName()
//    {
//     return this.name;
//    }
// }
// public class Learn{
//     public static void main(String[] args) {
//         Human obj = new Human("Gokul");
//         Human obj1 = new Human("Jana");
//         Human.name="Cristiano";
//         System.out.println(obj.getName());
//     }
// }


//########################################
// PRIME NUMBER EXAMPLE
// class Learn{
//     public static void main(String[] args) {
//         int a=20;

//         for(int i=1;i<=a;i++)
//         {
//             if(isPrime(i))
//             {
//                 System.out.print(i+" ");
//             }
//         }
//     }

//     public static boolean isPrime(int n)
//     {
          
//         for(int i=2;i<=Math.sqrt(n);i++)
//         {
//             if(n%i==0)
//             return false;
//         }
//         return true;
//     }
// }
