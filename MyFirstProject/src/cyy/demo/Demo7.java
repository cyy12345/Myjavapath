package cyy.demo;

import java.io.FileReader;

public class Demo7 {
    public static void main(String[] args) throws Exception{
        Father father = new Father();
        father.test1();

    }
}
class Father
{
    private  Son son = null;
    public Father()
    {
        son=new Son();

    }
    public void test1() throws Exception
    {

            son.test2();

    }
}
class Son{
    public void test2() throws Exception
    {
        FileReader fr = null;
        fr=new FileReader("/home/cyy/tet.txt");
    }
}
