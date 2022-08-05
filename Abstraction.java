abstract class Tv
{
 Tv()
 {
  System.out.println("Tv is built. ");
 }
 abstract void start();
 void channelChange()
 {
  System.out.println("channelchanged!!");
 }
} 
class LG extends Tv
 {
  void start()
  {
   System.out.println("Tv started");
  }
 }
class Abstraction 
 {
  public static void main (String args[])
  {
   Tv obj = new LG();
   obj.start();
   obj.channelChange();
  }
 }
