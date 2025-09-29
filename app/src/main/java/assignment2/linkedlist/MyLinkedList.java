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
    }

    public void removeNode(int deleteValue) {
        // Check first node
        if (head == null) {
            // Or throw error?
            return;
        }
        if (head.value == deleteValue) {
            head = head.nextNode;
            listSize--;
            return;
        }
        // Check the rest of the nodes after head
        MyNode firstNodeToConnect = head;
        while (firstNodeToConnect.nextNode != null && firstNodeToConnect.nextNode.value != deleteValue) {
            firstNodeToConnect = firstNodeToConnect.nextNode;
        }
        if (firstNodeToConnect.nextNode != null) {
            firstNodeToConnect.nextNode = firstNodeToConnect.nextNode.nextNode;
            listSize--;
            return;
        }
        // Add a throw or return a boolean instead of "failing silently" when the number
        // is not in the list?
    }

    public int getSize() {
        return listSize;
    }

    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        MyNode nodeValue = head;
        while (nodeValue != null) {
            stringBuilder.append(nodeValue.value);
            nodeValue = nodeValue.nextNode;
            if (nodeValue != null)
                stringBuilder.append(", ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        System.out.println(myLinkedList.isEmpty());
        for (int i = 0; i < 10; i++) {
            myLinkedList.addNode(i);
        }
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());
        myLinkedList.removeNode(5);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList.isEmpty());
    }
}
