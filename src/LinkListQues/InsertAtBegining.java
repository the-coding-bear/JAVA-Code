package LinkListQues;

public class InsertAtBegining {
     class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }
        public Node insertAtBegining(Node head, int x) {
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
            return head;
        }

        public static void main(String[] args) {
            InsertAtBegining solution = new InsertAtBegining();

            Node head = null; // Initially, the list is empty

            // Insert some nodes at the beginning
            head = solution.insertAtBegining(head, 10);
            head = solution.insertAtBegining(head, 20);
            head = solution.insertAtBegining(head, 30);
            head = solution.insertAtBegining(head, 50);

            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

