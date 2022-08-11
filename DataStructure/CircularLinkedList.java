class Node{
    int info;
    Node next;
    public Node(int data){
        this.info=data;
        this.next=null;
    }
}
class CircularList{
    Node head;
    public CircularList(){
	    head=null;
    }
    public void insertFront(int number){
		System.out.println("Inserting data at front : " + number);
		Node node = new Node(number);
		if(head==null){
			head=node;
			node.next=head;
			return;
		}
		if(head.next==head){
			node.next=head;
			head=node;
			node.next.next=head;
			return;
		}
		Node temp=head;
		while(temp.next!=head){
			temp=temp.next;
		}
		node.next=head;
		head=node;
		temp.next=head;
	}
	public void insertBack(int number){
		System.out.println("Inserting data at back  : " + number);
		Node node = new Node(number);
		if(head==null){
			head=node;
			node.next=head;
			return;
		} 		
		if(head.next==head){
			head.next=node;
			node.next=head;
			return;
		}
		Node temp = head;
		while(temp.next!=head){
			temp=temp.next;
		}
		temp.next=node;
		node.next=head;
	}
	public void deleteFront(){
		if(head==null){
			System.out.println("Empty List.");
			return;
		}
		if(head.next==head){
            System.out.println("deleted data from front : " + head.info);
			head=null;
			return;
		}
		Node temp=head;
        System.out.println("deleted data from front : " + head.info);
		while(temp.next!=head){
			temp=temp.next;
		}
		head=head.next;
		temp.next=head;
	}
	public void deleteBack(){
		if(head==null){
			System.out.println("Empty List.");
			return;
		}
		if(head.next==head){
            System.out.println("deleted data from back : " + head.info);
			head=null;
			return;
		}
		Node temp=head;
		while(temp.next.next!=head){
			temp=temp.next;
		}
        System.out.println("deleted data from back : " + temp.next.info);
		temp.next=temp.next.next;
	}
	public void display(){
		System.out.print("List : ");
		if(head==null){
			System.out.println("Empty List.");
			return;
		}
		Node temp=head;
		while(temp.next!=head){
			System.out.print(temp.info + " ");
			temp=temp.next;
		}
		System.out.print(temp.info+" ");
        System.out.println(temp.next.info);
        System.out.println("loop started");
	}
}
public class CircularLinkedList{
	public static void main(String [] args){
		CircularList list = new CircularList();
		list.insertFront(10);
		list.insertBack(12);
		list.insertFront(8);
		list.insertBack(14);

		list.display();

		list.deleteFront();
		list.display();

		list.deleteBack();
		list.display();
		list.deleteFront();
		list.deleteBack();
		list.display();
	}
}

		

			
		