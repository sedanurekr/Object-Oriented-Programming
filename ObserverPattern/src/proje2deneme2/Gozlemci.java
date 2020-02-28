
package proje2deneme2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Gozlemci extends Observer {
    
    private String name;
    public List<String> hisse;
    public Gozlemci( String name){
      this.name = name;
      this.hisse = new ArrayList();
   }
    public void insertHisse(String s) {
        this.hisse.add(s);
    }

    public List<String> getHisse() {
        return hisse;
    }

    public void setHisse(List<String> hisse) {
        this.hisse = hisse;
    }
    
    
   @Override
   public void guncelSonuc(ArrayList liste) {
       try{
            File dosya = new File("sonuc.txt");
            FileWriter yazici = new FileWriter(dosya,true);
            BufferedWriter yaz = new BufferedWriter(yazici);
            yaz.write("     Observer " +  this.name +"  --->   \n" + liste.get(0) + " Hisse senedi degeri: " + liste.get(1)+" olarak guncellendi.   ");
            yaz.close();
            }
            catch (IOException hata){
                  System.out.println("hata olustu");
            }
       
     }
   
    
}
 