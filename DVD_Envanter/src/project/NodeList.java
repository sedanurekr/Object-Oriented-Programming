 
package project;


public class NodeList {
    private Node Head, Tail;

    public NodeList() {
        this.Head = null;
        this.Tail = null;
    }

    public Node getHead() {
        return Head;
    }

    public void setHead(Node Head) {
        this.Head = Head;
    }

    public Node getTail() {
        return Tail;
    }

    public void setTail(Node Tail) {
        this.Tail = Tail;
    }
    
    public void add(Node node) {
        Node temp;
        if(this.Head == null){ //hic dugum yoksa direkt ekliyor
            this.Head = node;
        } 
        else {
            if(this.Tail == null) {
                if(this.Head.getData().getAdSoyad().compareToIgnoreCase(node.getData().getAdSoyad()) > 0) {  //basa ekleme olasiligi
                    this.Tail = this.Head;
                    this.Tail.setPrevious(node);
                    this.Head = node;
                    this.Head.setNext(this.Tail);
                } 
                //eger isimler ayni ise tarihi once olani daha once ekliyor
                else if(this.Head.getData().getAdSoyad().compareToIgnoreCase(node.getData().getAdSoyad()) == 0) {
                    if(this.Head.getData().getTarih() < node.getData().getTarih()) {
                        this.Tail = node;
                        this.Tail.setPrevious(this.Head);
                        this.Head.setNext(this.Tail);
                    } 
                    else { //tarihler de ayni ise arkasina ekliyor
                        this.Tail = this.Head;
                        this.Tail.setPrevious(node);
                        this.Head = node;
                        this.Head.setNext(this.Tail);
                    }
                } 
                else {
                    this.Tail = node;
                    this.Tail.setPrevious(this.Head);
                    this.Head.setNext(this.Tail);
                }
            } 
            else{ //araya ekleme 
                if(this.Head.getData().getAdSoyad().compareToIgnoreCase(node.getData().getAdSoyad()) > 0) {
                    node.setNext(this.Head);
                    this.Head.setPrevious(node);
                    this.Head = node;

                } 
                else if(this.Tail.getData().getAdSoyad().compareToIgnoreCase(node.getData().getAdSoyad()) < 0) {
                    node.setPrevious(this.Tail);
                    this.Tail.setNext(node);
                    this.Tail = node;
                } 
                else{
                    temp = this.Head;
                    while(true) {
                        temp = temp.getNext();
                        if(node.getData().getAdSoyad().compareToIgnoreCase(temp.getData().getAdSoyad()) == 0) {
                            while(true) {
                                if((node.getData().getAdSoyad().compareToIgnoreCase(temp.getData().getAdSoyad()) == 0 && node.getData().getTarih() < temp.getData().getTarih()) || 
                                        (node.getData().getAdSoyad().compareToIgnoreCase(temp.getData().getAdSoyad()) < 0)) {
                                    node.setNext(temp);
                                    node.setPrevious(temp.getPrevious());
                                    temp.getPrevious().setNext(node);
                                    temp.setPrevious(node);
                                    break;
                                }
                                temp = temp.getNext();
                            }
                            break;
                        } 
                        else if(node.getData().getAdSoyad().compareToIgnoreCase(temp.getData().getAdSoyad()) < 0) {
                            node.setNext(temp);
                            node.setPrevious(temp.getPrevious());
                            temp.getPrevious().setNext(node);
                            temp.setPrevious(node);
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public boolean isEmpty() {  //boş olup olmadiğini konrol etmek icin
        return Head == null;
    }
    
}
