
package balonpatlat;

import java.util.Scanner;

public class BalonPatlat {

    
    public static void main(String[] args) {
        Balon b=new Balon();
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        int n=input.nextInt();
        System.out.print("k sayisini giriniz : ");
        int k=input.nextInt();
        b.setBalonSayisi(n+1);
        b.balonEkle();
        b.display();
        b.setCountNum(k-1);
        b.patlat();
    }
    
}
