package cyy.demo;

public class Demo1 {
    public static void main(String[] args){
        Dog dogs[]=new Dog[4];

        dogs[0].setName("huahua");
        dogs[0].setWeight(3.3f);
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
}
