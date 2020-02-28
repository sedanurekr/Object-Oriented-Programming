
package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Method {
    public static NodeList CreateList() {  //dosyayi okuyup linked list olusturan metot
        Scanner fileIn;
        String line;
        DVD temp;
        NodeList nodeList = new NodeList();
        try{
            fileIn=new Scanner(new FileInputStream("bilgiler.txt")); 
            while(fileIn.hasNext()){
                line=fileIn.nextLine();
                StringTokenizer st =new StringTokenizer(line, ",");
                //dosyadaki satirda ilk dort eleman adSoyad, baslik, tarih, fiyat
                temp = new DVD(st.nextToken().trim(),st.nextToken().trim(),Integer.parseInt(st.nextToken().trim()),Integer.parseInt(st.nextToken().trim()));
                //sonra sarkilari bolerek listeye atiyoruz.
                while(st.hasMoreTokens()){ 
                      temp.addListe(st.nextToken().trim());
                }
                nodeList.add(new Node(temp));
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Dosya bulunamadi");
        }
        return nodeList;
    }
    
    public static String ListeleAZ(NodeList nodeList) {  //A'dan Z'ye listeler
        String sonuc = "";
        Node temp = nodeList.getHead();
        while(temp != null) {
            sonuc += temp.getData() + "\n";
            temp = temp.getNext();
        }
        return sonuc;
    }
    public static String ListeleZA(NodeList nodeList) { //tersten Listeler
        String sonuc = "";
        Node temp = nodeList.getTail();
        while(temp != null) {
            sonuc += temp.getData() + "\n";
            temp = temp.getPrevious();
        }
        return sonuc;
    }
    
    public static void DVDEkle(NodeList nodeList){
        DVD newData=new DVD();
        int answer=JOptionPane.showConfirmDialog(null,"Yeni DVD eklemek ister misiniz? ");
        while(answer==JOptionPane.YES_OPTION){
            String newName=JOptionPane.showInputDialog("Sarkici adi giriniz :");
            newData.setAdSoyad(newName);
            String newTitle=JOptionPane.showInputDialog("DVD basligi giriniz : ");
            newData.setBaslik(newTitle);
            String newDate=JOptionPane.showInputDialog("DVD'nin cikis tarihini giriniz : ");
            newData.setTarih(Integer.parseInt(newDate));
            String newCoast=JOptionPane.showInputDialog("DVD fiyatini giriniz : ");
            newData.setFiyat(Integer.parseInt(newCoast)); 
            String sarki=JOptionPane.showInputDialog("Sarkilari aralarina virgül koyarak giriniz : ");
            StringTokenizer st =new StringTokenizer(sarki, ",");
            while(st.hasMoreTokens()){ 
                      newData.addListe(st.nextToken().trim());
                }
            
            
            nodeList.add(new Node(newData));   
            answer=JOptionPane.showConfirmDialog(null,"Yeni DVD eklemek ister misiniz?");
            if(answer==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Kayit eklenmiştir.");
               
            }
        }
    }
    
    public static void DVDSil(NodeList nodeList, Node node){
        String baslik=JOptionPane.showInputDialog("Silmek istediginiz DVD'in basligini giriniz : ");
        String isimSoyisim=JOptionPane.showInputDialog("Ad soyad giriniz : ");
        Node temp=nodeList.getHead();
        while(temp!=null){
            if(temp.getData().getAdSoyad().equals(isimSoyisim)&&temp.getData().getBaslik().equals(baslik) ){                
                break;
            }
            temp=temp.getNext();
        }       
        if(temp==null){//aranilan DVD bulunmazsa hata mesaji key sensitive vardır!!
            JOptionPane.showMessageDialog(null, "Aradiginiz DVD bulunamadi");
        }
        else{
            if(temp==nodeList.getHead()){
                if(nodeList.getHead()==nodeList.getTail()){//silinecek eleman ilk ve son elemansa ilk ve son eleman null olur
                    nodeList.setHead(null);
                    nodeList.setTail(null);
                }
                else{    //silinecek eleman ilk eleman ve baska elemanda var ise ilk eleman ikinci eleman yapilir ve ilk elemandan önceki yani eski ilk eleman null olur 
                 nodeList.setHead(temp.getNext());
                nodeList.getHead().setPrevious(null);
               }
            }
            else{
                if(temp==nodeList.getTail()){//son eleman ise son sonun oncesi olur sonun sonrasida null olur
                    nodeList.setTail(temp.getPrevious());
                    nodeList.getTail().setNext(null);
                }
                else{
                    temp.getPrevious().setNext(temp.getNext());//aradaki eeleman silinecek ise oncesi ve sonrasi birbirine baglanir
                    temp.getNext().setPrevious(temp.getPrevious());
                }
            }
            JOptionPane.showMessageDialog(null,temp.getData().getAdSoyad()+" sanatcisina ait "+ temp.getData().getBaslik()+" adlı DVD  silindi");
        }
    }
    
    public static NodeList goster2000(NodeList nodeList){  //2000 yilindan once cikmis DVD leri yazdirir
        Node temp=nodeList.getHead();
        NodeList otherList=new NodeList();
        while(temp!=null){
            if(temp.getData().getTarih()<2000){
            otherList.add(new Node(temp.getData()));
            }
            temp=temp.getNext();
              
        } 
        return otherList;
    }
    
    public static void Cikis(NodeList nodeList) throws IOException{ //Cikis icin yapialn islemler son olarak dosyaya kaydedilir ve cikilir.
        FileWriter writer=new FileWriter("bilgiler.txt");
        try{
            writer.write(Method.ListeleAZ(nodeList));
            writer.close();
            JOptionPane.showMessageDialog(null, "Envanter kaydedilmistir, iyi gunler.");
            System.exit(0);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e+"");
            
        }
    }
}
