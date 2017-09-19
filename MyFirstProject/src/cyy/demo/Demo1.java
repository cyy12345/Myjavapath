package cyy.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Demo1 {
    public static void main(String[] args) throws Exception{
        //
        cyy.demo.Dog dogs[]=new cyy.demo.Dog[4];

        /*dogs[0].setName("huahua");
        dogs[0].setWeight(3.3f);*/
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        for(int i=0;i<4;i++)
        {
            //chong
            dogs[i]=new cyy.demo.Dog();
            System.out.println("Please input dog name:");
            //Read dogs name from console
            String name =br.readLine();
            //Give the name to the dog
            dogs[i].setName(name);
            System.out.println("Please input the weight of the dog");
            String s_weight=br.readLine();
            float weight=Float.parseFloat(s_weight);
            dogs[i].setWeight(weight);
        }
        //calculate the sum of weight
        float allWeight=0;
        for(int i=0;i<4;i++)
        {
            allWeight+=dogs[i].getWeight();
        }
        //calculate the average weight
        float avgWeight=allWeight/dogs.length;
        System.out.println("the sum of weight:"+allWeight+" average weight"+avgWeight);
        float maxWeight=dogs[0].getWeight();
        int maxIndex=0;
        for (int i=1;i<dogs.length;i++)
        {
            if(maxWeight<dogs[i].getWeight())
            {
                maxWeight=dogs[i].getWeight();
                maxIndex=i;
            }
        }
        System.out.println(maxWeight);

        //zi fu chuan nei rong shi fou xiang deng yong  equals bu yao yong ==
    }
}

class Dog
{
    private String name;
    private float weight;
    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(float weight){
        this.weight=weight;
    }
    public float getWeight(){
        return this.weight;
    }
}
