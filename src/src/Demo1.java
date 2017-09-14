public class Demo1 {
  public void main(String[] args){
}
}

interface Fish
{
  public void swimming();
}
interface Bird
{
  public void Fly();
}
class Monkey
{
  int name;
  public void jump()
  {
    System.out.println("Monkey can jump");
  }
}
class LittleMonkey extends Monkey implements Fish
{
  public void swimming(){

  }
  public void Fly(){

  }

}
