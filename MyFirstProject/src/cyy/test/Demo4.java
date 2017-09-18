/*
测试内部类
作者:CYY 2017.9.8
 */

package cyy.test;

public class Demo4 {
    public static void main(String[] args)
    {
        Parcel p=new Parcel();
        p.testShip();

        Parcel.Contents c=p.new Contents(33);
        Parcel.Destination d=p.new Destination("Hawaii");
        p.setProperty(c,d);
        p.ship();

    }
}

class Parcel{
    private Contents c;
    private Destination d;
    class Contents{
        private int i;
        Contents(int i) {this.i=i;}
        int value(){return i;}
    }
    class Destination{
        private String label;
        Destination(String WhereTo){
            label=WhereTo;
        }
        String readLabel(){return label;}
    }
    void setProperty(Contents c,Destination d){
        this.c=c;this.d=d;
    }
    void ship(){
        System.out.println("move "+c.value()+" to " + d.readLabel());
    }
    public void testShip(){
        c=new Contents(22);
        d=new Destination("Beijing");
        ship();
    }
}