/**
 * 线程demo
 * 2017.9.21
 * 两种方法,继承Thread或实现Runnable
 * Thread本身就实现了Runnable接口
 * 尽可能使用实现Runnable几口来创建线程
 */
package cyy.thread;

public class Demo1 {
    public static void main(String[] args){
        Pig pig=new Pig(10);
        Bird bird = new Bird(10);
        Thread t1 = new Thread(pig);
        Thread t2 = new Thread(bird);
        t1.start();
        t2.start();
    }
}

class Bird implements Runnable
{
    int n=0;
    int res=0;
    int times=0;
    public Bird(int n)
    {
        this.n=n;
    }
    @Override
    public void run(){
        while(true)
        {
            try{
                Thread.sleep(1000);
            }catch(Exception e)
            {

            }

            res+=(++times);
            System.out.println("当前结果是"+res);
            if(times==n)
            {
                System.out.println("最后结果是"+res);
                break;
            }

        }
    }
}

class Pig implements  Runnable
{
    int n=0;
    int times=0;
    public Pig(int n)
    {
        this.n=n;
    }
    @Override
    public void run()
    {
        while(true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            times++;
            System.out.println("我是一个线程,在输出第"+times+"个hello world");
        }


    }
}