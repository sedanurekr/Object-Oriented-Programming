
package project;


public class Node {
    private Node previous, Next;
    private DVD data;

    public Node(Node previous, Node Next, DVD data) {
        this.previous = previous;
        this.Next = Next;
        this.data = data;
    }

    public Node(DVD data) {
        this.data = data;
        this.Next = null;
        this.previous = null;
    }

    public Node() {
        this.data = new DVD();
        this.Next = null;
        this.previous = null;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }

    public DVD getData() {
        return data;
    }

    public void setData(DVD data) {
        this.data = data;
    }
   
    
}
