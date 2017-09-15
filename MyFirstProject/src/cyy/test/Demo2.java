/*
  演示各种排序方法
 */

package cyy.test;

import java.util.Calendar;

public class Demo2 {
    public static void main(String[] args){
        int len=100000000;
        int[] arr1=new int[len];
        for(int i=0;i<len;i++)
        {
            //让程序随机产生一个1-10000的数
            //Math.random()会随机产生0-1的数
            int t=(int)(Math.random()*10000);
        }

        //Bubble bubble=new Bubble();
        InsertSort is=new InsertSort();
        Calendar cal= Calendar.getInstance();
        System.out.println(cal.getTime());
        is.sort(arr1);
        //bubble.sort(arr1);
        cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        //简单数据类型不会变化
        //int a=12;
        //bubble.test(a);
        //System.out.println(a);

        //Select select=new Select();
        //在排序前打印系统时间
        //单态模式,开发者模式,23种模式
        //Calendar cal= Calendar.getInstance();
        //System.out.println(cal.getTime());
        //select.sort(arr1);
        //重新得到实例
        //cal=Calendar.getInstance();
        //System.out.println(cal.getTime());
    }
}
//冒泡排序
//两两比较,小的放前,大的放后,一次內循环可以确定出一个最大的在数组末尾
class Bubble{

    //测试函数
    public void test(int a){
        a++;
    }
    public void sort(int arr[]) {
        int temp = 0;
        //外循环
        for (int i = 0; i < arr.length - 1; i++) {
            //內循环
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }*/
    }
}

//选择排序法
//由第一个开始和后面所有的元素进行比较,选出最小的放到第一个,
//然后是第二个与其后面所有的进行比较,以此类推
class Select
{
    public void sort(int arr[])
    {
        int temp=0;

        for(int j=0;j<arr.length-1;j++) {
            //我认为第一个数就是最小的
            int min = arr[j];
            //记录最小数的下标
            int minIndex = j;

            for (int k = j + 1; k < arr.length; k++) {
                if (min > arr[k])
                //修改最小值
                {
                    min = arr[k];
                    minIndex = k;
                }
            }

            //当推出for就找到这次的最小值
            temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
        }
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }*/
    }
}

//插入排序
class InsertSort
{
    //插入排序方法
    public void sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int insertVal=arr[i];
            int index=i-1;
            while(index>=0&&insertVal<arr[index])
            {
                //把arr[index]向后移动
                arr[index+1]=arr[index];

                index--;
            }
            arr[index+1]=insertVal;
        }
    }
}
//快速排序
//class QuickSort{
//    public void sort(int left,int right,int[] array){
//        int l=left;
//        int r=right;
//    }
//}
//选堆排序法
//二叉树排序法
//合并排序法