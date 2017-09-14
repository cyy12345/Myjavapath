package cyy.demo;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* float arr[]=new float[6];

        arr[0]=3;
        arr[1]=5;
        arr[2]=1;
        arr[3]=3.4f;
        arr[4]=2;
        arr[5]=50;

        float all=0;
        for(int i=0;i<6;i++){
            all+=arr[i];
        }

        System.out.println("The sum is "+all);*/
       float arr[]={3,6,7.1f,1.1f,3};
       float all=0;
       for (int i=0;i<arr.length;i++)
       {
           all+=arr[i];
       }
       System.out.println("average time"+(all/arr.length));
    }
}
