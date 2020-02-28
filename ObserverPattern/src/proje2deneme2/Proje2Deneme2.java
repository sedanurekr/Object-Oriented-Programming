
package proje2deneme2;
import java.util.ArrayList;
import java.util.List;



public class Proje2Deneme2 {

    public static void main(String[] args) {

            //Sirketleri ve hisse senedi degerlerini 2 elemanli liste gibi tutup bunlari
            //yeni bir listeye ekliyorum.
            //yani bütün sirketlerin bilgileri list'de tutuluyor.
            List<ArrayList> list =new ArrayList(); 
            ArrayList a = new ArrayList();
            a.add('A');
            a.add(190);
            list.add(a);
            a =new ArrayList();
            a.add('B');
            a.add(200);
            list.add(a);
            a =new ArrayList();
            a.add('C');
            a.add(250);
            list.add(a);
            a =new ArrayList();
            a.add('D');
            a.add(300);
            list.add(a);
            a =new ArrayList();
            a.add('E');
            a.add(280);
            list.add(a);
            
            Sirketler sirket=new Sirketler(list); //Sirketlerin listesi
       
            Gozlemci g1 = new Gozlemci("A - D gözlemcisi \n"); //A ve D sirketlerini gozlemleyen bir gozlemci olusturdum.
            g1.hisse.add("A");
            g1.hisse.add("D");
            sirket.attach(g1); //olusturdugumuz gozlemciyi sirkete ekledik
            
            Gozlemci g2 = new Gozlemci("B - C gözlemcisi \n"); 
            g2.hisse.add("B");
            g2.hisse.add("C");
            sirket.attach(g2); 
            
            Gozlemci g3 = new Gozlemci("E gözlemcisi \n"); 
            g3.hisse.add("E");
            sirket.attach(g3); 
     

            MyThread yeni = new MyThread(sirket);
            Thread thread1 = new Thread(yeni);
            thread1.start();

        }
  
    }

    
 
           
