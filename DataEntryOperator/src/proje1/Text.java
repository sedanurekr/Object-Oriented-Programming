
package proje1;

import java.util.ArrayList;
import java.util.List;


public class Text {
    private DataEntryOperator yazar;
    private String content;
    private List<String> hatalıK; //hatalı kelimeleri tutan liste
    private List<String> düzeltilmis; //hatalı kelimenin düzeltilmiş halini tutan liste

    public List<String> getHatalıK() {
        return hatalıK;
    }

    public void setHatalıK(List<String> hatalıK) {
        this.hatalıK = hatalıK;
    }
    
    public void HatalıkEkle(String kelime) {  //hatalı kelimeleri hatalıK listesine ekleyen metot
        this.hatalıK.add(kelime);
    }

    public List<String> getDüzeltilmis() {
        return düzeltilmis;
    }

    public void setDüzeltilmis(List<String> düzeltilmis) {
        this.düzeltilmis = düzeltilmis;
    }
    public void DüzeltilmisEkle(String kelime) {  //düzeltilmiş kelimeleri listeye ekleyen metot
        this.düzeltilmis.add(kelime);
    }
    
    
    public Text(){
        yazar=null;
        content=null;
    }
    
    public Text(DataEntryOperator yazar, String content){
        this.yazar=yazar;
        this.content=content;
        this.hatalıK = new ArrayList<String>();
        this.düzeltilmis = new ArrayList<String>();
    }

    Text(String[] k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DataEntryOperator getYazar() {
        return yazar;
    }

    public void setYazar(DataEntryOperator yazar) {
        this.yazar = yazar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }   
    
}
