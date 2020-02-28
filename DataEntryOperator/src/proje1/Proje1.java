
package proje1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Proje1 {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner fileIn=null;
        List<Text> list = new ArrayList<Text>(); //girdi dosyalarını içerir
        List<String> list2 = new ArrayList<String>(); //words dosyasını içerir
        DataEntryOperator yazar = new DataEntryOperator();
        String[] result;
        String content;
        try{
            int count = 1;
            String line;
            while(true) {
                fileIn=new Scanner(new FileInputStream("girdi0" + count + ".txt"));
                boolean istext = false;
                content = "";
                while(fileIn.hasNextLine()) {
                     line = fileIn.nextLine();
                    if(!istext) {
                        result = line.trim().split(",");
                        
                        yazar = new DataEntryOperator(Integer.parseInt(result[0]), result[1], result[2]);
                        istext = true;
                    } else {
                        content += line;
                    } 
                }
                list.add(new Text(yazar, content));
                
                count++;    
            }     
        }
        catch(FileNotFoundException e){
            if(list==null){
                System.out.println("hata bulundu");
            }    
        }
       
        
        System.out.println("Girdi dosyalarının içerikleri ve yazarları hakkında bilgiler :\n ");
        for(Text t : list){
            System.out.println(t.getContent());
            System.out.println(t.getYazar());
            System.out.println();
        }
        
        
        
        
        Scanner fileIn2=null;
        try{
            fileIn2=new Scanner(new FileInputStream("words.txt"));
            String word;
            while(fileIn2.hasNextLine()) {
                word= fileIn2.nextLine();
                String kelime=word.trim(); //anlamsız boşlukları silmek için
                list2.add(kelime);
                
                
            }      
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            System.exit(0);
        }
        
        /*
        for(String s : list2){ //words dosyasını yazdırıyor
            System.out.println(s);
        }*/
        
        
        int dizi[][]=new int[3][4];
        List<String> splited;
        for(Text t : list) {
            splited = Methods.kelimeBol(t);
            Methods.hataBul(list2, splited, t);
            dizi[0][0] += splited.size();  //toplam kelime sayısı
            dizi[0][1] += splited.size()-t.getHatalıK().size(); //toplam doğru kelime sayısı
            dizi[0][2] +=  t.getHatalıK().size(); //toplam hatalı kelime sayısı
            dizi[0][3] += t.getDüzeltilmis().size(); //toplam düzeltilmiş kelime sayısı
            if("MuhendislikFakultesi".equals(t.getYazar().getDepartman())) { //Mühendislik fakultesi için
                dizi[1][0] += splited.size();  //toplam kelime sayısı
                dizi[1][1] += splited.size()-t.getHatalıK().size();  //toplam doğru kelime sayısı
                dizi[1][2] +=  t.getHatalıK().size(); //toplam hatalı kelime sayısı
                dizi[1][3] += t.getDüzeltilmis().size(); //toplam düzeltilmiş kelime sayısı
            } 
            else if("TipFakultesi".equals(t.getYazar().getDepartman())) {  //Tıp Fakultesi için
                dizi[2][0] += splited.size(); //toplam kelime sayısı
                dizi[2][1] += splited.size()-t.getHatalıK().size(); //toplam doğru kelime sayısı
                dizi[2][2] +=  t.getHatalıK().size(); //toplam hatalı kelime sayısı
                dizi[2][3] += t.getDüzeltilmis().size(); //toplam düzeltilmiş kelime sayısı
            }
        }
        System.out.println("Toplam kelime sayısı : "+dizi[0][0]);
        System.out.println("Toplam doğru kelime sayısı : "+dizi[0][1]);
        System.out.println("Toplam düzeltilen kelime sayısı : "+dizi[0][3]);
        System.out.println("Toplam hatalı kelime sayısı : "+dizi[0][2]);
        System.out.println("Algoritmanın başarı oranı: " + (double)dizi[0][3] / dizi[0][2]);
        System.out.println("Muhendislik Fakultesindeki veri giriş operatorlerinin doğru yazma oranı " + (double)dizi[1][1] / dizi[1][0]);
        System.out.println("Tıp Fakultesindeki veri giriş operatörlerinin hatalı yazma oranı " + (double)dizi[2][2] / dizi[2][0]);
       
        }
    }
    
    
    

