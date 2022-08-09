package DataStructure;
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
class Stack {  
    Node head;
    public Stack() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void push(int info) {
        Node p = new Node(info);
        if(isEmpty()) 
            head = p;
        else {
            p.next = head; 
            head = p;
        }
    }
    public void pop() {
        if(isEmpty())
            System.out.println("Empty");
        else{    
            int info = head.info;
            head = head.next;
            System.out.println(info);
        }
    }
    public void top() {
        if(isEmpty())
            System.out.println("Empty");
        else{    
            int info = head.info;
            System.out.println(info);
        }
    }
    public void clear() {
        head = null;
    }
}
public class StackMain {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.top();
        st.push(10);
        st.top();
        st.push(20);
        st.push(30);
        st.top();
        st.pop();
        st.top();
        st.push(40);
        st.clear();
        st.top();
    }
}