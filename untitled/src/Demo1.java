/*
cyy
 */

public class Demo1 {
    public static void main(String[] args){

    }

}
abstract class Animal
{
    String name;
    int age;
    abstract public void cry();

}

class Cat extends Animal{
    public void cry()
    {
        System.out.println("miao miao");
    }

}
