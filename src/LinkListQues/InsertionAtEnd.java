package LinkListQues;

public class InsertionAtEnd {
    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }
        Node head;
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        public void printList() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    public static void main(String[] args) {
        InsertionAtEnd linkedList = new InsertionAtEnd();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.printList(); // Output: 1 2 3
    }
}
