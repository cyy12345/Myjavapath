package cyy.demo;

import java.util.LinkedList;

public class Demo10 {
    public static void main(String[] args)
    {
        LinkedList<Emp> ll=new LinkedList();
        Emp emp1 = new Emp("cyy123","cyy",123f);
        Emp emp2 = new Emp("cyy124","cy",213f);
        ll.addFirst(emp1);
        ll.addFirst(emp2);
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i).getName());
        }
    }
}
