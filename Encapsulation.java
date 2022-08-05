import java.util.Scanner;
public class Encapsulation 
{
  public static void main(String[] args) 
  {
    Encapsulation1 myObj = new Encapsulation1();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name");
    String n = sc.nextLine();
    myObj.setName(n);
    System.out.println(myObj.getName());
  }
}
