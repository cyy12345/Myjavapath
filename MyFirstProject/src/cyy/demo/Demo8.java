/*
* 功能:演示java集合用法
 */
package cyy.demo;

import java.util.*;

public class Demo8 {
    public static void main(String[] args){
        // 定义一个ArrayList对象
        ArrayList<Clerk> al= new ArrayList<>();
        System.out.println("al大小是:"+al.size());
        //向al中加入数据(类型是Object
        //创建一个职员
        Clerk clerk1 = new Clerk("宋江",50,1000);
        Clerk clerk2 = new Clerk("沉郁样",45,1800);

        //将clerk1加入到al中
        al.add(clerk1);
        al.add(clerk2);
        System.out.println("al大小是:"+al.size());

        //如何访问al中对象(数据)
        //访问第一个对象
        Clerk temp=al.get(0);
        System.out.println("第一个名字是:"+temp.getName());

        //遍历al中所有的对象
        for (int i=0;i<al.size();i++)
        {
            Clerk temp1 = al.get(i);
            System.out.println("名字="+temp1.getName());
        }
        al.remove(1);
        System.out.println("-----删除------");

    }
}

class Clerk
{
    private String name;
    private int age;

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

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    private float sal;

    public Clerk(String name, int age, float sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }


}
