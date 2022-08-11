class Node {
  int info;
  Node next;

  Node(int info, Node next) {
    this.info = info;
    this.next = next;
  }

  Node(int info) {
    this(info, null);
  }
}

class List1 {
  Node head, tail;

  public List1() {
    head = tail = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void addLast(int x) {
    Node p = new Node(x);
    if (isEmpty()) {
      head = tail = p;
    } else {
      tail.next = p;
      tail = p;
    }
  }

  public void addFirst(int x) {
    Node p = new Node(x);
    if (isEmpty()) {
      head = tail = p;
    } else {
      p.next = head;
      head = p;
    }
  }

  public void display() {
    Node p = head;
    while (p != null) {
      System.out.print(p.info + "  ");
      p = p.next;
    }
    System.out.println("");
  }

  public int size() {
    Node p = head;
    int c = 0;
    while (p != null) {
      c++;
      p = p.next;
    }
    return c;
  }

  void dele(Node q) {
    Node f, p;
    f = null;
    p = head;
    while (p != null) {
      if (p == q) break;
      f = p;
      p = p.next;
    }
    if (p == null) return;
    if (f == null) {
      head = head.next;
      if (head == null) tail = null;
      return;
    }
    f.next = p.next;
    if (f.next == null) tail = f;
  }

  public void remove(int p) {
    Node f = head, q = null;
    while (f != null && f.info != p) {
      q = f;
      f = f.next;
    }
    if (f == null) System.out.println("Failed to find a match"); else {
      if (q == null) {
        head = head.next;
        if (head == null) tail = null;
      } else {
        q.next = f.next;
        if (f == tail) tail = q;
      }
      f.next = null;
    }
  }
}

public class LinkedList {

  public static void main(String[] args) {
    List1 m = new List1();
    m.addLast(10);
    m.addLast(30);
    m.addFirst(60);
    m.display();
    m.dele(m.head);
    m.display();
    m.remove(20);
    m.remove(30);
    m.display();
    m.addFirst(40);
    m.addLast(70);
    m.addFirst(50);
    m.display();
  }
}
