import java.util.Scanner;
class Stac {
  int top;
  int maxsize = 10;
  int[] arr = new int[maxsize];
  boolean isEmpty() {
    return (top < 0);
  }
  Stac() {
    top = -1;
  }
  void push(int n) {
    if (top == maxsize - 1) {
      System.out.println("Overflow");
      return;
    } else {
      top++;
      arr[top] = n;
      return;
    }
  }
  void pop() {
    if (top == -1) {
      System.out.println("Underflow");
      return;
    } else {
      top--;
      System.out.println("Item removed");
      return;
    }
  }
  void display() {
    if (top == -1) {
        System.out.println("Empty");
        return;
    }
    System.out.println("Printing Stack elements");
    for (int i = top; i >= 0; i--) {
      System.out.println(arr[i]);
    }
  }
}
public class Stack{
  public static void main(String[] args) {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    Stac s = new Stac();
    while (choice != 4) {
      System.out.println("\nChose");
      System.out.println("1.Push\n2.Pop\n3.Show\n4.Exit");
      System.out.println("Enter your choice");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          {
            System.out.println("Enter Number");
            int n=sc.nextInt();
            s.push(n);
            break;
          }
        case 2:
          {
            s.pop();
            break;
          }
        case 3:
          {
            s.display();
            break;
          }
        case 4:
          {
            System.out.println("Exiting");
            System.exit(0);
            break;
          }
        default:
          {
            System.out.println("Wrong choice ");
          }
      }
    }
  }
}
