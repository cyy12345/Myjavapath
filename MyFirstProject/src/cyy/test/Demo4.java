/*
测试内部类
作者:CYY 2017.9.8
 */

package cyy.test;

public class Demo4 {
    public static void main(String[] args)
    {
        /*Parcel p=new Parcel();
        p.testShip();

        Parcel.Contents c=p.new Contents(33);
        Parcel.Destination d=p.new Destination("Hawaii");
        p.setProperty(c,d);
        p.ship();

        A a=new A();
        A.B b=a.new B();
        b.mb(11);*/
        Outer outer = new Outer();
        outer.makeTheInner(12);

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

class A{
    private int s=111;
    public class B{
        private int s=222;
        public void mb(int s){
            System.out.println(s);
            System.out.println(this.s);
            System.out.println(A.this.s);
        }
    }

}

class Outer{
    private int size = 5;
    public Object makeTheInner(int localVar){
        final int finalLocalVar=99;
        class Inner{
            public String toString(){
                return ("InnerSize: "+size + "finalLocalVar: "+
                finalLocalVar);
            }
        }
        return new Inner();

    }
}