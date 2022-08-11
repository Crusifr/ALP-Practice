import java.util.LinkedList;
import java.util.Queue;
public class StackUsing2Queue {
  Queue<Integer> q1 = new LinkedList<>();
  Queue<Integer> q2= new LinkedList<>();
  int size;
  public StackUsing2Queue() {
    size = 0;
  }
  public int size() {
    return size;
  }

  public int top() {
    while (q1.size() > 1) {
      q2.add(q1.poll());
    }
    int val = q1.poll();
    q2.add(val);

    Queue<Integer> temp = q2;
    q2 = q1;
    q1 = temp;

    return val;
  }

  public void push(int elem) {
    q1.add(elem);
    size++;
  }

  public int pop() {
    while (q1.size() > 1) {
      q2.add(q1.poll());
    }
    int val = q1.poll();

    Queue<Integer> temp = q2;
    q2 = q1;
    q1 = temp;

    size--;
    return val;
  }

  public static void main(String[] args) {
    StackUsing2Queue st = new StackUsing2Queue();
    int array[] = { 10, 20, 30, 40, 50 };

    for (int x : array) st.push(x);

    System.out.println("size " + st.size());
    System.out.println("Peek Value " + st.top());
    System.out.println("Pop " + st.pop());
    System.out.println("Pop " + st.pop());
    System.out.println("size " + st.size());
    st.push(45);
    System.out.println("Peek Value " + st.top());
  }
}
