package linkedlist;

public class LLNode {
    int data;
    LLNode next;

    LLNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class llist {
    LLNode head;

    void insert(int data) {
        LLNode NewNode = new LLNode(data);
        if (head == null) {
            head = NewNode;
            return;
        }
        LLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = NewNode;
    }

    void display() {
        LLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NUll");
    }

    public static void main(String[] args) {
        llist list = new  llist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();

    }
}


