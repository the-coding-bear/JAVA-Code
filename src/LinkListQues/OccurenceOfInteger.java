package LinkListQues;

    class  Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
public class OccurenceOfInteger {
    public static int count(Node head,int key){
        Node current=head;
        int count=0;
        while (current!=null){
            if (current.data==key){
                count++;
            }
            current=current.next;
        }return count;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(2);
        head.next.next.next.next= new Node(2);
        head.next.next.next.next.next= new Node(4);
        head.next.next.next.next.next.next= new Node(2);

        int key = 2;
        int count= OccurenceOfInteger.count(head,key);
        System.out.println("Number of Occurences "+key+":"+count);

    }
}
