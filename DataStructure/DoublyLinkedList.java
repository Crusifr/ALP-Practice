class Node1 {
  int key;
  Node1 next;
  Node1 prev;
  public Node1(int info) {
    this.key = info;
    this.next = null;
    this.prev = null;
  }
}
class DoublyList {
  Node1 head;
  Node1 tail;
  int size;
  public DoublyList() {
    head = null;
    tail = null;
    size = 0;
  }
  public void insertFirst(int info) {
    System.out.println("Inserting info at front : " + info);
    Node1 node1 = new Node1(info);
    if (head == null && tail == null) {
      head = node1;
      tail = node1;
      size++;
      return;
    }
    node1.next = head;
    head.prev = node1;
    head = node1;
    size++;
  }
  public void insertLast(int info) {
    System.out.println("Inserting info at back  : " + info);
    Node1 node1 = new Node1(info);
    if (tail == null && head == null) {
      head = node1;
      tail = node1;
      size++;
      return;
    }
    tail.next = node1;
    node1.prev = tail;
    tail = node1;
    size++;
  }
  public void deleteFirst() {
    System.out.println("deleteFirst Operation.");
    if (head == null && tail == null) {
      System.out.println("List is empty!");
    }
    if (head == tail) {
      head = null;
      tail = null;
      size--;
      return;
    }
    head.next.prev = null;
    head = head.next;
    size--;
  }

  public void deleteLast() {
    System.out.println("PopBack Operation.");
    if (head == null && tail == null) {
      System.out.println("List is empty!");
    }
    if (head == tail) {
      head = null;
      tail = null;
      size--;
      return;
    }
    tail.prev.next = null;
    tail = tail.prev;
    size--;
  }

  public int peekFirst() {
    if (head == null) {
      System.out.println("List is empty!");
    }
    return head.key;
  }

  public int peekLast() {
    if (tail == null) {
      System.out.println("List is empty!");
    }
    return tail.key;
  }

  public int size() {
    return size;
  }

  public void straightDisplay() {
    System.out.print("List : ");
    Node1 temp = head;
    if (temp == null) {
      System.out.println("List is empty!");
    }
    while (temp != null) {
      System.out.print(temp.key + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public void reverseDisplay() {
    System.out.print("Reverse List : ");
    Node1 temp = tail;
    if (temp == null) {
      System.out.println("List is empty!");
    }
    while (temp != null) {
      System.out.print(temp.key + " ");
      temp = temp.prev;
    }
    System.out.println();
  }

  public void remove(int info) {
    System.out.println("Remove info : " + info);
    Node1 temp = head;
    Node1 prevNode1 = null;
    if (temp == null) {
      System.out.println("List is empty!");
    }
    size--;
    if (temp == tail) {
      if (temp.key == info) {
        head = null;
        tail = null;
        return;
      } else {
        System.out.println("info not found");
      }
    }
    if (head.key == info) {
      head = head.next;
      head.prev = null;
      return;
    }
    while (temp != null && temp.key != info) {
      prevNode1 = temp;
      temp = temp.next;
    }
    prevNode1.next = prevNode1.next.next;
    prevNode1.next.prev = prevNode1;
    temp = null;
  }
}

public class DoublyLinkedList {

  public static void main(String[] args) {
    DoublyList list = new DoublyList();
    list.insertLast(10);
    list.insertLast(20);
    list.insertFirst(8);
    list.insertFirst(6);
    list.insertLast(22);
    list.insertLast(16);

    System.out.println("Front element : " + list.peekFirst());
    System.out.println("Last element : " + list.peekLast());
    System.out.println("List size : " + list.size());

    list.straightDisplay();

    list.remove(6);

    list.reverseDisplay();

    list.deleteFirst();

    System.out.println("List size : " + list.size());

    list.straightDisplay();

    list.deleteLast();
    System.out.println("List size : " + list.size());

    list.reverseDisplay();

    list.deleteFirst();

    System.out.println("List size : " + list.size());

    list.straightDisplay();
  }
}
