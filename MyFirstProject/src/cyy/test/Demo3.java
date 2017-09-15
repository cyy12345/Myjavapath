/*
作者:cyy
功能:二分查找
 */

package cyy.test;

public class Demo3 {
    public static void main(String[] args){
        int arr[]={2,5,7,12,25};
        BinaryFind bf = new BinaryFind();
        bf.find(0,arr.length-1,120,arr);
    }
}

class BinaryFind
{
    public void find(int leftIndex,int rightIndex,int val,int arr[])
    {
        //首先找到中间的数
        int midIndex=(rightIndex+leftIndex)/2;
        int midVal=arr[midIndex];
        if (rightIndex>=leftIndex) {
            //如果要找的数比midVal大
            if (midVal > val) {
                find(leftIndex, midIndex - 1, val, arr);
            } else if (midVal < val) {
                find(midIndex + 1, rightIndex, val, arr);
            } else if (midVal == val) {
                System.out.println("找到下标" + midIndex);
            }
        }
    }
}
