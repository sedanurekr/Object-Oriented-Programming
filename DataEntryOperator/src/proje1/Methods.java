
package proje1;

import java.util.ArrayList;
import java.util.List;


public class Methods {
    
    
    public static List<String> kelimeBol(Text text){ //contenti kelimelere bölüp listeye ekleyen metot
           List<String> kelimeler = new ArrayList<>();
           String[] k; //kelime dizisi
           k = text.getContent().split(" ");
           for(int i=0; i<k.length; i++){
               kelimeler.add(k[i].replace('.', ' ').replace(',', ' ').replace(';', ' ').replace(':', ' ').replace('?', ' ').replace('!', ' ').trim());
           }
           return kelimeler;
    }
    
    
    //contenti böldüğüm kelimeler listesindeki her bir kelimeyi sözlükle karşılaştırır
    public static void hataBul(List<String> list2, List<String> kelimeler, Text text){
        String kelime2;
        for(int i=0; i<kelimeler.size(); i++){
               kelime2 = kelimeler.get(i);
               kelime2.replace('I', 'i');
               /*eğer sözlükte kelimeyi bulamıyorsa hatalı olarak kabul eder ve
               düzelt metodu ile kelime düzeltir*/
               if(!list2.contains(kelime2.toLowerCase())){
                   duzelt(list2, kelime2, text);
               }
         }
    }
    /*düzelt metodu her bir kelimeyi kendi içinde bölerek sözlükteki kelimeler ile benzerlik 
    oranını karşılaştırır benzerlik oranı fazla olan kelime ile hatalı kelimeyi düzeltir.*/
    private static void duzelt(List<String> list2, String Kelime , Text text){
        int sayac; //benzerlik oranını sayaç ile tutuyoruz
        if(Kelime.length() >= 3) {
            String gecici=""; 
            //benzerlik oranını fazla bulduğu kelimeyi gecici stringinde tutarak hatalı kelime ile değiştirir
        String s1=Kelime.substring(0, Kelime.length()/2);
        String s2=Kelime.substring(Kelime.length()/3, Kelime.length());
        String s3=Kelime.substring(1, Kelime.length()-1);
        for(int j=0; j<list2.size(); j++){
            sayac = 0;
                if(list2.get(j).contains(s1) ){
                    sayac++;
                }
                if(list2.get(j).contains(s2)){
                    sayac++;
                }
                if(list2.get(j).contains(s3)){
                    sayac++;
                }
                if(sayac>=2){ 
                    gecici=list2.get(j);
                    if(sayac == 3) {
                        break;
                    }
                }
        }
        
        text.HatalıkEkle(Kelime);  //hatalı kelimeleri listeye ekliyor
        if(gecici != "") {
            text.DüzeltilmisEkle(gecici); //düzeltilmiş kelimeleri listeye ekliyor
        }
        
        
        }
    }
}
