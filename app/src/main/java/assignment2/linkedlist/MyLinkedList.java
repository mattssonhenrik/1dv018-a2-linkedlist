package assignment2.linkedlist;

public class MyLinkedList {
    MyNode head;
    int listSize;

    public MyLinkedList() {
        this.head = null;
    }

    public void addNode(int nodeValue) {
        MyNode newNode = new MyNode(nodeValue);
        if (head == null) {
            head = newNode;
            listSize++;
        } else {
            MyNode currentLastNode = head;
            while (currentLastNode.nextNode != null) {
                currentLastNode = currentLastNode.nextNode;
            }
            currentLastNode.nextNode = newNode;
            listSize++;
        }

        // } else if (head.nextNode == null) {
        // head.nextNode = newNode;
        // } else if (head.nextNode != null) {
        // MyNode nextNodeInLine = head.nextNode;
        // while (nextNodeInLine.nextNode != null) {
        // nextNodeInLine = nextNodeInLine.nextNode;
        // }
        // nextNodeInLine = newNode.nextNode;
        // }
        // return newNode;
    }

    /// FLYtta till en app kanske igen?
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        System.out.println(linkedList.toString());
        System.out.println("Is this running?");
    }
}
