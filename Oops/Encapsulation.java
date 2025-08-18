package Oops;
public class Encapsulation{
    public static void main(String[] args) {
        
    Human obj = new Human();
    int age =obj.getAge();
    String name = obj.getName();
    System.out.println("Name is + "+name+" , Age is + "+age);
    }
}

class Human{
    private String name="John";
    private int age =30;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

   
}