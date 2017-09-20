package cyy.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) throws Exception{

        EmpManage em=new EmpManage();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("请选择要进行的操作");

            String operType=br.readLine();

            if(operType.equals("1"))
            {

            }else if(operType.equals("2"))
            {

            }else{

            }
        }
    }
}
//雇员管理类
class EmpManage
{
    private ArrayList<Emp> al=null;
    //构造函数
    public EmpManage()
    {
        al=new ArrayList();
    }
    //加入员工
    public void addEmp(Emp emp)
    {
        al.add(emp);
    }
    //显示员工相关信息
    public void showinfo(String empNo)
    {
        //遍历整个ArrayList
        for(int i=0;i<al.size();i++)
        {
            //取出Emp对象
            Emp emp=al.get(i);

            if(emp.getEmpNo().equals(empNo))
            {
                System.out.println("找到该员工,他的信息是:");
                System.out.println("编号="+empNo);
                System.out.println(("名字:"+emp.getName()));
                System.out.println(("薪水:"+emp.getSal()));
            }
        }
    }

    //修改工资
    public void updateSal(String empNo,float newSal)
    {
        for(int i=0;i<al.size();i++)
        {
            Emp emp=al.get(i);
            if(emp.getEmpNo().equals(empNo))
            {
                emp.setSal(newSal);
            }
        }
    }
    //删除某个员工
    public void delEmp(String empNo)
    {
        for(int i=0;i<al.size();i++)
        {
            Emp emp=al.get(i);
            if(emp.getEmpNo().equals(empNo))
            {
                al.remove(i);
            }
        }
    }
}

//雇员类
class Emp{
    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    private String empNo;
    private String name;
    private float sal;
    public Emp(String empNo, String name, float sal) {
        this.empNo = empNo;
        this.name = name;
        this.sal = sal;
    }
}
