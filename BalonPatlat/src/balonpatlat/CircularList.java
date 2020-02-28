
package balonpatlat;

public class CircularList {
    private Node first;
    private Node last;
    private Node current;
    private int count;  //count=k-1 
    public CircularList getCurrent;

    public CircularList() {
        first = null;
        last = null;
        current = null;
        count = 0;
    }

    public void step() { //bir sonraki adima gecmek icin
        current = current.next;
    }

    public Node getCurrent() {
        return current;
    }

    public Node getFirst() {
        return first;
    }

    public void insert(int x) {
        Node newNode = new Node(x);

        if (first==null) {
            first = newNode;
            current = first;
        } 
        else {
            current.next = newNode;
        }

        newNode.next = first;
        last = newNode;
        step();
        count++;
    }


    public void delete(int x) {
        Node prev = first;
        Node curr = first.next;

        while (curr.iData != x) {
            prev = curr;
            curr = curr.next;
        }

        if (count == 1) {
            first = null;
            count--;
        } else if (curr == first) {
            prev.next = curr.next;
            first = curr.next;
            count--;
        } else {
            prev.next = curr.next;
            count--;
        }

    }

    public void displayList() {
        int x = 0;
        Node printer = first;

        while (x < count) {
            printer.displayNode();
            printer = printer.next;
            x++;
        }
        System.out.println("");

    }
    
}
class Node{
    public int iData;
    public Node next;

    public Node(int x) {
        iData = x;
    }

    public void displayNode() {
        System.out.print(iData + " ");

    }
}