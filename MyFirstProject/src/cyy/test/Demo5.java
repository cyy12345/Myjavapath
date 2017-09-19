/*
泛型
 */

package cyy.test;
import java.lang.reflect.Method;
import java.util.*;
public class Demo5 {
    public static void main(String[] args){
        ArrayList<Dog> al=new ArrayList<Dog>();
        Dog dog1 = new Dog();
        al.add(dog1);
        //Dog temp=(Dog)al.get(0);

        //Cat temp1=(Cat)al.get(0);
        Dog temp=al.get(0);
        Gen<Bird> gen1 = new Gen<Bird>(new Bird());
        gen1.showTypeName();
    }
}
class Bird
{
    public void test1()
    {
        System.out.println("aa");
    }
    public void count(int a,int b)
    {
        System.out.println(a+b);
    }
}
class Cat
{


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String color;
    private int age;
}
class Dog
{
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

    private String name;
    private int age;


}

class Gen<T>
{
    private T o;
    public Gen(T a)
    {
        o=a;
    }
    //得到T的类型名称
    public void showTypeName()
    {
        System.out.println("类型是:" + o.getClass().getName());
        //通过反射机制,我们可以得到T这个类型的很多信息(比如它的成员函数函数名)
        Method []m = o.getClass().getDeclaredMethods();
        for (int i=0;i<m.length;i++)
        {
            System.out.println(m[i].getName());
        }
    }
}

