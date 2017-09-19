/*
异常
1.检查性异常:java.lang.Exception
2.运行期异常:java.lang.RuntimeException
3.错误:java.lang.Error
 */
package cyy.demo;
import java.io.*;
import java.net.*;
public class Demo6 {
    public static void main(String[] args){
        //1.检查异常  打开文件
        FileReader fr = null;
        try {
            //Socket s=new Socket("192.1681.1.23",78);
            //在出现异常的地方,就终止执行代码
            //然后进入catch
            //如果有多个catch语句,则进入匹配的那个
            System.out.println("go on");
            fr = new FileReader("/home/cyy/test.txt");
        } catch (Exception e) {
            System.out.println("message"+e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("进入finally");
            //这个语句块,不管有没有异常,都会执行
            //一般说,把需要关闭的资源:文件,链接,内存...
            if(fr!=null)
            {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("OK1");


        //2.链接一个192.168.12.12 ip的端口号4567
        //Socket s=new Socket("192.168.1.23",78);

        //运行异常
        //int a=4/0;
        //int arr[]={1,2,3};
        //System.out.println(arr[234]);
    }
}
