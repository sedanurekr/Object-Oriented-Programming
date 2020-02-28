
package balonpatlat;


public class Balon {
    private int balonSayisi; 
    private int countNum; // number used for counting off
    private Node head;
    private Node tail;
    CircularList circle;

    public Balon() {
        circle = new CircularList();
        balonSayisi = 0;
        countNum = 0;

    }

    public int getBalonSayisi() {
        return balonSayisi;
    }

    public void setBalonSayisi(int balonSayisi) {
        this.balonSayisi = balonSayisi;
    }

    
    public void setCountNum(int x) {
        countNum = x;
    }

    public int getCountNum() {
        return countNum;
    }

    public void balonEkle() {
        for (int i = 1; i < balonSayisi; i++) {
            circle.insert(i);
        }
    }

    public void move() {

        for (int i = 0; i < countNum; i++) {
            tail = head;
            head = head.next;
        }

        System.out.println("Patlayan Balon Pozisyonu: " + head.iData);

    }

    public void patlat() {
        tail = null;
        head = circle.getFirst();
        while (balonSayisi != 2) {

            move();
            circle.delete(head.iData);
            tail = tail.next;
            head = head.next;
            balonSayisi--;
            display();
        }

    }

    public void display() {
        System.out.print("Kalan Balon:  ");
        circle.displayList();
    }
    
}
